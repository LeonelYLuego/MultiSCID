package Conexion_biblioteca;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Conector {
    private static Connection conectar = null;
    public Conector(){
        conectar = null;
    }
    
    public static Connection connectMySQL(){
        if (conectar == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                conectar = DriverManager.getConnection("jdbc:mysql://localhost/biblioteca?autoReconnect=true&useSSL=false", "root", "");
                if(conectar != null) {
                    //System.out.println ("Conexion establecida");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return conectar;
    }
    public static void disconnectMySQL(){
        if (conectar != null) {
            try {
                conectar.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conector.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Error al desconectar de la base de datos");
            }
            //System.out.println("Desconectado");
            //System.out.println("Desconectado");
        }
    }
}
