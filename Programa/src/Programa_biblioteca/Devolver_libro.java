package Programa_biblioteca;

import Conexion_biblioteca.Arduino;
import Conexion_biblioteca.Conector;
import Conexion_biblioteca.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Devolver_libro extends javax.swing.JDialog {
    
    private PreparedStatement PS;
    private Conector CN;

    public Devolver_libro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        int fheight = this.getHeight();
        int fwidth = this.getWidth();
        setLocation((width - fwidth) / 2, (height - fheight) / 2);
        this.setResizable(false);
        this.setSize(fwidth - 10, fheight - 10);
        this.setTitle("MultiSCID");
        if(Arduino.conexion)
            Arduino.conArduino();
        Arduino.setLbBiblioteca(lbLibroRFID, lbAlumnoRFID);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAlumno = new javax.swing.JLabel();
        lbLibro = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbAlumnoRFID = new javax.swing.JLabel();
        lbLibroRFID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAlumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbAlumno.setText("Alumno:");
        jPanel1.add(lbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lbLibro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbLibro.setText("Libro: ");
        jPanel1.add(lbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(13, 108, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 90, -1));

        btnAceptar.setBackground(new java.awt.Color(13, 108, 140));
        btnAceptar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Pasar libro o credencial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lbAlumnoRFID.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.add(lbAlumnoRFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lbLibroRFID.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.add(lbLibroRFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(lbAlumnoRFID.getText().equals("") || lbLibroRFID.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Favor de pasar libro o credencial");
            return;
        }
        String RFID_alumno = Arduino.Alumno_RFID;
        String RFID_libro = Arduino.Libro_RFID;
        Consultas CS = new Consultas();
        if(CS.consultInt("SELECT COUNT(*) FROM Alumnos WHERE RFID = '" + RFID_alumno + "';") == 0)
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
        else if(CS.consultInt("SELECT COUNT(*) FROM Libros WHERE RFID = '" + RFID_libro + "';") == 0)
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        else if(CS.consultInt("SELECT COUNT(*) FROM Prestamos WHERE Fecha_devolucion IS NULL AND CURP_alumno = (SELECT CURP_alumno FROM Alumnos WHERE RFID = '" + RFID_alumno + "');") == 0)
            JOptionPane.showMessageDialog(null, "El alumno no cuenta con prestamos");
        else if(CS.consultInt("SELECT COUNT(*) FROM Prestamos WHERE Fecha_devolucion IS NULL AND CURP_alumno = (SELECT CURP_alumno FROM Alumnos WHERE RFID = '" + RFID_alumno + "');") > 1)
            JOptionPane.showMessageDialog(null, "Error, pongase en contacto con la administracion");
        else if(CS.consultInt("SELECT COUNT(*) FROM Prestamos WHERE Fecha_devolucion IS NULL AND ID_libro = (SELECT ID_libro FROM Libros WHERE RFID = '" + RFID_libro + "');") == 0)
            JOptionPane.showMessageDialog(null, "El libro no cuenta con prestamos");
        else if(CS.consultInt("SELECT COUNT(*) FROM Prestamos WHERE Fecha_devolucion IS NULL AND ID_libro = (SELECT ID_libro FROM Libros WHERE RFID = '" + RFID_libro + "');") > 1)
            JOptionPane.showMessageDialog(null, "Error, pongase en contacto con la administracion");
        else{
            Date date = new Date();
            int dia = date.getDate();
            int mes = date.getMonth() + 1;
            int año = date.getYear() + 1900;
            String consult = "UPDATE Prestamos SET Fecha_devolucion = '" + año + '-' + mes + '-' + dia + '-' + "' WHERE (Fecha_devolucion IS NULL) AND CURP_alumno = (SELECT CURP_alumno FROM Alumnos WHERE RFID = '" + RFID_alumno + "') "
                    + "AND ID_libro = (SELECT ID_libro FROM Libros WHERE RFID = '" + RFID_libro + "');";
            if(CS.consult(consult)){
                JOptionPane.showMessageDialog(null, "Registro de devolucion realizado con exito");
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Devolver_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Devolver_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Devolver_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Devolver_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Devolver_libro dialog = new Devolver_libro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAlumno;
    private javax.swing.JLabel lbAlumnoRFID;
    private javax.swing.JLabel lbLibro;
    private javax.swing.JLabel lbLibroRFID;
    // End of variables declaration//GEN-END:variables

}
