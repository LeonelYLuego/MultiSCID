package Programa_asistencia;

import Conexion_asistencia.Conector;
import Conexion_asistencia.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Agregar_direccion extends javax.swing.JDialog {

    public Agregar_direccion(java.awt.Frame parent, boolean modal) {
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
        txtRequerido5.setVisible(false);
        txtRequerido6.setVisible(false);
        txtRequerido7.setVisible(false);
        txtRequerido8.setVisible(false);
        txtRequerido9.setVisible(false);
        txtRequerido10.setVisible(false);
        
        if(Parametros.Comp3){
            btnAgregar.setVisible(false);
            actualizarDatos(Parametros.ID_direccion);
            Parametros.Comp3 = false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo_postal = new javax.swing.JTextField();
        txtCurpTutor = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtCalle = new javax.swing.JTextField();
        txtNum_ext = new javax.swing.JTextField();
        txtNum_int = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtRequerido4 = new javax.swing.JLabel();
        txtRequerido5 = new javax.swing.JLabel();
        txtRequerido6 = new javax.swing.JLabel();
        txtRequerido7 = new javax.swing.JLabel();
        txtRequerido8 = new javax.swing.JLabel();
        txtRequerido9 = new javax.swing.JLabel();
        txtRequerido10 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(132, 212, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("CURP:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Estado:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Colonia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Calle:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Municipio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("No. Exterior:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("No. Interior:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("Codigo postal:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        txtCodigo_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo_postalKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo_postal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 270, -1));

        txtCurpTutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCurpTutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtCurpTutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 270, -1));

        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 270, -1));

        txtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyTyped(evt);
            }
        });
        jPanel1.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 270, -1));

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 270, -1));

        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        jPanel1.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 270, -1));

        txtNum_ext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum_extKeyTyped(evt);
            }
        });
        jPanel1.add(txtNum_ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 270, -1));

        txtNum_int.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum_intKeyTyped(evt);
            }
        });
        jPanel1.add(txtNum_int, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 270, -1));

        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 90, -1));

        btnAgregar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, -1));

        txtRequerido4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido4.setText("Requerido");
        jPanel1.add(txtRequerido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        txtRequerido5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido5.setText("Requerido");
        jPanel1.add(txtRequerido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        txtRequerido6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido6.setText("Requerido");
        jPanel1.add(txtRequerido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        txtRequerido7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido7.setText("Requerido");
        jPanel1.add(txtRequerido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        txtRequerido8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido8.setText("Requerido");
        jPanel1.add(txtRequerido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        txtRequerido9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido9.setText("Requerido");
        jPanel1.add(txtRequerido9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        txtRequerido10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido10.setText("Requerido");
        jPanel1.add(txtRequerido10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        btnActualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void actualizarDatos(int ID_direccion){
        String consult = "SELECT * FROM direccion_vivienda WHERE ID_direccion = \"" + ID_direccion + "\";";
        Conector CN = new Conector();
        try {
            PreparedStatement PS = CN.connectMySQL().prepareStatement(consult);
            ResultSet result = PS.executeQuery(consult);
            if(result != null){
                while (result.next()) {
                    txtEstado.setText(result.getString(2));;
                    txtMunicipio.setText(result.getString(3));
                    txtColonia.setText(result.getString(4));
                    txtCalle.setText(result.getString(5));
                    if(result.getString(6) != null)
                        txtNum_ext.setText(result.getString(6));
                    txtNum_int.setText(result.getString(7));
                    txtCodigo_postal.setText(result.getString(8));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    boolean validar(){
        boolean c = false;
        if (txtCurpTutor.getText().equals("")) { txtRequerido4.setVisible(true); c = true;} else { txtRequerido4.setVisible(false);};
        if (txtEstado.getText().equals("")) { txtRequerido5.setVisible(true); c = true;} else { txtRequerido5.setVisible(false); }
        if (txtMunicipio.getText().equals("")) { txtRequerido6.setVisible(true); c = true;} else { txtRequerido6.setVisible(false); }
        if (txtColonia.getText().equals("")) { txtRequerido7.setVisible(true); c = true;} else { txtRequerido7.setVisible(false); }
        if (txtCalle.getText().equals("")) { txtRequerido8.setVisible(true); c = true;} else { txtRequerido8.setVisible(false); }
        if (txtNum_int.getText().equals("")) { txtRequerido9.setVisible(true); c = true;} else { txtRequerido9.setVisible(false); }
        if (txtCodigo_postal.getText().equals("")) { txtRequerido10.setVisible(true); c = true;} else { txtRequerido10.setVisible(false); }
        return c;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCurpTutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpTutorKeyTyped
        
    }//GEN-LAST:event_txtCurpTutorKeyTyped

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        if (txtEstado.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtEstadoKeyTyped

    private void txtMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyTyped
        if (txtMunicipio.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtMunicipioKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        if (txtColonia.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        if (txtCalle.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtNum_extKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum_extKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtNum_ext.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtNum_extKeyTyped

    private void txtNum_intKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum_intKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || (txtNum_int.getText().length()>=6))
            evt.consume();
    }//GEN-LAST:event_txtNum_intKeyTyped

    private void txtCodigo_postalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo_postalKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtCodigo_postal.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtCodigo_postalKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            return;
        }
        String CURP_tutor = txtCurpTutor.getText();
        String Estado = txtEstado.getText();
        String Municipio = txtMunicipio.getText();
        String Colonia = txtColonia.getText();
        String Calle = txtCalle.getText();
        String Num_ext = txtNum_ext.getText();
        String Num_int = txtNum_int.getText();
        int Codigo_postal = Integer.parseInt(txtCodigo_postal.getText());
        
        Consultas CN = new Consultas();
        String consult = "INSERT INTO direccion_vivienda (ID_direccion, Estado, Municipio, Colonia, Calle, Num_ext, Num_int, Codigo_postal, CURP_tutor) VALUES (null,"
                + "\"" + Estado + "\"," + "\"" + Municipio + "\"," + "\"" + Colonia + "\"," + "\"" + Calle + "\","; 
        if(Num_ext.equals("")) consult = consult + "null";
        else consult = consult + Num_ext;
        consult = consult + "," + Num_int + "," + Codigo_postal + ",\"" + CURP_tutor +"\");";
        if(CN.insert(consult)) JOptionPane.showMessageDialog(null, "Registro exitoso");
        this.dispose();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            return;
        }
        String CURP_tutor = txtCurpTutor.getText();
        String Estado = txtEstado.getText();
        String Municipio = txtMunicipio.getText();
        String Colonia = txtColonia.getText();
        String Calle = txtCalle.getText();
        String Num_ext = txtNum_ext.getText();
        String Num_int = txtNum_int.getText();
        int Codigo_postal = Integer.parseInt(txtCodigo_postal.getText());
        
        Consultas CP = new Consultas();
        String consult = "UPDATE direccion_vivienda SET Estado = \"" + Estado + "\", Municipio = \"" + Municipio + "\", Colonia = \"" + Colonia + "\", Calle = \""
                + Calle + "\", Num_ext = ";
        if(Num_ext.equals("")) consult = consult + "NULL";
        else consult = consult + Num_ext;
        consult = consult + ", Num_int = " + Num_int + ", Codigo_postal = " + Codigo_postal + " WHERE ID_direccion = \"" + Parametros.ID_direccion + "\";";
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
            java.util.logging.Logger.getLogger(Agregar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_direccion dialog = new Agregar_direccion(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigo_postal;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtCurpTutor;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNum_ext;
    private javax.swing.JTextField txtNum_int;
    private javax.swing.JLabel txtRequerido10;
    private javax.swing.JLabel txtRequerido4;
    private javax.swing.JLabel txtRequerido5;
    private javax.swing.JLabel txtRequerido6;
    private javax.swing.JLabel txtRequerido7;
    private javax.swing.JLabel txtRequerido8;
    private javax.swing.JLabel txtRequerido9;
    // End of variables declaration//GEN-END:variables
}
