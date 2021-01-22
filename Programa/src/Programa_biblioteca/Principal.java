package Programa_biblioteca;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {

    public Principal() {
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
        jButton5 = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnPedirLibro = new javax.swing.JButton();
        btnDevolverLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgBuscarLibro.png"))); // NOI18N
        jButton5.setText("  Buscar libro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 310, 110));

        btnConfiguracion.setBackground(new java.awt.Color(204, 204, 255));
        btnConfiguracion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgConfig.png"))); // NOI18N
        btnConfiguracion.setText("Configuración");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        btnPedirLibro.setBackground(new java.awt.Color(204, 204, 255));
        btnPedirLibro.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnPedirLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgPedirLibro.png"))); // NOI18N
        btnPedirLibro.setText(" Pedir un libro");
        btnPedirLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedirLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPedirLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 310, 110));

        btnDevolverLibro.setBackground(new java.awt.Color(204, 204, 255));
        btnDevolverLibro.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        btnDevolverLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/imgDevolverLibro.png"))); // NOI18N
        btnDevolverLibro.setText("Devolver un libro");
        btnDevolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevolverLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 310, 110));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 116, 207));
        jLabel1.setText("¡Bienvenido a MultiSCID!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new Buscar_libro(this, false).setVisible(true); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        new Pantalla_bloqueo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnPedirLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedirLibroActionPerformed
        new Pedir_libro(this, false).setVisible(true);
    }//GEN-LAST:event_btnPedirLibroActionPerformed

    private void btnDevolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverLibroActionPerformed
        new Devolver_libro(this, false).setVisible(true);
    }//GEN-LAST:event_btnDevolverLibroActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnDevolverLibro;
    private javax.swing.JButton btnPedirLibro;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
