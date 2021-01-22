package Programa_asistencia;

import Conexion_asistencia.Conector;
import Conexion_asistencia.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Agregar_tutor extends javax.swing.JDialog {

    public Agregar_tutor(java.awt.Frame parent, boolean modal) {
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
        
        txtRequerido1.setVisible(false);
        txtRequerido2.setVisible(false);
        txtRequerido3.setVisible(false);
        txtRequerido4.setVisible(false);
        txtRequerido5.setVisible(false);
        txtRequerido6.setVisible(false);
        txtRequerido7.setVisible(false);
        txtRequerido8.setVisible(false);
        txtRequerido9.setVisible(false);
        txtRequerido10.setVisible(false);
        txtRequerido11.setVisible(false);
        txtRequerido12.setVisible(false);
        txtRequerido13.setVisible(false);
        if(Parametros.Comp2){
            txtCURP_tutor.setEnabled(false);
            txtCURP_tutor.setText(Parametros.CURP_tutor);
            Parametros.Comp2 = false;
        }
        else if(Parametros.Comp3){
            txtCURP_tutor.setEnabled(false);
            btnGuardar2.setVisible(false);
            actualizarDatos(Parametros.CURP_tutor);
            Parametros.Comp3 = false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido_paterno_tutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCorreo_electronico_tutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtMunicipio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnGuardar2 = new javax.swing.JButton();
        btnCancelar2 = new javax.swing.JButton();
        txtNum_int = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCURP_tutor = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLada = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTipo_tel = new javax.swing.JTextField();
        txtApellido_materno_tutor = new javax.swing.JTextField();
        txtColonia = new javax.swing.JTextField();
        txtNumero_tel = new javax.swing.JTextField();
        txtCodigo_postal = new javax.swing.JTextField();
        txtNombre_tutor = new javax.swing.JTextField();
        btnActualizar2 = new javax.swing.JButton();
        txtRequerido1 = new javax.swing.JLabel();
        txtRequerido2 = new javax.swing.JLabel();
        txtRequerido3 = new javax.swing.JLabel();
        txtRequerido4 = new javax.swing.JLabel();
        txtRequerido5 = new javax.swing.JLabel();
        txtRequerido6 = new javax.swing.JLabel();
        txtRequerido7 = new javax.swing.JLabel();
        txtRequerido8 = new javax.swing.JLabel();
        txtRequerido9 = new javax.swing.JLabel();
        txtRequerido10 = new javax.swing.JLabel();
        txtRequerido11 = new javax.swing.JLabel();
        txtRequerido12 = new javax.swing.JLabel();
        txtNum_ext = new javax.swing.JTextField();
        txtRequerido13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(132, 212, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, 30));

        txtApellido_paterno_tutor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtApellido_paterno_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido_paterno_tutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido_paterno_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 230, 30));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("CURP:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 50, 20));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 30));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Correo electronico:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        txtCorreo_electronico_tutor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCorreo_electronico_tutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreo_electronico_tutorFocusLost(evt);
            }
        });
        jPanel1.add(txtCorreo_electronico_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 330, 30));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("Estado:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 30));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("Municipio:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 30));

        txtEstado.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });
        jPanel1.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 260, -1));

        txtMunicipio.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtMunicipio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMunicipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMunicipioKeyTyped(evt);
            }
        });
        jPanel1.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 260, -1));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setText("Colonia:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 30));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setText("Calle:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, 30));

        txtCalle.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCalle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        jPanel1.add(txtCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 260, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel11.setText("Núm. Exterior:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, -1, 20));

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel12.setText("Núm. Interior:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, -1, 20));

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel13.setText("Código postal:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, 20));

        btnGuardar2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnGuardar2.setText("Guardar");
        btnGuardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 100, 30));

        btnCancelar2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar2.setText("Cancelar");
        btnCancelar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 560, 100, 30));

        txtNum_int.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNum_int.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum_int.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum_intKeyTyped(evt);
            }
        });
        jPanel1.add(txtNum_int, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 90, -1));

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel14.setText("Núm. de telefono:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        txtCURP_tutor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCURP_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCURP_tutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtCURP_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 270, 30));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel16.setText("Lada:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 40, -1));

        txtLada.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtLada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLadaKeyTyped(evt);
            }
        });
        jPanel1.add(txtLada, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 100, -1));

        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel17.setText("Tipo:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 40, -1));

        txtTipo_tel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtTipo_tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipo_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipo_telKeyTyped(evt);
            }
        });
        jPanel1.add(txtTipo_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 100, -1));

        txtApellido_materno_tutor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtApellido_materno_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido_materno_tutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido_materno_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 230, 30));

        txtColonia.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtColonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColoniaKeyTyped(evt);
            }
        });
        jPanel1.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 260, -1));

        txtNumero_tel.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNumero_tel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumero_tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumero_telKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumero_tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 100, -1));

        txtCodigo_postal.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCodigo_postal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigo_postalKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo_postal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 90, -1));

        txtNombre_tutor.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNombre_tutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_tutorKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 270, 30));

        btnActualizar2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnActualizar2.setText("Actualizar");
        btnActualizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 100, 30));

        txtRequerido1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido1.setText("REQUERIDO");
        jPanel1.add(txtRequerido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 90, 30));

        txtRequerido2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido2.setText("REQUERIDO");
        jPanel1.add(txtRequerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, 30));

        txtRequerido3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido3.setText("REQUERIDO");
        jPanel1.add(txtRequerido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, 30));

        txtRequerido4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido4.setText("OBLIGATORIO");
        jPanel1.add(txtRequerido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 100, 30));

        txtRequerido5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido5.setText("REQUERIDO");
        jPanel1.add(txtRequerido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 90, 30));

        txtRequerido6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido6.setText("REQUERIDO");
        jPanel1.add(txtRequerido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, 30));

        txtRequerido7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido7.setText("REQUERIDO");
        jPanel1.add(txtRequerido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 90, 30));

        txtRequerido8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido8.setText("REQUERIDO");
        jPanel1.add(txtRequerido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 90, 30));

        txtRequerido9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido9.setText("REQUERIDO");
        jPanel1.add(txtRequerido9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 90, 20));

        txtRequerido10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido10.setText("REQUERIDO");
        jPanel1.add(txtRequerido10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 90, 20));

        txtRequerido11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido11.setText("REQUERIDO");
        jPanel1.add(txtRequerido11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 90, 20));

        txtRequerido12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido12.setText("REQUERIDO");
        jPanel1.add(txtRequerido12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 90, 20));

        txtNum_ext.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNum_ext.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNum_ext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNum_extKeyTyped(evt);
            }
        });
        jPanel1.add(txtNum_ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 90, -1));

        txtRequerido13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido13.setText("REQUERIDO");
        jPanel1.add(txtRequerido13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void actualizarDatos(String CURP_tutor){
        String consult = "SELECT * FROM tutores WHERE CURP_tutor = \"" + CURP_tutor + "\";";
        Conector CN = new Conector();
        try {
            PreparedStatement PS = CN.connectMySQL().prepareStatement(consult);
            ResultSet result = PS.executeQuery(consult);
            if(result != null){
                while (result.next()) {
                    txtApellido_paterno_tutor.setText(result.getString(2));
                    txtApellido_materno_tutor.setText(result.getString(3));
                    txtNombre_tutor.setText(result.getString(4));
                    txtCorreo_electronico_tutor.setText(result.getString(5));
                }
            }
            consult = "SELECT * FROM direccion_vivienda WHERE CURP_tutor = \"" + CURP_tutor + "\";";
            result = PS.executeQuery(consult);
            if(result != null){
                while (result.next()) {
                    txtEstado.setText(result.getString(2));;
                    txtMunicipio.setText(result.getString(3));
                    txtColonia.setText(result.getString(4));
                    txtCalle.setText(result.getString(5));
                    if(result.getString(6) != null)
                        txtNum_ext.setText(result.getString(6));
                    txtNum_int.setText(result.getString(7));
                    txtCodigo_postal.setText(result.getString(8));
                }
            }
            consult = "SELECT * FROM telefonos WHERE CURP_tutor = \"" + CURP_tutor + "\";";
            result = PS.executeQuery(consult);
            if(result != null){
                while (result.next()) {
                    txtLada.setText(result.getString(2));
                    txtNumero_tel.setText(result.getString(3));
                    txtTipo_tel.setText(result.getString(4));
                }
            }
            txtCURP_tutor.setText(CURP_tutor);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex);
        }
    }
    
    public boolean validar(){
        boolean c = false;
        if (txtCURP_tutor.getText().equals("")) { txtRequerido13.setVisible(true); c = true;} else { txtRequerido13.setVisible(false); }
        if (txtNombre_tutor.getText().equals("")) { txtRequerido1.setVisible(true); c = true;} else { txtRequerido1.setVisible(false); }
        if (txtApellido_paterno_tutor.getText().equals("")) { txtRequerido2.setVisible(true); c = true;} else { txtRequerido2.setVisible(false); }
        if (txtApellido_materno_tutor.getText().equals("")) { txtRequerido3.setVisible(true); c = true;} else { txtRequerido3.setVisible(false); }
        if (txtCorreo_electronico_tutor.getText().equals("")) { txtRequerido4.setVisible(true); c = true;} else { txtRequerido4.setVisible(false); }
        if (txtEstado.getText().equals("")) { txtRequerido5.setVisible(true); c = true;} else { txtRequerido5.setVisible(false); }
        if (txtMunicipio.getText().equals("")) { txtRequerido6.setVisible(true); c = true;} else { txtRequerido6.setVisible(false); }
        if (txtColonia.getText().equals("")) { txtRequerido7.setVisible(true); c = true;} else { txtRequerido7.setVisible(false); }
        if (txtCalle.getText().equals("")) { txtRequerido8.setVisible(true); c = true;} else { txtRequerido8.setVisible(false); }
        if (txtNum_int.getText().equals("")) { txtRequerido9.setVisible(true); c = true;} else { txtRequerido9.setVisible(false); }
        if (txtCodigo_postal.getText().equals("")) { txtRequerido9.setVisible(true); c = true;} else { txtRequerido9.setVisible(false); }
        if (txtLada.getText().equals("")) { txtRequerido10.setVisible(true); c = true;} else { txtRequerido10.setVisible(false); }
        if (txtNumero_tel.getText().equals("")) { txtRequerido11.setVisible(true); c = true;} else { txtRequerido11.setVisible(false); }
        if (txtTipo_tel.getText().equals("")) { txtRequerido12.setVisible(true); c = true;} else { txtRequerido12.setVisible(false); }
        return c;
    }
    
    public boolean validarCorreo (String Correo) {       
        Pattern a = null;
        Matcher b = null;
        a= Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$");
        b = a.matcher(Correo);
        if (b.find())
            return true;
        else 
            return false;
    }
    
    private void txtApellido_paterno_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido_paterno_tutorKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtApellido_paterno_tutorKeyTyped

    private void txtCorreo_electronico_tutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreo_electronico_tutorFocusLost
        if (!validarCorreo(txtCorreo_electronico_tutor.getText()))
            JOptionPane.showMessageDialog(null, "Correo inválido");
    }//GEN-LAST:event_txtCorreo_electronico_tutorFocusLost

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        if (txtEstado.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtEstadoKeyTyped

    private void txtMunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMunicipioKeyTyped
        if (txtMunicipio.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtMunicipioKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        if (txtCalle.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtCalleKeyTyped

    private void btnGuardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar2ActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            return;
        }
        String CURP_tutor = txtCURP_tutor.getText().toUpperCase();
        String Apellido_paterno = txtApellido_paterno_tutor.getText();
        String Apellido_materno = txtApellido_materno_tutor.getText();
        String Nombre = txtNombre_tutor.getText();
        String Correo_electronico = txtCorreo_electronico_tutor.getText();
        String Estado = txtEstado.getText();
        String Municipio = txtMunicipio.getText();
        String Colonia = txtColonia.getText();
        String Calle = txtCalle.getText();
        String Num_ext = txtNum_ext.getText();
        String Num_int = txtNum_int.getText();
        int Codigo_postal = Integer.parseInt(txtCodigo_postal.getText());
        int LADA = Integer.parseInt(txtLada.getText());
        int Numero_tel = Integer.parseInt(txtNumero_tel.getText());
        String Tipo = txtTipo_tel.getText();

        Consultas CN = new Consultas();
        String consult = "INSERT INTO tutores (CURP_tutor, Apellido_paterno, Apellido_materno, Nombre, Correo_electronico) VALUES ("
                + "\"" + CURP_tutor + "\"," + "\"" + Apellido_paterno + "\"," + "\"" + Apellido_materno + "\"," + "\"" + Nombre + "\","
                + "\"" + Correo_electronico + "\");";
        CN.insert(consult);
        consult = "INSERT INTO direccion_vivienda (ID_direccion, Estado, Municipio, Colonia, Calle, Num_ext, Num_int, Codigo_postal, CURP_tutor) VALUES (null,"
                + "\"" + Estado + "\"," + "\"" + Municipio + "\"," + "\"" + Colonia + "\"," + "\"" + Calle + "\","; 
        if(Num_ext.equals("")) consult = consult + "null";
        else consult = consult + Num_ext;
        consult = consult + "," + Num_int + "," + Codigo_postal + ",\"" + CURP_tutor +"\");";
        CN.insert(consult);
        consult = "INSERT INTO telefonos (ID_tel_tutor, LADA, Numero_tel, Tipo, CURP_tutor) VALUES (null," + LADA +"," + Numero_tel +"," + "\"" + Tipo + "\",\"" + CURP_tutor + "\");";
        if(CN.insert(consult)) JOptionPane.showMessageDialog(null, "Registro exitoso");
        this.dispose();
        //sonidoBotones.play();
    }//GEN-LAST:event_btnGuardar2ActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelar2ActionPerformed

    private void txtNum_intKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum_intKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || (txtNum_int.getText().length()>=6))
            evt.consume();
    }//GEN-LAST:event_txtNum_intKeyTyped

    private void txtCURP_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCURP_tutorKeyTyped
        char c = evt.getKeyChar();
        if (txtCURP_tutor.getText().length()>=18)
            evt.consume();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtCURP_tutorKeyTyped

    private void txtLadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLadaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtLada.getText().length()>=3)
            evt.consume();
    }//GEN-LAST:event_txtLadaKeyTyped

    private void txtTipo_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipo_telKeyTyped
        char c = evt.getKeyChar();
        if (txtTipo_tel.getText().length()>=15)
            evt.consume();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtTipo_telKeyTyped

    private void txtApellido_materno_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido_materno_tutorKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtApellido_materno_tutorKeyTyped

    private void txtColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyTyped
        if (txtColonia.getText().length()>=50)
            evt.consume();
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtColoniaKeyTyped

    private void txtNumero_telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumero_telKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtNumero_tel.getText().length()>=7)
            evt.consume();
    }//GEN-LAST:event_txtNumero_telKeyTyped

    private void txtCodigo_postalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo_postalKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtCodigo_postal.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtCodigo_postalKeyTyped

    private void txtNombre_tutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_tutorKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtNombre_tutorKeyTyped

    private void btnActualizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar2ActionPerformed
        if(validar()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            return;
        }
        String CURP_tutor = txtCURP_tutor.getText().toUpperCase();
        String Apellido_paterno = txtApellido_paterno_tutor.getText();
        String Apellido_materno = txtApellido_materno_tutor.getText();
        String Nombre = txtNombre_tutor.getText();
        String Correo_electronico = txtCorreo_electronico_tutor.getText();
        String Estado = txtEstado.getText();
        String Municipio = txtMunicipio.getText();
        String Colonia = txtColonia.getText();
        String Calle = txtCalle.getText();
        String Num_ext = txtNum_ext.getText();
        String Num_int = txtNum_int.getText();
        int Codigo_postal = Integer.parseInt(txtCodigo_postal.getText());
        int LADA = Integer.parseInt(txtLada.getText());
        int Numero_tel = Integer.parseInt(txtNumero_tel.getText());
        String Tipo = txtTipo_tel.getText();
        
        Consultas CP = new Consultas();
        String consult = "UPDATE telefonos SET LADA = " + LADA + ", Numero_tel = " + Numero_tel + ", Tipo = \"" + Tipo + "\" WHERE CURP_tutor = \"" + CURP_tutor + "\";";
        CP.insert(consult);
        consult = "UPDATE direccion_vivienda SET Estado = \"" + Estado + "\", Municipio = \"" + Municipio + "\", Colonia = \"" + Colonia + "\", Calle = \""
                + Calle + "\", Num_ext = ";
        if(Num_ext.equals("")) consult = consult + "NULL";
        else consult = consult + Num_ext;
        consult = consult + ", Num_int = " + Num_int + ", Codigo_postal = " + Codigo_postal + " WHERE CURP_tutor = \"" + CURP_tutor + "\";";
        CP.insert(consult);
        consult = "UPDATE tutores SET Apellido_paterno = \"" + Apellido_paterno + "\", Apellido_materno = \"" + Apellido_materno + "\", Nombre = \"" + Nombre + "\", Correo_electronico = \""
                + Correo_electronico + "\" WHERE CURP_tutor = \"" + CURP_tutor + "\";";
        if(CP.insert(consult)){
            JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            this.dispose();
        }
        
        //sonidoBotones.play();
    }//GEN-LAST:event_btnActualizar2ActionPerformed

    private void txtNum_extKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNum_extKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9')
            evt.consume();
        if (txtNum_ext.getText().length()>=10)
            evt.consume();
    }//GEN-LAST:event_txtNum_extKeyTyped

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
            java.util.logging.Logger.getLogger(Agregar_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_tutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_tutor dialog = new Agregar_tutor(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnActualizar2;
    private javax.swing.JButton btnCancelar2;
    public static javax.swing.JButton btnGuardar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtApellido_materno_tutor;
    public static javax.swing.JTextField txtApellido_paterno_tutor;
    public static javax.swing.JTextField txtCURP_tutor;
    public static javax.swing.JTextField txtCalle;
    public static javax.swing.JTextField txtCodigo_postal;
    public static javax.swing.JTextField txtColonia;
    public static javax.swing.JTextField txtCorreo_electronico_tutor;
    public static javax.swing.JTextField txtEstado;
    public static javax.swing.JTextField txtLada;
    public static javax.swing.JTextField txtMunicipio;
    public static javax.swing.JTextField txtNombre_tutor;
    public static javax.swing.JTextField txtNum_ext;
    public static javax.swing.JTextField txtNum_int;
    public static javax.swing.JTextField txtNumero_tel;
    private javax.swing.JLabel txtRequerido1;
    private javax.swing.JLabel txtRequerido10;
    private javax.swing.JLabel txtRequerido11;
    private javax.swing.JLabel txtRequerido12;
    private javax.swing.JLabel txtRequerido13;
    private javax.swing.JLabel txtRequerido2;
    private javax.swing.JLabel txtRequerido3;
    private javax.swing.JLabel txtRequerido4;
    private javax.swing.JLabel txtRequerido5;
    private javax.swing.JLabel txtRequerido6;
    private javax.swing.JLabel txtRequerido7;
    private javax.swing.JLabel txtRequerido8;
    private javax.swing.JLabel txtRequerido9;
    public static javax.swing.JTextField txtTipo_tel;
    // End of variables declaration//GEN-END:variables
}
