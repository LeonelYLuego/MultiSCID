package Programa_asistencia;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Locale;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {
    private boolean docente;

    public Principal(int cargo) {
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
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        switch(cargo){
        case 1:
            btnUsuarios.setVisible(false);
            break;
        case 2:
            btnUsuarios.setVisible(false);
            btnAgregarAlumno.setVisible(false);
            btnTelefonos.setLocation(new Point(20, 180));
            btnDirecciones.setLocation(new Point(320, 180));
            btnAsistencias.setLocation(new Point(170, 300));
            docente = true;
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAsistencias = new javax.swing.JButton();
        btnDirecciones = new javax.swing.JButton();
        btnTutores = new javax.swing.JButton();
        btnAgregarAlumno = new javax.swing.JButton();
        btnAlumnos = new javax.swing.JButton();
        btnTelefonos = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        btnAsistencias.setBackground(new java.awt.Color(204, 204, 255));
        btnAsistencias.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        btnAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgAsistencia.png"))); // NOI18N
        btnAsistencias.setText(" Asistencias");
        btnAsistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsistencias);
        btnAsistencias.setBounds(20, 300, 290, 110);

        btnDirecciones.setBackground(new java.awt.Color(204, 204, 255));
        btnDirecciones.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnDirecciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgDirecciones.png"))); // NOI18N
        btnDirecciones.setText("   Direcciones");
        btnDirecciones.setActionCommand("Direcciones");
        btnDirecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireccionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDirecciones);
        btnDirecciones.setBounds(320, 300, 290, 110);

        btnTutores.setBackground(new java.awt.Color(204, 204, 255));
        btnTutores.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btnTutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgTutores.png"))); // NOI18N
        btnTutores.setText("  Tutores");
        btnTutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnTutores);
        btnTutores.setBounds(320, 60, 290, 110);

        btnAgregarAlumno.setBackground(new java.awt.Color(204, 204, 255));
        btnAgregarAlumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        btnAgregarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgAñadirAlumno.png"))); // NOI18N
        btnAgregarAlumno.setText("Agregar alumno");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarAlumno);
        btnAgregarAlumno.setBounds(20, 180, 290, 109);

        btnAlumnos.setBackground(new java.awt.Color(204, 204, 255));
        btnAlumnos.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        btnAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgAlumno.png"))); // NOI18N
        btnAlumnos.setText("Alumnos");
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlumnos);
        btnAlumnos.setBounds(20, 60, 290, 110);

        btnTelefonos.setBackground(new java.awt.Color(204, 204, 255));
        btnTelefonos.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        btnTelefonos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgTelefonos.png"))); // NOI18N
        btnTelefonos.setText("    Teléfonos");
        btnTelefonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTelefonos);
        btnTelefonos.setBounds(320, 180, 290, 109);

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 255));
        btnUsuarios.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgUsuario2.png"))); // NOI18N
        btnUsuarios.setText("    Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuarios);
        btnUsuarios.setBounds(460, 10, 150, 41);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 116, 207));
        jLabel1.setText("¡Bienvenido a MultiSCID!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 250, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutoresActionPerformed
        new Editar_tutor(this, true, docente).setVisible(true);
    }//GEN-LAST:event_btnTutoresActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
        new Agregar_alumno(this, true).setVisible(true);
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        new Editar_alumno(this, true, docente).setVisible(true);
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnDireccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireccionesActionPerformed
        new Editar_direccion(this, true, docente).setVisible(true);
    }//GEN-LAST:event_btnDireccionesActionPerformed

    private void btnAsistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciasActionPerformed
        new Asistencia(this, true).setVisible(true);
    }//GEN-LAST:event_btnAsistenciasActionPerformed

    private void btnTelefonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonosActionPerformed
        new Editar_telefono(this, true, docente).setVisible(true);
    }//GEN-LAST:event_btnTelefonosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JButton btnAsistencias;
    private javax.swing.JButton btnDirecciones;
    private javax.swing.JButton btnTelefonos;
    private javax.swing.JButton btnTutores;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
