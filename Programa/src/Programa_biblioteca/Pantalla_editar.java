package Programa_biblioteca;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Pantalla_editar extends javax.swing.JFrame {

    public Pantalla_editar() {
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
        btnAlumnos = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnPrestamos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar_sesion = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAlumnos.setBackground(new java.awt.Color(204, 204, 255));
        btnAlumnos.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgAlumno.png"))); // NOI18N
        btnAlumnos.setText("   Alumnos");
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 290, 110));

        btnLibros.setBackground(new java.awt.Color(204, 204, 255));
        btnLibros.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgLibros.png"))); // NOI18N
        btnLibros.setText("     Libros");
        btnLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLibrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 290, 110));

        btnPrestamos.setBackground(new java.awt.Color(204, 204, 255));
        btnPrestamos.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgPrestamo.png"))); // NOI18N
        btnPrestamos.setText("Prestamos");
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 290, 110));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 116, 207));
        jLabel1.setText("¡Bienvenido al editor de MultiSCID!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, -1));

        btnCerrar_sesion.setBackground(new java.awt.Color(204, 204, 255));
        btnCerrar_sesion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCerrar_sesion.setText("Cerrar sesión");
        btnCerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar_sesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 140, -1));

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        btnUsuarios.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Programa_biblioteca/imgUsuario2.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        new Editar_alumno(this, true).setVisible(true);
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLibrosActionPerformed
        new Editar_libro(this, true).setVisible(true);
    }//GEN-LAST:event_btnLibrosActionPerformed

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed
        new Editar_prestamo(this, true).setVisible(true);
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnCerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar_sesionActionPerformed
        this.dispose();
        new Principal().setVisible(true);
    }//GEN-LAST:event_btnCerrar_sesionActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        new Editar_usuario(this, true).setVisible(true);
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnCerrar_sesion;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
