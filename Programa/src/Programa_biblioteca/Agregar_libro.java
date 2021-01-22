package Programa_biblioteca;

import Conexion_biblioteca.Arduino;
import Conexion_biblioteca.Conector;
import Conexion_biblioteca.Consultas;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Agregar_libro extends javax.swing.JDialog {
    
    private PreparedStatement PS;
    private Conector CN;
    private int ID_libro = 0;

    public Agregar_libro(java.awt.Frame parent, boolean modal) {
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
        if(Arduino.conexion)
            Arduino.conArduino();
        Arduino.setTextField(txtRFID);
        
        lbRequerido1.setVisible(false);
        lbRequerido2.setVisible(false);
        lbRequerido3.setVisible(false);
        lbRequerido4.setVisible(false);
        lbRequerido5.setVisible(false);
        lbRequerido6.setVisible(false);
        lbRequerido7.setVisible(false);
        lbRequerido8.setVisible(false);
        lbRequerido9.setVisible(false);
        
        if(Parametros.Comp){
            actualizaDatos();
            btnGuardar.setVisible(false);
            Parametros.Comp = false;
        }
        
        autoCompletar();
    }
    
    /*
    char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ'))
            evt.consume();
    */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRFID = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtIdioma = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        lbRequerido1 = new javax.swing.JLabel();
        lbRequerido2 = new javax.swing.JLabel();
        lbRequerido3 = new javax.swing.JLabel();
        lbRequerido4 = new javax.swing.JLabel();
        lbRequerido5 = new javax.swing.JLabel();
        lbRequerido6 = new javax.swing.JLabel();
        lbRequerido7 = new javax.swing.JLabel();
        lbRequerido8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        lbRequerido9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Titulo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Autor:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Categoria:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Editorial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("Idioma:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Año publicacion:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("Tipo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("RFID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        txtRFID.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRFID.setEnabled(false);
        txtRFID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtRFID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 440, -1));

        txtTitulo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTituloKeyTyped(evt);
            }
        });
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 440, -1));

        txtAutor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 440, -1));

        txtCategoria.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 440, -1));

        txtEditorial.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEditorialKeyTyped(evt);
            }
        });
        jPanel1.add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 440, -1));

        txtIdioma.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtIdioma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdiomaKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 440, -1));

        txtAño.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAñoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 440, -1));

        txtTipo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtTipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 440, -1));

        lbRequerido1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido1.setText("Requerido");
        jPanel1.add(lbRequerido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 20));

        lbRequerido2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido2.setText("Requerido");
        jPanel1.add(lbRequerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, 20));

        lbRequerido3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido3.setText("Requerido");
        jPanel1.add(lbRequerido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, 20));

        lbRequerido4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido4.setText("Requerido");
        jPanel1.add(lbRequerido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, 20));

        lbRequerido5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido5.setText("Requerido");
        jPanel1.add(lbRequerido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, 20));

        lbRequerido6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido6.setText("Requerido");
        jPanel1.add(lbRequerido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 20));

        lbRequerido7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido7.setText("Requerido");
        jPanel1.add(lbRequerido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, 20));

        lbRequerido8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido8.setText("Requerido");
        jPanel1.add(lbRequerido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, 20));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setText("Ubicacion:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        txtUbicacion.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtUbicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 440, -1));

        lbRequerido9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lbRequerido9.setText("Requerido");
        jPanel1.add(lbRequerido9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, 20));

        btnCancelar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 100, -1));

        btnGuardar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 100, -1));

        btnActualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void actualizaDatos(){
        String consult = "SELECT * FROM Libros WHERE Titulo = '" + Parametros.Titulo + "' AND RFID = '" + Parametros.RFID_alumno + "';";
        Conector CN = new Conector();
        try {
            PreparedStatement PS = CN.connectMySQL().prepareStatement(consult);
            ResultSet result = PS.executeQuery(consult);
            if(result != null){
                while (result.next()) {
                    txtTitulo.setText(result.getString(2));
                    txtAutor.setText(result.getString(3));
                    txtCategoria.setText(result.getString(4));
                    txtEditorial.setText(result.getString(5));
                    txtIdioma.setText(result.getString(6));
                    txtAño.setText(result.getString(7));
                    txtTipo.setText(result.getString(8));
                    txtUbicacion.setText(result.getString(9));
                    txtRFID.setText(result.getString(10));
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
        Consultas CS = new Consultas();
        consult = "SELECT ID_libro FROM Libros WHERE Titulo = '" + Parametros.Titulo + "' AND RFID = '" + Parametros.RFID_alumno + "';";
        ID_libro = CS.consultInt(consult);
    }
    
    boolean verificar(){
        boolean c = false;
        if(txtTitulo.getText().equals("")){lbRequerido1.setVisible(true);c = true;} else lbRequerido1.setVisible(false);
        if(txtAutor.getText().equals("")){lbRequerido2.setVisible(true);c = true;} else lbRequerido2.setVisible(false);
        if(txtCategoria.getText().equals("")){lbRequerido3.setVisible(true);c = true;} else lbRequerido3.setVisible(false);
        if(txtEditorial.getText().equals("")){lbRequerido4.setVisible(true);c = true;} else lbRequerido4.setVisible(false);
        if(txtIdioma.getText().equals("")){lbRequerido5.setVisible(true);c = true;} else lbRequerido5.setVisible(false);
        if(txtAño.getText().equals("")){lbRequerido6.setVisible(true);c = true;} else lbRequerido6.setVisible(false);
        if(txtTipo.getText().equals("")){lbRequerido7.setVisible(true);c = true;} else lbRequerido7.setVisible(false);
        if(txtUbicacion.getText().equals("")){lbRequerido8.setVisible(true);c = true;} else lbRequerido8.setVisible(false);
        if(txtRFID.getText().equals("")){lbRequerido9.setVisible(true);c = true;} else lbRequerido9.setVisible(false);
        return c;
    }
    
    void autoCompletar(){
        CN = new Conector();
        TextAutoCompleter completarAutor = new TextAutoCompleter(txtAutor);
        TextAutoCompleter completarCategoria = new TextAutoCompleter(txtCategoria);
        TextAutoCompleter completarEditorial = new TextAutoCompleter(txtEditorial);
        TextAutoCompleter completarIdioma = new TextAutoCompleter(txtIdioma);
        TextAutoCompleter completarTipo = new TextAutoCompleter(txtTipo);
        String consult = "SELECT Autor, Categoria, Editorial, Idioma, Tipo FROM libros;";
        try {
            PS = CN.connectMySQL().prepareStatement(consult);
            ResultSet rs = PS.executeQuery();
            while(rs.next()){
                if(completarAutor.findItem(rs.getString(1)) == null)
                    completarAutor.addItem(rs.getString(1));
                if(completarCategoria.findItem(rs.getString(2)) == null)
                    completarCategoria.addItem(rs.getString(2));
                if(completarEditorial.findItem(rs.getString(3)) == null)
                    completarEditorial.addItem(rs.getString(3));
                if(completarIdioma.findItem(rs.getString(4)) == null)
                    completarIdioma.addItem(rs.getString(4));
                if(completarTipo.findItem(rs.getString(5)) == null)
                    completarTipo.addItem(rs.getString(5));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        
    }
    
    private void txtTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyTyped
        if (txtTitulo.getText().length()>=100)
            evt.consume();
    }//GEN-LAST:event_txtTituloKeyTyped

    private void txtAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAutorKeyTyped
        if (txtAutor.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ')&& !(c == '.'))
            evt.consume();
    }//GEN-LAST:event_txtAutorKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        if (txtCategoria.getText().length()>=30)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtEditorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEditorialKeyTyped
        if (txtEditorial.getText().length()>=30)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtEditorialKeyTyped

    private void txtIdiomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdiomaKeyTyped
        if (txtIdioma.getText().length()>=30)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtIdiomaKeyTyped

    private void txtAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAñoKeyTyped
        if (txtAño.getText().length()>=4)
            evt.consume();
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
    }//GEN-LAST:event_txtAñoKeyTyped

    private void txtTipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoKeyTyped
        if (txtTipo.getText().length()>=30)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtTipoKeyTyped

    private void txtRFIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFIDKeyTyped
        if (txtRFID.getText().length()>=11)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9') && (c < 'A' || c > 'F')  && !(c == ' '))
            evt.consume();
    }//GEN-LAST:event_txtRFIDKeyTyped

    private void txtUbicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicacionKeyTyped
        if (txtUbicacion.getText().length()>=30)
            evt.consume();
    }//GEN-LAST:event_txtUbicacionKeyTyped

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(verificar()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            return;
        }
        Consultas CN = new Consultas();
        String consult = "INSERT INTO `libros` (`ID_libro`, `Titulo`, `Autor`, `Categoria`, `Editorial`, `Idioma`, `Año`, `Tipo`, `Ubicacion`, `RFID`) VALUES "
                + "(null, '" + txtTitulo.getText() + "', '" + txtAutor.getText() + "', '" + txtCategoria.getText() + "', '" + txtEditorial.getText() + "', '"
                + txtIdioma.getText() + "', '" + txtAño.getText() + "', '" + txtTipo.getText() + "', '" + txtUbicacion.getText() + "', '" + txtRFID.getText() + "');";
        if(CN.consult(consult)){
            JOptionPane.showMessageDialog(null, "Consulta exitosa");
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(verificar()){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
            return;
        }
        Consultas CP = new Consultas();
        String consult = "UPDATE Libros SET Titulo = '" + txtTitulo.getText() + "', Autor = '" + txtAutor.getText() + "', Categoria = '" + txtCategoria.getText()
                + "', Editorial = '" + txtEditorial.getText() + "', Idioma = '" + txtIdioma.getText() + "', Año = '" + txtAño.getText() + "', Tipo = '" + txtTipo.getText()
                + "', Ubicacion = '" + txtUbicacion.getText() + "', RFID = '" + txtRFID.getText() + "' WHERE ID_libro = '" + ID_libro + "';";
        if(CP.consult(consult)){
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            this.dispose();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_libro dialog = new Agregar_libro(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbRequerido1;
    private javax.swing.JLabel lbRequerido2;
    private javax.swing.JLabel lbRequerido3;
    private javax.swing.JLabel lbRequerido4;
    private javax.swing.JLabel lbRequerido5;
    private javax.swing.JLabel lbRequerido6;
    private javax.swing.JLabel lbRequerido7;
    private javax.swing.JLabel lbRequerido8;
    private javax.swing.JLabel lbRequerido9;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtIdioma;
    private javax.swing.JTextField txtRFID;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables

}
