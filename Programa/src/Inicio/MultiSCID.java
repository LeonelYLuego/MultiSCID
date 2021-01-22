package Inicio;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class MultiSCID extends javax.swing.JFrame{
    
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiSCID.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        String ruta = "/Juanito.txt";
        File archivo = new File(ruta);
        BufferedReader br;
        if (archivo.exists()) {
            try {
                br = new BufferedReader(new FileReader(archivo));
                abrirPrograma(br.readLine());
                br.close();
                return;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error: archivos corrompidos");
            }
        }
        new Programas().setVisible(true);
    }
    
    private static void abrirPrograma(String valor){
        try {
            switch(Integer.parseInt(valor)){
                case 0:
                    new Programa_asistencia.Pantalla_bloqueo().setVisible(true);
                    break;
                case 1:
                    new Programa_biblioteca.Principal().setVisible(true);
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: archivos corrompidos");
        }
    }
}
