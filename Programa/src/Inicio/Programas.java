package Inicio;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class Programas extends javax.swing.JFrame {

    public Programas() {
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
    }
    
    private void generarArchivo(int programa){
        /*String ruta = "/Juanito.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (!archivo.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(String.valueOf(programa));
                bw.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error: no se pudieron guardar los cambios");
                this.dispose();
            }
        }*/
        switch(programa){
            case 0:
                //new Programa_asistencia.Editar_usuario(this, true).setVisible(true);
                new Programa_asistencia.Pantalla_bloqueo().setVisible(true);
                break;
            case 1:
                //new Programa_asistencia.Editar_usuario(this, true).setVisible(true);
                new Programa_biblioteca.Principal().setVisible(true);
                break;
        }
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btEscuela = new javax.swing.JButton();
        btnBiblioteca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEscuela.setBackground(new java.awt.Color(13, 108, 140));
        btEscuela.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btEscuela.setForeground(new java.awt.Color(255, 255, 255));
        btEscuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_asistencia/IconoEscuela.png"))); // NOI18N
        btEscuela.setText("Escuela");
        btEscuela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEscuelaActionPerformed(evt);
            }
        });
        jPanel1.add(btEscuela, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 250, 130));

        btnBiblioteca.setBackground(new java.awt.Color(13, 108, 140));
        btnBiblioteca.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        btnBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        btnBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_biblioteca/IconoBiblioteca.png"))); // NOI18N
        btnBiblioteca.setText("Biblioteca");
        btnBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBibliotecaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_asistencia/Logo II.inicio.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Seleccione el programa con el que desea trabajar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("ADVERTENCIA: Una ves elegido el programa, no se podra cambiar.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEscuelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscuelaActionPerformed
        generarArchivo(0);
    }//GEN-LAST:event_btEscuelaActionPerformed

    private void btnBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBibliotecaActionPerformed
        generarArchivo(1);
    }//GEN-LAST:event_btnBibliotecaActionPerformed

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
            java.util.logging.Logger.getLogger(Programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEscuela;
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
