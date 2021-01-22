package Programa_asistencia;
import Conexion_asistencia.Conector;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Editar_alumno extends javax.swing.JDialog {
    
    private PreparedStatement PS;
    private Conector CN;
    DefaultTableModel modelo = new DefaultTableModel();

    public Editar_alumno(java.awt.Frame parent, boolean modal, boolean visualizar) {
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
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/Icono.png")).getImage());
        
        Conector CN = new Conector();
        modelo.addColumn("CURP");    
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido paterno");
        modelo.addColumn("Apellido materno");
        modelo.addColumn("Dia (nacimiento)");
        modelo.addColumn("Mes (nacimiento)");
        modelo.addColumn("Año (nacimiento)");
        modelo.addColumn("Sexo");
        modelo.addColumn("Grado");
        modelo.addColumn("Grupo");
        modelo.addColumn("Aula");
        modelo.addColumn("RFID");
        modelo.addColumn("ID Horario");
        modelo.addColumn("CURP del tutor");
        tbDatos.setModel(modelo);
        mostrarDatos("","");
        if(visualizar){
            btnAgregar.setVisible(false);
            btnEliminar.setVisible(false);
            btnEditar.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo_listas_alumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cmbGrupo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panFondo_listas_alumnos.setBackground(new java.awt.Color(255, 255, 255));
        panFondo_listas_alumnos.setForeground(new java.awt.Color(255, 255, 255));
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

        panFondo_listas_alumnos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1220, 400));

        btnCancelar.setBackground(new java.awt.Color(13, 108, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 490, -1, -1));

        btnEditar.setBackground(new java.awt.Color(13, 108, 140));
        btnEditar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 90, -1));

        txtBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
        });
        panFondo_listas_alumnos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 300, -1));

        jButton1.setBackground(new java.awt.Color(13, 108, 140));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 100, -1));

        cmbGrupo.setBackground(new java.awt.Color(13, 108, 140));
        cmbGrupo.setFont(new java.awt.Font("Britannic Bold", 0, 14)); // NOI18N
        cmbGrupo.setForeground(new java.awt.Color(255, 255, 255));
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O" }));
        cmbGrupo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGrupoItemStateChanged(evt);
            }
        });
        panFondo_listas_alumnos.add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Grupo:");
        panFondo_listas_alumnos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Nombre o apellido paterno:");
        panFondo_listas_alumnos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 190, 20));

        btnEliminar.setBackground(new java.awt.Color(13, 108, 140));
        btnEliminar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, 90, -1));

        btnAgregar.setBackground(new java.awt.Color(13, 108, 140));
        btnAgregar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 40, -1, -1));

        getContentPane().add(panFondo_listas_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarDatos(String valor, String grupo) {
        modelo.setRowCount(0);
        tbDatos.setModel(modelo);
        TextAutoCompleter completar = new TextAutoCompleter(txtBuscar);
        String Consult;
        if((valor.equals("") && grupo.equals("")) || (valor.equals("") && grupo.equals(" "))){
            Consult = "SELECT * FROM alumnos;";
        }
        else if(!valor.equals("") && grupo.equals(" ")){
            Consult = "SELECT * FROM alumnos WHERE Nombre='" + valor + "' OR Apellido_paterno='" + valor + "';";
        }
        else if(valor.equals("")){
            Consult = "SELECT * FROM alumnos WHERE Grupo='" + grupo + "';";
        }
        else{
            Consult = "SELECT * FROM alumnos WHERE (Nombre='" + valor + "' OR Apellido_paterno='" + valor + "') AND Grupo='" + grupo + "';";
        }
        String[] datos = new String[14];
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
                datos [11]= rs.getString(12);
                datos [12]= rs.getString(13);
                datos [13]= rs.getString(14);
                modelo.addRow(datos);
            }
            tbDatos.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        char c = evt.getKeyChar();
        if(c == '\n') mostrarDatos(txtBuscar.getText(), (String) cmbGrupo.getSelectedItem());
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mostrarDatos(txtBuscar.getText(), (String) cmbGrupo.getSelectedItem());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbGrupoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGrupoItemStateChanged
        mostrarDatos(txtBuscar.getText(), (String) cmbGrupo.getSelectedItem());
    }//GEN-LAST:event_cmbGrupoItemStateChanged

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int fila = tbDatos.getSelectedRow();
 
        if (fila>=0) {
            Parametros.CURP_alumno = tbDatos.getValueAt(fila, 0).toString();
            Parametros.Nombre = tbDatos.getValueAt(fila, 1).toString();
            Parametros.Apellido_paterno = tbDatos.getValueAt(fila, 2).toString();
            Parametros.Apellido_materno = tbDatos.getValueAt(fila, 3).toString();
            Parametros.Aula = tbDatos.getValueAt(fila, 10).toString();
            Parametros.RFID_alumno = tbDatos.getValueAt(fila, 11).toString();
            Parametros.CURP_tutor = tbDatos.getValueAt(fila, 13).toString();
            Parametros.Dia = Integer.parseInt(tbDatos.getValueAt(fila, 4).toString());
            Parametros.Mes = Integer.parseInt(tbDatos.getValueAt(fila, 5).toString());
            Parametros.Año = tbDatos.getValueAt(fila, 6);
            Parametros.Grado = Integer.parseInt(tbDatos.getValueAt(fila, 8).toString());
            Parametros.Horario = Integer.parseInt(tbDatos.getValueAt(fila, 12).toString());
            Parametros.Sexo = tbDatos.getValueAt(fila, 7).toString();
            Parametros.Grupo = tbDatos.getValueAt(fila, 9).toString();
            Parametros.Comp = true;
            new Agregar_alumno(new javax.swing.JFrame(), true).setVisible(true);
            mostrarDatos(txtBuscar.getText(), (String) cmbGrupo.getSelectedItem());
        }
        else{
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna fila");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tbDatos.getSelectedRow();
        if (fila < 0){
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna fila");
            return;
        }
        String [] botones = { "No", "Si"};
        int variable = JOptionPane.showOptionDialog (null, "¿Desea eliminar este registro permanentemente?", "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
        if (variable == 1) {
            fila = tbDatos.getSelectedRow();
            String cod = tbDatos.getValueAt(fila, 0).toString();
            try {

                PS = CN.connectMySQL().prepareStatement("DELETE FROM alumnos WHERE alumnos.CURP_alumno = '" + cod + "';");
                PS.executeUpdate();
                mostrarDatos("",  (String) cmbGrupo.getSelectedItem());

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

            txtBuscar.setText("");
        } else {
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        new Agregar_alumno(new javax.swing.JFrame(), true).setVisible(true);
        mostrarDatos(txtBuscar.getText(), (String) cmbGrupo.getSelectedItem());
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar_alumno dialog = new Editar_alumno(new javax.swing.JFrame(), true, false);
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

    // <editor-fold defaultstate="collapsed" desc="Variables declarations">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panFondo_listas_alumnos;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    // </editor-fold> 
}
