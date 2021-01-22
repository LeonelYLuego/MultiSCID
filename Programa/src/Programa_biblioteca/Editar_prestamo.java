package Programa_biblioteca;

import Conexion_biblioteca.Conector;
import Conexion_biblioteca.Consultas;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Editar_prestamo extends javax.swing.JDialog {

    private PreparedStatement PS;
    private Conector CN;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Editar_prestamo(java.awt.Frame parent, boolean modal) {
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
        modelo.addColumn("Nombre");    
        modelo.addColumn("Apellido paterno");
        modelo.addColumn("Apellido materno");
        modelo.addColumn("Grado");
        modelo.addColumn("Grupo");
        modelo.addColumn("ID_libro");
        modelo.addColumn("Titulo");
        modelo.addColumn("Autor");
        modelo.addColumn("Ubicacion");
        modelo.addColumn("Fecha prestamo");
        modelo.addColumn("Fecha devolucion");
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
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
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

        panFondo_listas_alumnos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1210, 400));

        btnCancelar.setBackground(new java.awt.Color(13, 108, 140));
        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Regresar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 480, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(13, 108, 140));
        btnEliminar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(13, 108, 140));
        btnAgregar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar devolucion");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, -1, -1));

        btnBuscar.setBackground(new java.awt.Color(13, 108, 140));
        btnBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panFondo_listas_alumnos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        panFondo_listas_alumnos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 280, -1));

        lblNombre_libro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblNombre_libro.setText("Nombre del libro:");
        panFondo_listas_alumnos.add(lblNombre_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(panFondo_listas_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void mostrarDatos(String valor) {
        modelo.setRowCount(0);
        tbDatos.setModel(modelo);
        TextAutoCompleter completar = new TextAutoCompleter(txtBuscar);
        String Consult;
        if(valor.equals("")){
            Consult = "SELECT a.CURP_alumno, a.Nombre, a.Apellido_paterno, a.Apellido_materno, a.Grado, a.Grupo, l.ID_libro, l.Titulo, l.Autor, l.Ubicacion, p.Fecha_prestamo, p.Fecha_devolucion FROM Alumnos a, Libros l, Prestamos p  WHERE (p.CURP_alumno = a.CURP_alumno) AND (l.ID_libro = p.ID_libro);";
        }
        else{
            Consult = "SELECT a.CURP_alumno, a.Nombre, a.Apellido_paterno, a.Apellido_materno, a.Grado, a.Grupo, l.ID_libro, l.Titulo, l.Autor, l.Ubicacion, p.Fecha_prestamo, p.Fecha_devolucion FROM Alumnos a, Libros l, Prestamos p  WHERE (p.CURP_alumno = a.CURP_alumno) AND (l.ID_libro = p.ID_libro)"
                    + " AND (a.Nombre = '" + valor + "' OR a.Apellido_paterno = '" + valor + "' OR l.Titulo = '" + valor + "' OR Fecha_prestamo = '" + valor + "' OR Fecha_devolucion = '" + valor + "');";
        }
        String[] datos = new String[12];
        try {
            PS = Conector.connectMySQL().prepareStatement(Consult);
            ResultSet rs = PS.executeQuery(Consult);
            while (rs.next()) {
                if(completar.findItem(rs.getString("Nombre")) == null)
                    completar.addItem(rs.getString("Nombre"));
                if(completar.findItem(rs.getString("Apellido_paterno")) == null)
                    completar.addItem(rs.getString("Apellido_paterno"));
                if(completar.findItem(rs.getString("Titulo")) == null)
                    completar.addItem(rs.getString("Titulo"));
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
            String tit = tbDatos.getValueAt(fila, 0).toString();
            String rfid = tbDatos.getValueAt(fila, 8).toString();
            try {
                PS = CN.connectMySQL().prepareStatement("DELETE FROM Prestamos WHERE CURP_alumno = '" + tbDatos.getValueAt(fila, 0).toString() + "' AND ID_libro = '" + tbDatos.getValueAt(fila, 6).toString() 
                        + "' AND Fecha_prestamo = '" + tbDatos.getValueAt(fila, 10).toString() + "';");
                PS.executeUpdate();
                mostrarDatos(txtBuscar.getText());

            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

            txtBuscar.setText("");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fila = tbDatos.getSelectedRow();
        if (fila < 0){
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna fila");
            return;
        }
        String consult = "SELECT COUNT(*) FROM Prestamos WHERE (Fecha_devolucion IS NULL) AND CURP_alumno = '" + tbDatos.getValueAt(fila, 0).toString() + "' AND ID_libro = '" 
                + tbDatos.getValueAt(fila, 6).toString() + "' AND Fecha_prestamo = '" + tbDatos.getValueAt(fila, 10).toString() + "';";
        Consultas Cs = new Consultas();
        if(Cs.consultInt(consult) == 1){
            Date date = new Date();
            int dia = date.getDate();
            int mes = date.getMonth() + 1;
            int año = date.getYear() + 1900;
            if(Cs.consult("UPDATE Prestamos SET Fecha_devolucion = '" + año + '-' + mes + '-' + dia + '-' + "' WHERE (Fecha_devolucion IS NULL) AND CURP_alumno = '" + tbDatos.getValueAt(fila, 0).toString() + "' AND ID_libro = '" 
                + tbDatos.getValueAt(fila, 6).toString() + "' AND Fecha_prestamo = '" + tbDatos.getValueAt(fila, 10).toString() + "';"))
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
        } else 
            JOptionPane.showMessageDialog(null, "Error: ya existe una devolucion");
        mostrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar_prestamo dialog = new Editar_prestamo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre_libro;
    private javax.swing.JPanel panFondo_listas_alumnos;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
