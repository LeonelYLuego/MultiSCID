package Programa_biblioteca;

import Conexion_biblioteca.Conector;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Buscar_libro extends javax.swing.JDialog {
    
    private PreparedStatement PS;
    private Conector CN;
    DefaultTableModel modelo = new DefaultTableModel();

    public Buscar_libro(java.awt.Frame parent, boolean modal) {
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
        Conector CN = new Conector();
        modelo.addColumn("Titulo");    
        modelo.addColumn("Autor");
        modelo.addColumn("Categoria");
        modelo.addColumn("Editorial");
        modelo.addColumn("Idioma");
        modelo.addColumn("Año publicacion");
        modelo.addColumn("Tipo");
        modelo.addColumn("Ubicacion");
        tbDatos.setModel(modelo);
        mostrarDatos("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo_listas_alumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblNombre_libro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo_listas_alumnos.setBackground(new java.awt.Color(255, 255, 255));
        panFondo_listas_alumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDatos.setBackground(new java.awt.Color(219, 239, 251));
        tbDatos.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        panFondo_listas_alumnos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1200, 400));

        btnCancelar.setBackground(new java.awt.Color(13, 108, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 480, 100, -1));

        btnBuscar.setBackground(new java.awt.Color(13, 108, 140));
        btnBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 80, -1));

        txtBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        panFondo_listas_alumnos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 30));

        lblNombre_libro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblNombre_libro.setText("Nombre del libro:");
        panFondo_listas_alumnos.add(lblNombre_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(panFondo_listas_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarDatos(String valor) {
        modelo.setRowCount(0);
        tbDatos.setModel(modelo);
        TextAutoCompleter completar = new TextAutoCompleter(txtBuscar);
        String Consult;
        if(valor.equals("")){
            Consult = "SELECT * FROM Libros;";
        }
        else{
            Consult = "SELECT * FROM Libros WHERE Titulo = '" + valor + "' OR Autor = '" + valor + "' OR Categoria = '" + valor + "' OR Editorial = '"
                    + valor + "' OR Idioma = '" + valor + "' OR Año = '" + valor + "' OR Tipo = '" + valor + "' OR Ubicacion = '" + valor + "';";
        }
        String[] datos = new String[8];
        try {
            PS = Conector.connectMySQL().prepareStatement(Consult);
            ResultSet rs = PS.executeQuery(Consult);
            while (rs.next()) {
                if(completar.findItem(rs.getString("Titulo")) == null)
                    completar.addItem(rs.getString("Titulo"));
                if(completar.findItem(rs.getString("Autor")) == null)
                    completar.addItem(rs.getString("Autor"));
                if(completar.findItem(rs.getString("Categoria")) == null)
                    completar.addItem(rs.getString("Categoria"));
                datos [0]= rs.getString(2);
                datos [1]= rs.getString(3);
                datos [2]= rs.getString(4);
                datos [3]= rs.getString(5);
                datos [4]= rs.getString(6);
                datos [5]= rs.getString(7);
                datos [6]= rs.getString(8);
                datos [7]= rs.getString(9);
                modelo.addRow(datos);
            }
            tbDatos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Buscar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Buscar_libro dialog = new Buscar_libro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre_libro;
    private javax.swing.JPanel panFondo_listas_alumnos;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
