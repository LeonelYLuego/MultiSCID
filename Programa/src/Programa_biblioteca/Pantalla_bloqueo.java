package Programa_biblioteca;

import Conexion_biblioteca.Conector;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pantalla_bloqueo extends javax.swing.JFrame {

    private PreparedStatement PS;
    
    public Pantalla_bloqueo() {
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
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes_biblioteca/Icono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciar_sesion = new javax.swing.JButton();
        pwdContraseña = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblEslogan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 70, 20));

        lblContraseña.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 90, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, 20));

        txtUsuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 210, -1));

        btnIniciar_sesion.setBackground(new java.awt.Color(70, 131, 140));
        btnIniciar_sesion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnIniciar_sesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar_sesion.setText("Iniciar sesión");
        btnIniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, 110, -1));

        pwdContraseña.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        pwdContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pwdContraseñaKeyPressed(evt);
            }
        });
        jPanel1.add(pwdContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 210, -1));

        btnCancelar.setBackground(new java.awt.Color(70, 131, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 110, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/Logo II.inicio.png"))); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lblEslogan.setText("ESLOGAN");
        jPanel1.add(lblEslogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static String nombre;
    
    void compContra(String nombre_usuario, String contra){
        Conector CN = new Conector();
        
        nombre = "";
        String contraseña = "";
        
        String SQL = "SELECT * FROM usuarios WHERE Nombre_usuario='" + nombre_usuario + "' && Contraseña='" + contra + "';";
        ResultSet ress = null;
        
        try {
            PS = CN.connectMySQL().prepareStatement(SQL);
            ress = PS.executeQuery(SQL);
            if (ress != null) {
                while (ress.next()) {
                    nombre = ress.getString("Nombre_usuario");
                    contraseña = ress.getString("Contraseña");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Algo salió mal");
                pwdContraseña.setText("");
            }
            
            if (nombre_usuario.equals(nombre) && contra.equals(contraseña)) {
                new Pantalla_editar().setVisible(true);
                this.dispose();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Usuario/contraseña incorrecta");
                pwdContraseña.setText("");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getLocalizedMessage());
            }
    }
    
    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        char c = evt.getKeyChar();
        if (c == '\n') {
            String usuario = txtUsuario.getText();
            String contraseña = new String(pwdContraseña.getPassword());

            if (usuario.equals("") || contraseña.equals("")) {
                JOptionPane.showMessageDialog(null, "Favor de llenar todos los espacios");
                pwdContraseña.setText("");
            } else {
                compContra(usuario, contraseña);
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void btnIniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar_sesionActionPerformed
        String usuario = txtUsuario.getText();
        String contraseña = new String(pwdContraseña.getPassword());

        if (usuario.equals("") || contraseña.equals("")) {
            JOptionPane.showMessageDialog(null, "Favor de llenar todos los espacios");
            pwdContraseña.setText("");
        } else {
            compContra(usuario, contraseña);
        }
    }//GEN-LAST:event_btnIniciar_sesionActionPerformed

    private void pwdContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pwdContraseñaKeyPressed
        char c = evt.getKeyChar();
        if (c == '\n') {
            String usuario = txtUsuario.getText();
            String contraseña = new String(pwdContraseña.getPassword());

            if (usuario.equals("") || contraseña.equals("")) {
                JOptionPane.showMessageDialog(null, "Favor de llenar todos los espacios");
                pwdContraseña.setText("");
            } else {
                compContra(usuario, contraseña);
            }
        }
    }//GEN-LAST:event_pwdContraseñaKeyPressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_bloqueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIniciar_sesion;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblEslogan;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
