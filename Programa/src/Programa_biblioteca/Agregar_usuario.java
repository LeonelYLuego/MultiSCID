package Programa_biblioteca;

import Conexion_biblioteca.Conector;
import Conexion_biblioteca.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Agregar_usuario extends javax.swing.JDialog {

    private PreparedStatement PS;
    
    public Agregar_usuario(java.awt.Frame parent, boolean modal) {
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
        
        lblRequerido1.setVisible(false);
        lblRequerido2.setVisible(false);
        
        if(Parametros.Comp2==true){
            editar();
            Parametros.Comp2 = false;
        }
        else{
            btnActualizar.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblNombre_usuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtNombre_usuario = new javax.swing.JTextField();
        pwdContraseña = new javax.swing.JPasswordField();
        lblRequerido1 = new javax.swing.JLabel();
        lblRequerido2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo.setBackground(new java.awt.Color(132, 212, 212));
        panFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, -1));

        btnActualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        panFondo.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 100, -1));

        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 100, -1));

        lblNombre_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblNombre_usuario.setText("Nombre del usuario:");
        panFondo.add(lblNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 36, -1, -1));

        lblContraseña.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");
        panFondo.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 77, -1, -1));

        txtNombre_usuario.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        panFondo.add(txtNombre_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 33, 166, -1));

        pwdContraseña.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        panFondo.add(pwdContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 74, 166, -1));

        lblRequerido1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblRequerido1.setText("Requerido");
        panFondo.add(lblRequerido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 36, -1, -1));

        lblRequerido2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblRequerido2.setText("Requerido");
        panFondo.add(lblRequerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 77, -1, -1));

        getContentPane().add(panFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editar(){
        int ID_usuario = Parametros.ID_usuario;
        btnGuardar.setVisible(false);
        Conector CN = new Conector();
        String Consult = "SELECT Nombre_usuario, Contraseña FROM usuarios WHERE (ID_usuario='" + ID_usuario + "');";
        
        try {
            PS = Conector.connectMySQL().prepareStatement(Consult);
            ResultSet rs = PS.executeQuery(Consult);
            while (rs.next()) {
                txtNombre_usuario.setText(rs.getString(1));
                pwdContraseña.setText(rs.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    public boolean validar() {
        boolean c = false;
        if (txtNombre_usuario.getText().equals("")) {
            lblRequerido1.setVisible(true);
            c = true;
        } else {
            lblRequerido1.setVisible(false);
        }
        if (pwdContraseña.getText().equals("")) {
            lblRequerido2.setVisible(true);
            c = true;
        } else {
            lblRequerido2.setVisible(false);
        }
        return c;
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (validar()) {
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS CAMPOS");
            return;
        }

        String Nombre_usuario, Contraseña;
        try {
            Nombre_usuario = txtNombre_usuario.getText();
            Contraseña = pwdContraseña.getText();
        } catch (Exception e) {
            return;
        }

        if (txtNombre_usuario.getText().equals("") || pwdContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS CAMPOS");
            txtNombre_usuario.requestFocus();
        } else {
            String consult = "INSERT INTO usuarios (ID_usuario, Nombre_usuario, Contraseña) VALUES ("
            + "null," + "\"" + Nombre_usuario + "\"," + "\"" + Contraseña + "\");";
            Consultas CP = new Consultas();
            if (CP.insert(consult)) {
                JOptionPane.showMessageDialog(null, "Registro exitoso");
            }

            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS CAMPOS");
            return;
        }
        String Consult = "UPDATE usuarios SET Nombre_usuario = '" + txtNombre_usuario.getText() + "', Contraseña = '" + pwdContraseña.getText() + "' WHERE ID_usuario = '" + Parametros.ID_usuario + "';";
        Consultas CP = new Consultas();
        if(CP.insert(Consult)) JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
        this.dispose();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
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
            java.util.logging.Logger.getLogger(Agregar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_usuario dialog = new Agregar_usuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblNombre_usuario;
    private javax.swing.JLabel lblRequerido1;
    private javax.swing.JLabel lblRequerido2;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPasswordField pwdContraseña;
    private javax.swing.JTextField txtNombre_usuario;
    // End of variables declaration//GEN-END:variables
}