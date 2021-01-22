package Programa_asistencia;

import Conexion_asistencia.Conector;
import Conexion_asistencia.Consultas;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Asistencia extends javax.swing.JDialog {
    
    private ResultSet RS;
    private PreparedStatement PS;
    private Conector CN;

    public Asistencia(java.awt.Frame parent, boolean modal) {
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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAsistencia = new javax.swing.JTable();
        txtAño_fin = new javax.swing.JTextField();
        txtAño_inicio = new javax.swing.JTextField();
        lblAño = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        cmbMes_inicio = new javax.swing.JComboBox<>();
        cmbMes_fin = new javax.swing.JComboBox<>();
        cmbDia_fin = new javax.swing.JComboBox<>();
        cmbDia_inicio = new javax.swing.JComboBox<>();
        lblDia = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblFin = new javax.swing.JLabel();
        cmbGrado = new javax.swing.JComboBox<>();
        cmbGrupo = new javax.swing.JComboBox<>();
        lblDia_registrado = new javax.swing.JLabel();
        lblGrupo = new javax.swing.JLabel();
        lblGrado = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaAsistencia.setBackground(new java.awt.Color(219, 239, 251));
        TablaAsistencia.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        TablaAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaAsistencia);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 108, 730, -1));

        txtAño_fin.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtAño_fin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAño_finKeyTyped(evt);
            }
        });
        jPanel1.add(txtAño_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 53, -1));

        txtAño_inicio.setFont(new java.awt.Font("Berlin Sans FB", 0, 13)); // NOI18N
        txtAño_inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAño_inicioKeyTyped(evt);
            }
        });
        jPanel1.add(txtAño_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 53, -1));

        lblAño.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblAño.setText("Año");
        jPanel1.add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        lblMes.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblMes.setText("Mes");
        jPanel1.add(lblMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        cmbMes_inicio.setBackground(new java.awt.Color(13, 108, 140));
        cmbMes_inicio.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbMes_inicio.setForeground(new java.awt.Color(255, 255, 255));
        cmbMes_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cmbMes_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, -1, -1));

        cmbMes_fin.setBackground(new java.awt.Color(13, 108, 140));
        cmbMes_fin.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbMes_fin.setForeground(new java.awt.Color(255, 255, 255));
        cmbMes_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        jPanel1.add(cmbMes_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        cmbDia_fin.setBackground(new java.awt.Color(13, 108, 140));
        cmbDia_fin.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbDia_fin.setForeground(new java.awt.Color(255, 255, 255));
        cmbDia_fin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDia_fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        cmbDia_inicio.setBackground(new java.awt.Color(13, 108, 140));
        cmbDia_inicio.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbDia_inicio.setForeground(new java.awt.Color(255, 255, 255));
        cmbDia_inicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(cmbDia_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        lblDia.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblDia.setText("Día");
        jPanel1.add(lblDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lblInicio.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblInicio.setText("Inicio");
        jPanel1.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lblFin.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblFin.setText("Fin");
        jPanel1.add(lblFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmbGrado.setBackground(new java.awt.Color(13, 108, 140));
        cmbGrado.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbGrado.setForeground(new java.awt.Color(255, 255, 255));
        cmbGrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        jPanel1.add(cmbGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        cmbGrupo.setBackground(new java.awt.Color(13, 108, 140));
        cmbGrupo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cmbGrupo.setForeground(new java.awt.Color(255, 255, 255));
        cmbGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N" }));
        jPanel1.add(cmbGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        lblDia_registrado.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblDia_registrado.setText("Días registrados: ");
        jPanel1.add(lblDia_registrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        lblGrupo.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblGrupo.setText("Grupo");
        jPanel1.add(lblGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        lblGrado.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        lblGrado.setText("Grado");
        jPanel1.add(lblGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        btnConsultar.setBackground(new java.awt.Color(13, 108, 140));
        btnConsultar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 120, 30));

        btnRegresar.setBackground(new java.awt.Color(13, 108, 140));
        btnRegresar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Cancelar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int diaMes(int mes, int año){
        switch(mes)
	{
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		return 31;
	case 4: case 6: case 9: case 11:
		return 30;
	case 2: if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) return 29;
                else return 28;
        }
        return -1;
    }
    
    private void txtAño_inicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAño_inicioKeyTyped
        char dato = evt.getKeyChar();
        if (dato > '9'|| dato < '0') evt.consume();
        if (txtAño_inicio.getText().length()>=4) evt.consume();
    }//GEN-LAST:event_txtAño_inicioKeyTyped

    private void txtAño_finKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAño_finKeyTyped
        char dato = evt.getKeyChar();
        if (dato > '9'|| dato < '0') evt.consume();
        if (txtAño_fin.getText().length()>=4) evt.consume();
    }//GEN-LAST:event_txtAño_finKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        //sonidoBotones.play();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        Consultas CS = new Consultas();
        int añoi = 0, añof = 0;
        try {
            añoi = Integer.parseInt(txtAño_inicio.getText());
            añof = Integer.parseInt(txtAño_fin.getText());
            if((añoi < 2018 || añoi > 3000) || (añof < 2018 || añof > 3000)){
                JOptionPane.showMessageDialog(null, "Años fuera de rango");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese años validos");
        }
        int diai = Integer.parseInt((String) cmbDia_inicio.getSelectedItem());
        int diaf = Integer.parseInt((String) cmbDia_fin.getSelectedItem());
        int mesi = cmbMes_inicio.getSelectedIndex() + 1;
        int mesf = cmbMes_fin.getSelectedIndex() + 1;
        if(diai > diaMes(mesi, añoi) || diaf > diaMes(mesf, añof)){
            JOptionPane.showMessageDialog(null, "Día no valido");
            return;
        }
        if(añoi >= añof){
            if(mesi >= mesf){
                if(diai >= diaf){
                    if(diai != diaf || mesi != mesf || añoi != añof){
                        JOptionPane.showMessageDialog(null, "Fechas inválidas");
                        return;
                    }
                }
            }
        }
        int grado = cmbGrado.getSelectedIndex() + 1;
        String Sgrupo = (String) cmbGrupo.getSelectedItem();
        char grupo = Sgrupo.charAt(0);
        PS = null;
        CN = new Conector();
        if(CN == null){
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
            return;
        }
        ResultSet result = null;
        String CONSULT = "SELECT curp_alumno FROM alumnos WHERE grado = " + grado + " AND grupo = \"" + grupo + "\";";
        String CURP[] = new String[CS.consultInt("SELECT COUNT(*) FROM alumnos WHERE grado = " + grado + " AND grupo = \"" + grupo + "\";")];
        String fecha[] = new String[366];
        /*String fecha[] = new String[1];
        String fechaAux[] = new String[2];*/
        int cantAlumnos;
        int i = 0;
        try {
            PS = CN.connectMySQL().prepareStatement(CONSULT);
            result = PS.executeQuery(CONSULT);
            if(result != null){
                while (result.next()) {
                    CURP[i] = result.getString(1);
                    //System.out.println(CURP[i]);
                    i++;
                }
            }
            int totalAsist = 0;
            cantAlumnos = i;
            i = 0;
            boolean band = true;
            for(int año = añoi; año <= añof; año++){
                for(int mes = 1; mes <= 12; mes++){
                    for(int dia = 1; dia <= 31; dia++){
                        if(band == true){
                            dia = diai;
                            mes = mesi;
                            band = false;
                        }
                        result = null;
                        CONSULT = "SELECT COUNT(*) FROM asistencia_alumnos WHERE dia = " + dia + " AND mes = " + mes + " AND año = " + año + ";";
                        result = PS.executeQuery(CONSULT);
                        if(result != null){
                            while (result.next()) {
                                totalAsist = result.getInt(1);
                                if(totalAsist > 0){
                                    //System.out.println(CONSULT + " " + totalAsist);
                                    /*fechaAux = fecha;
                                    fecha = new String[i + 1];
                                    fecha = fechaAux;
                                    fecha[i] = String.valueOf(totalAsist);
                                    fechaAux = new String[i + 2];*/
                                    fecha[i] = "dia = " + dia + " AND mes = " + mes + " AND año = " + año;
                                    i++;
                                }
                            }
                        }
                        if(dia == diaf && mes == mesf && año == añof){
                            dia = 31;
                            mes = 12;
                        }
                    }
                }
            }
            //System.out.println("------------------------------");
            for(int j = 0; j < i; j++){
                //System.out.println(fecha[j]); ///////////////////////
            }

            result = null;
            int faltas[] = new int[cantAlumnos];
            for(int j = 0; j < cantAlumnos; j++){
                for(int k = 0; k < i; k++){
                    CONSULT = "SELECT COUNT(*) FROM asistencia_alumnos WHERE " + fecha[k] + " AND CURP_alumno = \"" + CURP[j] + "\";";
                    result = PS.executeQuery(CONSULT);
                    if(result != null){
                        while (result.next()) {
                            int dato = result.getInt(1);
                            //System.out.println(CONSULT1 + ' ' + dato); ///////////////////////////////////////
                            if(dato == 0){
                                faltas[j] = faltas[j] + 1;
                            }
                        }
                    }
                }
            }

            //***********************************************************************************************************************

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido paterno");
            modelo.addColumn("Apellido materno");
            modelo.addColumn("Faltas");
            modelo.addColumn("Asistencias");
            TablaAsistencia.setModel(modelo);
            String [] datos = new String[5];
            result = null;
            /*System.out.println("----------------------------------");
            System.out.println("Total de dias registrados: " + i);
            System.out.println("----------------------------------");
            System.out.println("Nombre                     |Faltas");
            System.out.println("----------------------------------");*/
            for(int j = 0; j < cantAlumnos; j++){
                CONSULT = "SELECT Nombre, Apellido_paterno, Apellido_materno from alumnos where CURP_alumno = \"" + CURP[j] + "\";";
                result = PS.executeQuery(CONSULT);
                if(result != null){
                    while (result.next()) {
                        //System.out.println(result.getString(1) + ' ' + result.getString(2) + ' ' + result.getString(3) + "\t" + faltas[j]);
                        datos [0]= result.getString(1);
                        datos [1]= result.getString(2);
                        datos [2]= result.getString(3);
                        datos [3]= Integer.toString(faltas[j]);
                        datos [4]= Integer.toString(i - faltas[j]);

                        modelo.addRow(datos);
                    }
                    TablaAsistencia.setModel(modelo);
                    lblDia_registrado.setText("Días registrados: " + i);
                }
            }

            //**************************************************************************************************************************

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return;
        }

        //sonidoBotones.play();

    }//GEN-LAST:event_btnConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Asistencia dialog = new Asistencia(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable TablaAsistencia;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbDia_fin;
    private javax.swing.JComboBox<String> cmbDia_inicio;
    private javax.swing.JComboBox<String> cmbGrado;
    private javax.swing.JComboBox<String> cmbGrupo;
    private javax.swing.JComboBox<String> cmbMes_fin;
    private javax.swing.JComboBox<String> cmbMes_inicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblDia_registrado;
    private javax.swing.JLabel lblFin;
    private javax.swing.JLabel lblGrado;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblMes;
    private javax.swing.JTextField txtAño_fin;
    private javax.swing.JTextField txtAño_inicio;
    // End of variables declaration//GEN-END:variables
}
