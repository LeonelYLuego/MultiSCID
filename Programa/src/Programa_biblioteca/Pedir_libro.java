package Programa_biblioteca;

import Conexion_biblioteca.Arduino;
import Conexion_biblioteca.Conector;
import Conexion_biblioteca.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;

public class Pedir_libro extends javax.swing.JDialog implements Runnable{
    
    private PreparedStatement PS;
    private Conector CN;
    private Thread h1;
    private int seg = 0, min = 0, hora = 0;

    public Pedir_libro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        h1 = new Thread(this);
        h1.start();
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

        panFondo = new javax.swing.JPanel();
        lbAlumno = new javax.swing.JLabel();
        lbLibro = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbAlumnoRFID = new javax.swing.JLabel();
        lbLibroRFID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo.setBackground(new java.awt.Color(255, 255, 255));
        panFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAlumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbAlumno.setText("Alumno:");
        panFondo.add(lbAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        lbLibro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbLibro.setText("Libro: ");
        panFondo.add(lbLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(13, 108, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 90, -1));

        btnAceptar.setBackground(new java.awt.Color(13, 108, 140));
        btnAceptar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panFondo.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel3.setText("Pasar libro o credencial");
        panFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        lbAlumnoRFID.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        panFondo.add(lbAlumnoRFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lbLibroRFID.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        panFondo.add(lbLibroRFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        getContentPane().add(panFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 200));

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
        Consultas CS = new Consultas();
        if(CS.consultInt("SELECT COUNT(*) FROM Alumnos WHERE RFID = '" + Arduino.Alumno_RFID + "';") == 0)
            JOptionPane.showMessageDialog(null, "Alumno no encontrado");
        else if(CS.consultInt("SELECT COUNT(*) FROM Libros WHERE RFID = '" + Arduino.Libro_RFID + "';") == 0)
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        else if(CS.consultInt("SELECT COUNT(*) FROM Prestamos WHERE Fecha_devolucion IS NULL AND CURP_alumno = (SELECT CURP_alumno FROM Alumnos WHERE RFID = '" + Arduino.Alumno_RFID + "');") > 0)
            JOptionPane.showMessageDialog(null, "El alumno ya cuenta con un prestamo");
        else if(CS.consultInt("SELECT COUNT(*) FROM Prestamos WHERE Fecha_devolucion IS NULL AND ID_libro = (SELECT ID_libro FROM Libros WHERE RFID = '" + Arduino.Libro_RFID + "');") > 0)
            JOptionPane.showMessageDialog(null, "El libro ya cuenta con un prestamo");
        else{
            Date date = new Date();
            int dia = date.getDate();
            int mes = date.getMonth() + 1;
            int año = date.getYear() + 1900;
            String consult = "INSERT INTO `prestamos` (`ID_prestamo`, `ID_libro`, `CURP_alumno`, `Fecha_prestamo`, `Fecha_devolucion`, `Tiempo`) VALUES (null, (SELECT ID_libro FROM Libros WHERE RFID = '" + Arduino.Libro_RFID + "'),"
                    + " (SELECT CURP_alumno FROM Alumnos WHERE RFID = '" + Arduino.Alumno_RFID + "'), '" + año + '-' + mes + '-' + dia + "', NULL, '" + hora + ":" + min + ":" + seg + "') ";
            if(CS.consult(consult)){
                JOptionPane.showMessageDialog(null, "Registro de prestamo realizado con exito\nCuenta con 10 días para devolverlo");
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
            java.util.logging.Logger.getLogger(Pedir_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedir_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedir_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedir_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pedir_libro dialog = new Pedir_libro(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lbAlumno;
    private javax.swing.JLabel lbAlumnoRFID;
    private javax.swing.JLabel lbLibro;
    private javax.swing.JLabel lbLibroRFID;
    private javax.swing.JPanel panFondo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
       Thread ct = Thread.currentThread();
        while (ct == h1) {
            if(seg == 59){
                if(min == 59){
                    if(hora == 23)
                        hora = 0;
                    else
                        hora++;
                    min = 0;
                }
                else
                    min++;
                seg = 0;
            }
            else
                seg++;
            System.out.println(hora + ":" + min + ":" + seg);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
