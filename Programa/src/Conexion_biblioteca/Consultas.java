package Conexion_biblioteca;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Consultas {
    private ResultSet RS;
    private PreparedStatement PS;
    private Conector CN;
    
    public Consultas(){
        PS = null;
        CN = new Conector();
    }
    
    public boolean insert(String _insert) {
        try {
            PS = CN.connectMySQL().prepareStatement(_insert);
            int res = PS.executeUpdate();
            if(res > 0){
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return false;
    }
        
    public boolean consult(String _insert) {
        try {
            PS = CN.connectMySQL().prepareStatement(_insert);
            int res = PS.executeUpdate();
            if(res > 0){
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
        return false;
    }
    
    public int consultInt(String _consult){
        int res = -1;
        ResultSet result = null;
        try{
            PS = CN.connectMySQL().prepareStatement(_consult);
            result = PS.executeQuery(_consult);
            if(result != null){
                while (result.next()) {
                    res = result.getInt(1);
                }
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return -1;
        }
        return res;
    }
}
