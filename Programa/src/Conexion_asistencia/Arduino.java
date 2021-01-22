package Conexion_asistencia;

import Programa_asistencia.Agregar_alumno;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;

public class Arduino{
    public static boolean conexion = true;
    private static JTextField RFID;
    
    public static void setTextField(JTextField txtRFID){
        RFID = txtRFID;
    }
    
    private static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
    private static final SerialPortEventListener listener = new SerialPortEventListener(){
        @Override
        public void serialEvent(SerialPortEvent spe) {
            try {
                if (ino.isMessageAvailable()) {
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
            JOptionPane.showMessageDialog(null, "Error al conectar con arduino");
    }
}
