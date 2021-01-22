package Conexion_biblioteca;

import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class Arduino{
    public static boolean conexion = true;
    private static JTextField RFID;
    private static boolean funcion;
    private static JLabel lbLibro, lbAlumno;
    private static Conector CN;
    private static PreparedStatement PS;
    public static String Alumno_RFID;
    public static String Libro_RFID;
    
    public static void setTextField(JTextField txtRFID){
        RFID = txtRFID;
        funcion = false;
    }
    
    public static void setLbBiblioteca(JLabel libro, JLabel alumno){
        lbLibro = libro;
        lbAlumno = alumno;
        funcion = true;
    }
    
    private static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    private static final SerialPortEventListener listener = new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (ino.isMessageAvailable()) {
                    if(funcion){
                        String tarjeta = ino.printMessage();
                        try {
                            String consult = "SELECT Nombre, Apellido_paterno, Apellido_materno FROM Alumnos WHERE RFID = '" + tarjeta + "';";
                            PS = CN.connectMySQL().prepareStatement(consult);
                            ResultSet result = PS.executeQuery(consult);
                            if(result != null){
                                while (result.next()) {
                                    lbAlumno.setText(result.getString(1) + ' ' + result.getString(2) + ' ' + result.getString(3));
                                    Alumno_RFID = tarjeta;
                                }
                            }
                            consult = "SELECT Titulo FROM Libros WHERE RFID = '" + tarjeta + "';";
                            result = PS.executeQuery(consult);
                            if(result != null){
                                while (result.next()) {
                                    lbLibro.setText(result.getString(1));
                                    Libro_RFID = tarjeta;
                                }
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(Arduino.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    else
                        RFID.setText(ino.printMessage());
                }
            } catch (SerialPortException | ArduinoException ex) {
                Logger.getLogger(Arduino.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    };
    
    public static void conArduino(){
        for(int i = 0; i < 9; i++){
            PanamaHitek_Arduino aino = new PanamaHitek_Arduino();
            try {
                aino.arduinoRX("COM" + i, 9600, listener);
                conexion = false;
                aino.killArduinoConnection();
                ino.arduinoRX("COM" + i, 9600, listener);
                break;
            } catch (ArduinoException | SerialPortException ex) {
                conexion = true;
            } 
        }
        if(conexion)
            JOptionPane.showMessageDialog(null, "Error al conectar con sensor RFID");
    }
}
