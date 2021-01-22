package Programa_biblioteca;

import Conexion_biblioteca.Arduino;
import Conexion_biblioteca.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Agregar_alumno extends javax.swing.JDialog {

    public Agregar_alumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
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
        Arduino.setTextField(lblRFID_alumno);
        txtRequerido1.setVisible(false);
        txtRequerido2.setVisible(false);
        txtRequerido3.setVisible(false);
        txtRequerido4.setVisible(false);
        txtRequerido5.setVisible(false);
        txtRequerido6.setVisible(false);
        txtRequerido7.setVisible(false);
        txtRequerido8.setVisible(false);
        txtRequerido9.setVisible(false);
        txtObligatorio1.setVisible(false);
        
        if(Parametros.Comp){
            txtCURP_alumno1.setEnabled(false);
            txtCURP_alumno1.setText(Parametros.CURP_alumno);
            txtNombre_alumno.setText(Parametros.Nombre);
            txtApellido_paterno_alumno.setText(Parametros.Apellido_paterno);
            txtApellido_materno_alumno.setText(Parametros.Apellido_materno);
            txtAula.setText(Parametros.Aula);
            txtCURP_tutor1.setText(Parametros.CURP_tutor);
            lblRFID_alumno.setText(Parametros.RFID_alumno);
            cmbSexo_alumno.setSelectedItem(Parametros.Sexo);
            cmbGrupo_alumno.setSelectedItem(Parametros.Grupo);
            cmbDia_nacimiento.setSelectedIndex(Parametros.Dia);
            cmbMes_nacimiento.setSelectedIndex(Parametros.Mes);
            cmbAño_nacimiento.setSelectedItem(Parametros.Año);
            cmbGrado_alumno.setSelectedIndex(Parametros.Grado);
            cmbID_horario.setSelectedIndex(Parametros.Horario);
            Parametros.Comp = false;
            btnGuardar1.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido_paterno_alumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido_materno_alumno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbSexo_alumno = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbGrado_alumno = new javax.swing.JComboBox<>();
        cmbGrupo_alumno = new javax.swing.JComboBox<>();
        btnGuardar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbID_horario = new javax.swing.JComboBox<>();
        txtRequerido1 = new javax.swing.JLabel();
        txtRequerido2 = new javax.swing.JLabel();
        txtRequerido3 = new javax.swing.JLabel();
        txtRequerido4 = new javax.swing.JLabel();
        txtRequerido5 = new javax.swing.JLabel();
        txtRequerido6 = new javax.swing.JLabel();
        txtRequerido7 = new javax.swing.JLabel();
        txtRequerido8 = new javax.swing.JLabel();
        txtRequerido9 = new javax.swing.JLabel();
        txtObligatorio1 = new javax.swing.JLabel();
        cmbDia_nacimiento = new javax.swing.JComboBox<>();
        cmbMes_nacimiento = new javax.swing.JComboBox<>();
        cmbAño_nacimiento = new javax.swing.JComboBox<>();
        lblRFID_alumno = new javax.swing.JTextField();
        txtAula = new javax.swing.JTextField();
        btnCancelar1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        txtNombre_alumno = new javax.swing.JTextField();
        txtCURP_tutor1 = new javax.swing.JTextField();
        txtCURP_alumno1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(132, 212, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtApellido_paterno_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtApellido_paterno_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido_paterno_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido_paterno_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 250, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setText("Apellido materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        txtApellido_materno_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtApellido_materno_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellido_materno_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellido_materno_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 250, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setText("CURP del alumno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setText("RFID:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setText("Sexo:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        cmbSexo_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbSexo_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));
        jPanel1.add(cmbSexo_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 120, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel8.setText("Grado:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel9.setText("Grupo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, 30));

        cmbGrado_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbGrado_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(cmbGrado_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 120, 30));

        cmbGrupo_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbGrupo_alumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N" }));
        jPanel1.add(cmbGrupo_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 120, 30));

        btnGuardar1.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 100, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 12)); // NOI18N
        jLabel2.setText("Favor de pasar la tarjeta para leer el RFID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel11.setText("Fecha de Nacimiento");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel12.setText("Dia:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 40, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel13.setText("Mes:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 40, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel14.setText("Año:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 40, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel16.setText("CURP del tutor:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel17.setText("Aula:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Horario:");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 70, -1));

        cmbID_horario.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbID_horario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Matutino", "Vespertino" }));
        jPanel1.add(cmbID_horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 120, 30));

        txtRequerido1.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido1.setText("REQUERIDO");
        jPanel1.add(txtRequerido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 90, 30));

        txtRequerido2.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido2.setText("REQUERIDO");
        jPanel1.add(txtRequerido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 90, 30));

        txtRequerido3.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido3.setText("REQUERIDO");
        jPanel1.add(txtRequerido3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 90, 30));

        txtRequerido4.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido4.setText("REQUERIDO");
        jPanel1.add(txtRequerido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 90, 30));

        txtRequerido5.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido5.setText("REQUERIDO");
        jPanel1.add(txtRequerido5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 90, 30));

        txtRequerido6.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido6.setText("REQUERIDO");
        jPanel1.add(txtRequerido6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 90, 30));

        txtRequerido7.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido7.setText("REQUERIDO");
        jPanel1.add(txtRequerido7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 100, 30));

        txtRequerido8.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido8.setText("REQUERIDO");
        jPanel1.add(txtRequerido8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, 30));

        txtRequerido9.setBackground(new java.awt.Color(255, 255, 255));
        txtRequerido9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtRequerido9.setText("REQUERIDO");
        jPanel1.add(txtRequerido9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 90, 20));

        txtObligatorio1.setBackground(new java.awt.Color(255, 255, 255));
        txtObligatorio1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtObligatorio1.setText("OBLIGATORIO");
        jPanel1.add(txtObligatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 100, 20));

        cmbDia_nacimiento.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbDia_nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDia_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 120, 30));

        cmbMes_nacimiento.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbMes_nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(cmbMes_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 120, 30));

        cmbAño_nacimiento.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbAño_nacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        jPanel1.add(cmbAño_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 120, 30));

        lblRFID_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblRFID_alumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lblRFID_alumno.setEnabled(false);
        lblRFID_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblRFID_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(lblRFID_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 260, -1));

        txtAula.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtAula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 120, 30));

        btnCancelar1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 100, 30));

        btnActualizar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar ");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 100, 30));

        txtNombre_alumno.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtNombre_alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombre_alumnoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 250, 30));

        txtCURP_tutor1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCURP_tutor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCURP_tutor1KeyTyped(evt);
            }
        });
        jPanel1.add(txtCURP_tutor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 260, -1));

        txtCURP_alumno1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        txtCURP_alumno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCURP_alumno1KeyTyped(evt);
            }
        });
        jPanel1.add(txtCURP_alumno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 250, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void validar(){
        if (txtNombre_alumno.getText().equals("")) { txtRequerido1.setVisible(true); } else { txtRequerido1.setVisible(false); }
        if (txtNombre_alumno.getText().equals("")) { txtRequerido2.setVisible(true); } else { txtRequerido2.setVisible(false); }
        if (txtApellido_paterno_alumno.getText().equals("")) { txtRequerido3.setVisible(true); } else { txtRequerido3.setVisible(false); }
        if (txtApellido_materno_alumno.getText().equals("")) { txtRequerido4.setVisible(true); } else { txtRequerido4.setVisible(false); }
        if (cmbDia_nacimiento.getSelectedItem().equals("Seleccionar")) { txtRequerido7.setVisible(true); } else { txtRequerido7.setVisible(false); }
        if (cmbMes_nacimiento.getSelectedItem().equals("Seleccionar")) { txtRequerido7.setVisible(true); } else { txtRequerido7.setVisible(false); }
        if (cmbAño_nacimiento.getSelectedItem().equals("Seleccionar")) { txtRequerido8.setVisible(true); } else { txtRequerido8.setVisible(false); }
        if (cmbSexo_alumno.getSelectedItem().equals("Seleccionar")) { txtRequerido5.setVisible(true); } else { txtRequerido5.setVisible(false); }
        if (cmbGrado_alumno.getSelectedItem().equals("Seleccionar")) { txtRequerido6.setVisible(true); } else { txtRequerido6.setVisible(false); }
        if (cmbGrupo_alumno.getSelectedItem().equals("Seleccionar")) { txtRequerido6.setVisible(true); } else { txtRequerido6.setVisible(false); }
        if (txtAula.getText().equals("")) { txtRequerido5.setVisible(true); } else { txtRequerido5.setVisible(false); }
        if (lblRFID_alumno.getText().equals("")) { txtObligatorio1.setVisible(true); } else { txtObligatorio1.setVisible(false); }
        if (cmbID_horario.getSelectedItem().equals("Seleccionar")) { txtRequerido8.setVisible(true); } else { txtRequerido8.setVisible(false); }
        if (lblRFID_alumno.getText().equals("")) { txtRequerido9.setVisible(true); } else { txtRequerido9.setVisible(false); }
    }
    
    private void txtApellido_paterno_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido_paterno_alumnoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
        evt.consume();
    }//GEN-LAST:event_txtApellido_paterno_alumnoKeyTyped

    private void txtApellido_materno_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellido_materno_alumnoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
        evt.consume();
    }//GEN-LAST:event_txtApellido_materno_alumnoKeyTyped

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        validar();
        String CURP_alumno, Nombre, Apellido_paterno, Apellido_materno, Sexo, Grupo, RFID, CURP_tutor;
        int Dia_nacimiento, Mes_nacimiento, Año_nacimiento, Grado, Aula, ID_horario;
        try {
            CURP_alumno = txtCURP_alumno1.getText().toUpperCase();
            Nombre = txtNombre_alumno.getText();
            Apellido_paterno = txtApellido_paterno_alumno.getText();
            Apellido_materno = txtApellido_materno_alumno.getText();
            Dia_nacimiento = Integer.parseInt((String) cmbDia_nacimiento.getSelectedItem());
            Mes_nacimiento = Integer.parseInt((String) cmbMes_nacimiento.getSelectedItem());
            Año_nacimiento = Integer.parseInt((String) cmbAño_nacimiento.getSelectedItem());
            Sexo = (String) cmbSexo_alumno.getSelectedItem();
            Grado = Integer.parseInt((String) cmbGrado_alumno.getSelectedItem());
            Grupo = (String) cmbGrupo_alumno.getSelectedItem();
            Aula = Integer.parseInt((String) txtAula.getText());
            RFID = lblRFID_alumno.getText();
            ID_horario = cmbID_horario.getSelectedIndex();
            CURP_tutor = txtCURP_tutor1.getText().toUpperCase();
        } catch (Exception e) {
            return;
        }

        //sonidoBotones.play();

        if (txtNombre_alumno.getText().equals("") || txtNombre_alumno.getText().equals("") || txtApellido_paterno_alumno.getText().equals("") || txtApellido_materno_alumno.getText().equals("")
            || cmbDia_nacimiento.getSelectedItem().equals("Seleccionar") || cmbMes_nacimiento.getSelectedItem().equals("Seleccionar") || cmbAño_nacimiento.getSelectedItem().equals("Seleccionar")
            || cmbSexo_alumno.getSelectedItem().equals("Seleccionar") || cmbGrado_alumno.getSelectedItem().equals("Seleccionar") || cmbGrupo_alumno.getSelectedItem().equals("Seleccionar")
            || txtAula.getText().equals("") || lblRFID_alumno.getText().equals("") || cmbID_horario.getSelectedItem().equals("Seleccionar") || lblRFID_alumno.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "DEBE LLENAR TODOS LOS CAMPOS");
            txtNombre_alumno.requestFocus();
        } else {
            String consult = "UPDATE alumnos SET Nombre = '" + txtNombre_alumno.getText() + "', Apellido_paterno = '" + txtApellido_paterno_alumno.getText() + "', Apellido_materno = '" + txtApellido_materno_alumno.getText() + "', Dia_nacimiento = " + cmbDia_nacimiento.getSelectedItem()+ ", Mes_nacimiento = " + cmbMes_nacimiento.getSelectedItem()+ ", Año_nacimiento = " + cmbAño_nacimiento.getSelectedItem() + ", Sexo = '" + cmbSexo_alumno.getSelectedItem() + "', Grado = " + cmbGrado_alumno.getSelectedItem() + ", Grupo = '" + cmbGrupo_alumno.getSelectedItem() + "', Aula = '" + txtAula.getText() + "', RFID = '" + lblRFID_alumno.getText() + "', ID_horario = " + cmbID_horario.getSelectedIndex() + ", CURP_tutor = '" + txtCURP_tutor1.getText() + "' WHERE CURP_alumno = '" + txtCURP_alumno1.getText() + "';";
            Consultas CP = new Consultas();
            if(CP.consult(consult)) JOptionPane.showMessageDialog(null, "Registro exitoso");
            this.dispose();
        }
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void lblRFID_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblRFID_alumnoKeyTyped
        if (lblRFID_alumno.getText().length() >= 11)
        evt.consume();
    }//GEN-LAST:event_lblRFID_alumnoKeyTyped

    private void txtAulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAulaKeyTyped
        int caracterespermitidos = 2;
        if (txtAula.getText().length() >= 2)
        evt.consume();
        char numero = evt.getKeyChar();
        if (numero < '0' || numero > '9')
        evt.consume();
    }//GEN-LAST:event_txtAulaKeyTyped

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        this.dispose();
        //sonidoBotones.play();
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        String Consult = "UPDATE alumnos SET Apellido_materno='" + txtApellido_materno_alumno.getText() + "',Apellido_paterno='" + txtApellido_paterno_alumno.getText() + "',Aula='" + txtAula.getText() + "',Nombre='" + txtNombre_alumno.getText() + "',Dia_nacimiento='" + cmbDia_nacimiento.getSelectedItem() + "',Mes_nacimiento='" + cmbMes_nacimiento.getSelectedItem() + "',RFID='" + lblRFID_alumno.getText() + "' WHERE CURP_alumno='" + txtCURP_alumno1.getText() + "'";
        Consultas CP = new Consultas();
        if(CP.consult(Consult)) JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
        this.dispose();
        //sonidoBotones.play();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtNombre_alumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombre_alumnoKeyTyped
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && !(c == ' ') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtNombre_alumnoKeyTyped

    private void txtCURP_tutor1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCURP_tutor1KeyTyped
        char c = evt.getKeyChar();
        if (txtCURP_tutor1.getText().length()>=18)
            evt.consume();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtCURP_tutor1KeyTyped

    private void txtCURP_alumno1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCURP_alumno1KeyTyped
        char c = evt.getKeyChar();
        if (txtCURP_alumno1.getText().length()>=18)
            evt.consume();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && !(c == 'ñ') && !(c == 'Ñ'))
            evt.consume();
    }//GEN-LAST:event_txtCURP_alumno1KeyTyped

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
            java.util.logging.Logger.getLogger(Agregar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_alumno dialog = new Agregar_alumno(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar1;
    public static javax.swing.JButton btnGuardar1;
    public static javax.swing.JComboBox<String> cmbAño_nacimiento;
    public static javax.swing.JComboBox<String> cmbDia_nacimiento;
    public static javax.swing.JComboBox<String> cmbGrado_alumno;
    public static javax.swing.JComboBox<String> cmbGrupo_alumno;
    public static javax.swing.JComboBox<String> cmbID_horario;
    public static javax.swing.JComboBox<String> cmbMes_nacimiento;
    public static javax.swing.JComboBox<String> cmbSexo_alumno;
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
    public static javax.swing.JTextField lblRFID_alumno;
    public static javax.swing.JTextField txtApellido_materno_alumno;
    public static javax.swing.JTextField txtApellido_paterno_alumno;
    public static javax.swing.JTextField txtAula;
    public static javax.swing.JTextField txtCURP_alumno1;
    public static javax.swing.JTextField txtCURP_tutor1;
    public static javax.swing.JTextField txtNombre_alumno;
    private javax.swing.JLabel txtObligatorio1;
    private javax.swing.JLabel txtRequerido1;
    private javax.swing.JLabel txtRequerido2;
    private javax.swing.JLabel txtRequerido3;
    private javax.swing.JLabel txtRequerido4;
    private javax.swing.JLabel txtRequerido5;
    private javax.swing.JLabel txtRequerido6;
    private javax.swing.JLabel txtRequerido7;
    private javax.swing.JLabel txtRequerido8;
    private javax.swing.JLabel txtRequerido9;
    // End of variables declaration//GEN-END:variables

}