package Programa_asistencia;

import Conexion_asistencia.Conector;
import Conexion_asistencia.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Agregar_telefono extends javax.swing.JDialog {

    public Agregar_telefono(java.awt.Frame parent, boolean modal) {
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
        
        txtCurpTutor.setEnabled(false);
        txtCurpTutor.setText(Parametros.CURP_tutor);
        txtRequerido4.setVisible(false);
        txtRequerido10.setVisible(false);
        txtRequerido11.setVisible(false);
        txtRequerido12.setVisible(false);
        
        if(Parametros.Comp3){
            btnAgregar.setVisible(false);
            actualizarDatos(Parametros.ID_tel_tutor);
            Parametros.Comp3 = false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLada = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCurpTutor = new javax.swing.JTextField();
        txtLada = new javax.swing.JTextField();
        txtNumero_tel = new javax.swing.JTextField();
        txtTipo_tel = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtRequerido4 = new javax.swing.JLabel();
        txtRequerido10 = new javax.swing.JLabel();
        txtRequerido11 = new javax.swing.JLabel();
        txtRequerido12 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(132, 212, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("CURP:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLada.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLada.setText("Lada:");
        jPanel1.add(jLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Tipo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Numero de telefono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txtCurpTutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpTutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtCurpTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 270, -1));

        txtLada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadaKeyTyped(evt);
            }
        });
        jPanel1.add(txtLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 270, -1));

        txtNumero_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero_telKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumero_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 270, -1));

        txtTipo_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipo_telKeyTyped(evt);
            }
        });
        jPanel1.add(txtTipo_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 270, -1));

        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 90, -1));

        btnAgregar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, -1));

        txtRequerido4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido4.setText("Requerido");
        jPanel1.add(txtRequerido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        txtRequerido10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido10.setText("Requerido");
        jPanel1.add(txtRequerido10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        txtRequerido11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido11.setText("Requerido");
        jPanel1.add(txtRequerido11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        txtRequerido12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido12.setText("Requerido");
        jPanel1.add(txtRequerido12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void actualizarDatos(int ID_tel_tutor){
        String consult = "SELECT * FROM telefonos WHERE ID_tel_tutor = \"" + ID_tel_tutor + "\";";
        Conector CN = new Conector();
        try {
            PreparedStatement PS = CN.connectMySQL().prepareStatement(consult);
            ResultSet result = PS.executeQuery(consult);
            if(result != null){
                while (result.next()) {
                    txtLada.setText(result.getString(2));
                    txtNumero_tel.setText(result.getString(3));
                    txtTipo_tel.setText(result.getString(4));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public boolean validar(){
        boolean c = false;
        if (txtCurpTutor.getText().equals("")) { txtRequerido4.setVisible(true); c = true;} else { txtRequerido4.setVisible(false);};
        if (txtLada.getText().equals("")) { txtRequerido10.setVisible(true); c = true;} else { txtRequerido10.setVisible(false); }
        if (txtNumero_tel.getText().equals("")) { txtRequerido11.setVisible(true); c = true;} else { txtRequerido11.setVisible(false); }
        if (txtTipo_tel.getText().equals("")) { txtRequerido12.setVisible(true); c = true;} else { txtRequerido12.setVisible(false); }
        return c;
    }
    
    private void txtCurpTutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpTutorKeyTyped

    }//GEN-LAST:event_txtCurpTutorKeyTyped

    private void txtLadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtLada.getText().length()>=3)
            evt.consume();
    }//GEN-LAST:event_txtLadaKeyTyped

    private void txtNumero_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero_telKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtNumero_tel.getText().length()>=7)
            evt.consume();
    }//GEN-LAST:event_txtNumero_telKeyTyped

    private void txtTipo_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipo_telKeyTyped
        char c = evt.getKeyChar();
        if (txtTipo_tel.getText().length()>=15)
            evt.consume();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtTipo_telKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            return;
        }
        String CURP_tutor = txtCurpTutor.getText();
        int LADA = Integer.parseInt(txtLada.getText());
        int Numero_tel = Integer.parseInt(txtNumero_tel.getText());
        String Tipo = txtTipo_tel.getText();

        Consultas CN = new Consultas();
        String consult = "INSERT INTO telefonos (ID_tel_tutor, LADA, Numero_tel, Tipo, CURP_tutor) VALUES (null," + LADA +"," + Numero_tel +"," + "\"" + Tipo + "\",\"" + CURP_tutor + "\");";
        if(CN.insert(consult)) JOptionPane.showMessageDialog(null, "Registro exitoso");
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            return;
        }
        String CURP_tutor = txtCurpTutor.getText();
        int LADA = Integer.parseInt(txtLada.getText());
        int Numero_tel = Integer.parseInt(txtNumero_tel.getText());
        String Tipo = txtTipo_tel.getText();

        Consultas CP = new Consultas();
        String consult = "UPDATE telefonos SET LADA = " + LADA + ", Numero_tel = " + Numero_tel + ", Tipo = \"" + Tipo + "\" WHERE ID_tel_tutor = \"" + Parametros.ID_tel_tutor + "\";";
        if(CP.insert(consult)){
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            this.dispose();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_telefono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_telefono dialog = new Agregar_telefono(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLada;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCurpTutor;
    private javax.swing.JTextField txtLada;
    private javax.swing.JTextField txtNumero_tel;
    private javax.swing.JLabel txtRequerido10;
    private javax.swing.JLabel txtRequerido11;
    private javax.swing.JLabel txtRequerido12;
    private javax.swing.JLabel txtRequerido4;
    private javax.swing.JTextField txtTipo_tel;
    // End of variables declaration//GEN-END:variables
}
