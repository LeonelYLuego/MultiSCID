package Programa_asistencia;

import Conexion_asistencia.Conector;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hora_salida extends javax.swing.JDialog {
    
    private Conector CN = new Conector();
    private PreparedStatement PS;
    private ResultSet RS;

    public Hora_salida(java.awt.Frame parent, boolean modal) {
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
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes_asistencia/Icono.png")).getImage());
        
        String consult = "SELECT Hora FROM hora_salida WHERE ID_horario = 1;";
        try {
            PS = CN.connectMySQL().prepareStatement(consult);
            RS = PS.executeQuery(consult);
            while(RS.next()){
                lbMatutino.setText("Turno matutino: " + RS.getString(1));
            }
            consult = "SELECT Hora FROM hora_salida WHERE ID_horario = 2;";
            RS = PS.executeQuery(consult);
            while(RS.next()){
                lbVespertino.setText("Turno vespertino: " + RS.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbVespertino = new javax.swing.JLabel();
        lbMatutino = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbTurno = new javax.swing.JComboBox<>();
        spiHora = new javax.swing.JSpinner();
        spiMinuto = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("En esta ventana se modifica la hora limite en la cuál se le dará aviso a los padres de que sus hijos han llegado tarde.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        lbVespertino.setText("Turno vespertino:");
        jPanel1.add(lbVespertino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        lbMatutino.setText("Turno matutino:");
        jPanel1.add(lbMatutino, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, -1, -1));

        jLabel2.setText("Turno");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Matutino", "Vespertino" }));
        jPanel1.add(cmbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, -1, -1));

        spiHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        jPanel1.add(spiHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        spiMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        jPanel1.add(spiMinuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jLabel3.setText("Hora");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jLabel4.setText("Minuto");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(cmbTurno.getSelectedIndex() == 0) return;
        String consult = "UPDATE hora_salida SET Hora = '" + spiHora.getValue() + ":" + spiMinuto.getValue() + ":00' WHERE ID_horario = " + cmbTurno.getSelectedIndex() + ";";
        try {
            PS = CN.connectMySQL().prepareStatement(consult);
            PS.executeUpdate(consult);
            consult = "SELECT Hora FROM hora_salida WHERE ID_horario = 1;";
            PS = CN.connectMySQL().prepareStatement(consult);
            RS = PS.executeQuery(consult);
            while(RS.next()){
                lbMatutino.setText("Turno matutino: " + RS.getString(1));
            }
            consult = "SELECT Hora FROM hora_salida WHERE ID_horario = 2;";
            RS = PS.executeQuery(consult);
            while(RS.next()){
                lbVespertino.setText("Turno vespertino: " + RS.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(Hora_salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hora_salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hora_salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hora_salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Hora_salida dialog = new Hora_salida(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbTurno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMatutino;
    private javax.swing.JLabel lbVespertino;
    private javax.swing.JSpinner spiHora;
    private javax.swing.JSpinner spiMinuto;
    // End of variables declaration//GEN-END:variables

}
