package Programa_asistencia;

import Conexion_asistencia.Conector;
import Conexion_asistencia.Consultas;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Editar_direccion extends javax.swing.JDialog {
    
    private PreparedStatement PS;
    private Conector CN;
    DefaultTableModel modelo = new DefaultTableModel();

    public Editar_direccion(java.awt.Frame parent, boolean modal, boolean visualizar) {
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
        modelo.addColumn("CURP");  
        modelo.addColumn("Apellido paterno");
        modelo.addColumn("Apellido materno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");
        modelo.addColumn("Municipio");
        modelo.addColumn("Colonia");
        modelo.addColumn("Calle");
        modelo.addColumn("Numero exterior");
        modelo.addColumn("Numero Inerior");
        modelo.addColumn("Codigo Postal");
        tbDatos.setModel(modelo);
        mostrarDatos("");
        if(visualizar){
            btnAgregar.setVisible(false);
            btnEliminar.setVisible(false);
            btnEditar.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDatos.setBackground(new java.awt.Color(219, 239, 251));
        tbDatos.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1220, 370));

        btnCancelar.setBackground(new java.awt.Color(13, 108, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 470, -1, -1));

        btnEditar.setBackground(new java.awt.Color(13, 108, 140));
        btnEditar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 50, 100, -1));

        btnEliminar.setBackground(new java.awt.Color(13, 108, 140));
        btnEliminar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 100, -1));

        btnAgregar.setBackground(new java.awt.Color(13, 108, 140));
        btnAgregar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1133, 50, 100, -1));

        txtBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 260, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Nombre, apellido paterno o CURP:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(13, 108, 140));
        btnBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarDatos(String valor) {
        modelo.setRowCount(0);
        tbDatos.setModel(modelo);
        TextAutoCompleter completar = new TextAutoCompleter(txtBuscar);
        String Consult;
        if(valor.equals("")){
            Consult = "SELECT t.CURP_tutor, t.Nombre, t.Apellido_paterno, t.Apellido_materno, d.Estado, d.Municipio, d.Colonia, d.Calle, d.Num_ext, d.Num_int, d.Codigo_postal FROM tutores t, direccion_vivienda d WHERE t.CURP_tutor = d.CURP_tutor";
        }
        else{
            Consult = "SELECT t.CURP_tutor, t.Nombre, t.Apellido_paterno, t.Apellido_materno, d.Estado, d.Municipio, d.Colonia, d.Calle, d.Num_ext, d.Num_int, d.Codigo_postal FROM tutores t, direccion_vivienda d WHERE t.CURP_tutor = d.CURP_tutor AND (t.Nombre='" + valor + "' OR t.Apellido_paterno='" + valor +"' or t.CURP_tutor = '" + valor + "');";
        }
        String[] datos = new String[11];
        try {
            PS = Conector.connectMySQL().prepareStatement(Consult);
            ResultSet rs = PS.executeQuery(Consult);
            while (rs.next()) {
                completar.addItem(rs.getString("Nombre"));
                completar.addItem(rs.getString("Apellido_materno"));
                completar.addItem(rs.getString("Apellido_paterno"));
                datos [0]= rs.getString(1);
                datos [1]= rs.getString(2);
                datos [2]= rs.getString(3);
                datos [3]= rs.getString(4);
                datos [4]= rs.getString(5);
                datos [5]= rs.getString(6);
                datos [6]= rs.getString(7);
                datos [7]= rs.getString(8);
                datos [8]= rs.getString(9);
                datos [9]= rs.getString(10);
                datos [10]= rs.getString(11);
                modelo.addRow(datos);
            }
            tbDatos.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();
        if(c == '\n') mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fila = tbDatos.getSelectedRow();
        if (fila>=0) {
            Parametros.CURP_tutor = tbDatos.getValueAt(fila, 0).toString();
            new Agregar_direccion(new javax.swing.JFrame(), true).setVisible(true);
            mostrarDatos(txtBuscar.getText());
        }
        else{
            String [] botones = { "No", "Si"};
            int variable = JOptionPane.showOptionDialog (null, "No se selecciono ningun tutor\n¿Desea agregar un tutor?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
            if (variable == 1) {
                new Agregar_tutor(new javax.swing.JFrame(), true).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tbDatos.getSelectedRow();
        if (fila < 0){
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna fila");
            return;
        }
        String [] botones = { "No", "Si"};
        if(JOptionPane.showOptionDialog (null, "¿Desea eliminar este registro permanentemente?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]) == 1) {
            fila = tbDatos.getSelectedRow();
            String cod = tbDatos.getValueAt(fila, 0).toString();
            String calle = tbDatos.getValueAt(fila, 7).toString();
            Consultas CS = new Consultas();
            if(CS.consultInt("select COUNT(*) from direccion_vivienda Where curp_tutor = \"" + cod + "\";") > 1){
                try {
                    String consult = "DELETE FROM direccion_vivienda WHERE CURP_tutor = \"" + cod + "\" AND Calle = \"" + calle +"\";";
                    PS = CN.connectMySQL().prepareStatement(consult);
                    PS.executeUpdate(consult);
                    mostrarDatos("");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                }
            } 
            else{
                JOptionPane.showMessageDialog(null, "Error: Un tutor debe al menos tener una direccion");
            }

            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tbDatos.getSelectedRow();
        if (fila>=0) {
            Consultas CN = new Consultas();
            Parametros.ID_direccion = CN.consultInt("SELECT ID_direccion FROM direccion_vivienda WHERE CURP_tutor = \"" + tbDatos.getValueAt(fila, 0).toString() + "\" AND Calle = \"" + tbDatos.getValueAt(fila, 7).toString() + "\";");
            Parametros.CURP_tutor = tbDatos.getValueAt(fila, 0).toString();
            Parametros.Comp3 = true;
            new Agregar_direccion(new javax.swing.JFrame(), true).setVisible(true);
            mostrarDatos(txtBuscar.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna fila");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_direccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar_direccion dialog = new Editar_direccion(new javax.swing.JFrame(), true, false);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
