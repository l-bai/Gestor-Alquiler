/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;
import DAO.*;
import gestionBBDD.ConectaBBDD;
import gestionBBDD.LibreriaUsoBBDD;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Lidia Baixauli de la Villa
 */
public class JFcond_alta extends javax.swing.JFrame {

    /**
     * Creates new form jFnewVeh
     */
    ConectaBBDD con = new ConectaBBDD();
    
    public JFcond_alta() {
        initComponents();
        setLocationRelativeTo(null);
        
        //ponemos el número de clientes totales
        int numCond;
        try{
            con.conecta();
            con.crearSentencia();
            con.ejecutaSQL("SELECT * FROM Clientes");
            numCond = con.tamanyo();
            con.cerrarConexion();
            jLtotalCond.setText(Integer.toString(numCond));
        
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error Conexión!!", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error!!", JOptionPane.ERROR_MESSAGE);
        }
        
       
        jBaddCond.setEnabled(false);

        //se bloquean los botones hasta validar dni
        jPdatosCond.setVisible(false);
        jPbotonera.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPdatosCond = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTFnom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFedad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTFany = new javax.swing.JTextField();
        jLerrorNom = new javax.swing.JLabel();
        jLerrorEdad = new javax.swing.JLabel();
        jLerrorAnyosCarne = new javax.swing.JLabel();
        jLerrorpma = new javax.swing.JLabel();
        jTFape = new javax.swing.JTextField();
        jLerrorApe = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPintroMat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFTdni = new javax.swing.JFormattedTextField();
        jBcheckDni = new javax.swing.JButton();
        jLerrorDni = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLtotalCond = new javax.swing.JLabel();
        jPbotonera = new javax.swing.JPanel();
        jBaddCond = new javax.swing.JButton();
        jBvalidaDatos_ = new javax.swing.JButton();
        jBcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo conductor");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 134, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 300));

        jPdatosCond.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Nombre:");

        jTFnom.setBackground(new java.awt.Color(153, 204, 255));
        jTFnom.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFnom.setForeground(new java.awt.Color(0, 0, 153));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Edad:");

        jTFedad.setBackground(new java.awt.Color(153, 204, 255));
        jTFedad.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFedad.setForeground(new java.awt.Color(0, 0, 153));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Años Carné:");

        jTFany.setBackground(new java.awt.Color(153, 204, 255));
        jTFany.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFany.setForeground(new java.awt.Color(0, 0, 153));

        jLerrorNom.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorNom.setForeground(new java.awt.Color(255, 0, 51));

        jLerrorEdad.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorEdad.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorEdad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLerrorAnyosCarne.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorAnyosCarne.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorAnyosCarne.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLerrorpma.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorpma.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorpma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jTFape.setBackground(new java.awt.Color(153, 204, 255));
        jTFape.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFape.setForeground(new java.awt.Color(0, 0, 153));

        jLerrorApe.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorApe.setForeground(new java.awt.Color(255, 0, 51));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Apellidos:");

        javax.swing.GroupLayout jPdatosCondLayout = new javax.swing.GroupLayout(jPdatosCond);
        jPdatosCond.setLayout(jPdatosCondLayout);
        jPdatosCondLayout.setHorizontalGroup(
            jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosCondLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosCondLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFedad, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFany, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(jPdatosCondLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLerrorApe, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFape, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPdatosCondLayout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLerrorNom, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFnom, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPdatosCondLayout.createSequentialGroup()
                            .addGap(444, 444, 444)
                            .addComponent(jLerrorpma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPdatosCondLayout.createSequentialGroup()
                        .addComponent(jLerrorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLerrorAnyosCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44))
        );
        jPdatosCondLayout.setVerticalGroup(
            jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosCondLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLerrorNom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLerrorApe, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPdatosCondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLerrorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLerrorAnyosCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLerrorpma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPintroMat.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Introduzca el D.N.I. :");

        jFTdni.setBackground(new java.awt.Color(255, 255, 255));
        jFTdni.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        jFTdni.setForeground(new java.awt.Color(0, 0, 153));
        try {
            jFTdni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-?")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTdni.setAlignmentX(10.0F);
        jFTdni.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTdni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jFTdni.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jFTdni.setPreferredSize(new java.awt.Dimension(38, 22));

        jBcheckDni.setBackground(new java.awt.Color(164, 164, 140));
        jBcheckDni.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBcheckDni.setForeground(new java.awt.Color(51, 51, 0));
        jBcheckDni.setText("Comprobar DNI");
        jBcheckDni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheckDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckDniActionPerformed(evt);
            }
        });

        jLerrorDni.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorDni.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPintroMatLayout = new javax.swing.GroupLayout(jPintroMat);
        jPintroMat.setLayout(jPintroMatLayout);
        jPintroMatLayout.setHorizontalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPintroMatLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLerrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcheckDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))))
        );
        jPintroMatLayout.setVerticalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPintroMatLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcheckDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Conductor");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº conductores actuales:");

        jLtotalCond.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLtotalCond.setForeground(new java.awt.Color(255, 255, 255));
        jLtotalCond.setText("-");

        jPbotonera.setBackground(new java.awt.Color(51, 134, 209));

        jBaddCond.setBackground(new java.awt.Color(164, 164, 140));
        jBaddCond.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBaddCond.setForeground(new java.awt.Color(51, 51, 0));
        jBaddCond.setText("Añadir conductor");
        jBaddCond.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBaddCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddCondActionPerformed(evt);
            }
        });

        jBvalidaDatos_.setBackground(new java.awt.Color(164, 164, 140));
        jBvalidaDatos_.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBvalidaDatos_.setForeground(new java.awt.Color(51, 51, 0));
        jBvalidaDatos_.setText("Validar datos");
        jBvalidaDatos_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvalidaDatos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvalidaDatos_ActionPerformed(evt);
            }
        });

        jBcancel.setBackground(new java.awt.Color(255, 0, 0));
        jBcancel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jBcancel.setForeground(new java.awt.Color(255, 255, 255));
        jBcancel.setText("X");
        jBcancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPbotoneraLayout = new javax.swing.GroupLayout(jPbotonera);
        jPbotonera.setLayout(jPbotoneraLayout);
        jPbotoneraLayout.setHorizontalGroup(
            jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPbotoneraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBaddCond, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPbotoneraLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jBvalidaDatos_, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                    .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );
        jPbotoneraLayout.setVerticalGroup(
            jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotoneraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jBaddCond, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPbotoneraLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBvalidaDatos_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPintroMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLtotalCond, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPdatosCond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPbotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLtotalCond))))
                .addGap(18, 18, 18)
                .addComponent(jPintroMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPdatosCond, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPbotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcheckDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckDniActionPerformed
       //si el dni no existe y es válida deja seguir el proceso
       boolean dniOk=true,existe;
       String dni = jFTdni.getText().toUpperCase();//con mayúsculas para no tener problemas en BBDD
       //Si el campo no está vacío
       if(jFTdni.getValue()==null){
           jLerrorDni.setText("Introduzca el DNI.");
           jFTdni.setText("");
           jFTdni.requestFocus();
           dniOk = false;
       }else{
           try{
               dniOk = MiLibreria.controlarDNI(dni);
               jLerrorDni.setText("");
               if(dniOk){
                   //si pasa el control, vemos si ya existe
                   try{
                       existe = LibreriaUsoBBDD.existeDni(dni);
                       if (existe) {
                           jLerrorDni.setText("Este conductor ya está registrado");
                           jFTdni.setText("");
                           dniOk = false;
                       }
                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error BBDD. Al buscar DNI!!", JOptionPane.ERROR_MESSAGE);
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
                   }
                   
               }
           }
           catch(ExcepcionPropia e){
               jLerrorDni.setText(e.getMessage());
               dniOk = false;
               jFTdni.setText("");
               jFTdni.requestFocus();
           }
           catch(Exception e){
                dniOk = false;
                jLerrorDni.setText("Fallo al validar el DNI");
            }
           //si es correcto activa botones para rellenar los datos
           if(dniOk){
               jPdatosCond.setVisible(true);
               jPbotonera.setVisible(true);
           }
       }
               
    }//GEN-LAST:event_jBcheckDniActionPerformed

    private void jBvalidaDatos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidaDatos_ActionPerformed
        //Variables
        boolean correcto=true,nomOk,apOk;
        int edad,anyCarne;
        //validamos q el campo del nombre no está vacío
        if(jTFnom.getText().isEmpty()){
            jLerrorNom.setText("El nombre no puede estar en blanco");
            jTFnom.requestFocus();//pone el cursor en l nombre
            correcto = false;
        }else{//si no está vacio 
            try{
                nomOk= MiLibreria.validaTexto(jTFnom.getText(),"nombre");
                if(nomOk){
                    jLerrorNom.setText("");//limpiamos el posible error
                }
            }
            catch(ExcepcionPropia e){
                jLerrorNom.setText(e.getMessage());
                correcto = false;
                jTFnom.requestFocus();
                jTFnom.setText("");
            }
            catch(Exception e){
                correcto = false;
                jLerrorNom.setText("Fallo al validar el nombre");
            }
        }
        //validar campo apellidos
        if(jTFape.getText().isEmpty()){
            jLerrorApe.setText("El apellido no puede estar en blanco");
            jTFape.requestFocus();//pone el cursor en l ape
            correcto = false;
        }else{//si no está vacio 
            try{
                apOk= MiLibreria.validaTexto(jTFape.getText(),"apellido");
                if(apOk){
                    jLerrorApe.setText("");//limpiamos el posible error
                }
            }
            catch(ExcepcionPropia e){
                jLerrorApe.setText(e.getMessage());
                jTFape.requestFocus();
                jTFape.setText("");
                correcto = false;
                
            }
            catch(Exception e){
                jLerrorApe.setText("Fallo al validar el apellido");
                correcto = false;
            }
        } 
        
        //validar edad
        if(jTFedad.getText().isEmpty()){
            jLerrorEdad.setText("Introduzca la edad");
            jTFedad.requestFocus();
            correcto = false;
                    
        }else{
            try{
            edad = Integer.parseInt(jTFedad.getText());
            MiLibreria.controlRangos(edad,18,100); 
            jLerrorEdad.setText("");
            }
             catch (NumberFormatException e) {
                jLerrorEdad.setText("Ha introducido caracteres no numéricos");
                correcto = false;
                jTFedad.requestFocus();
            } catch (ExcepcionPropia e) {
                jLerrorEdad.setText(e.getMessage());
                correcto = false;
                jTFedad .requestFocus();
            }
        }
        
        //validar años carnet
        if(jTFany.getText().isEmpty()){
            jLerrorAnyosCarne.setText("Introduzca los años de carné");
            jTFany.requestFocus();
            correcto = false;
                    
        }else{
            try{
            anyCarne = Integer.parseInt(jTFany.getText());
            MiLibreria.controlRangos(anyCarne,0,82); 
            
            jLerrorAnyosCarne.setText("");
            }
             catch (NumberFormatException e) {
                jLerrorAnyosCarne.setText("Ha introducido caracteres no numéricos");
                correcto = false;
                jTFany.requestFocus();
            } catch (ExcepcionPropia e) {
                jLerrorAnyosCarne.setText(e.getMessage());
                correcto = false;
                jTFany .requestFocus();
            }
            
        }
        
        
         if(correcto){
             //el carnet se saca a partir de los 18 años
             anyCarne = Integer.parseInt(jTFany.getText());
             edad = Integer.parseInt(jTFedad.getText());
             if(edad-anyCarne<18){
                jLerrorAnyosCarne.setText("Error años de carné");
             
             }else{
                 jBaddCond.setEnabled(true);
             }
            
        }
    //fin botón validar
    }//GEN-LAST:event_jBvalidaDatos_ActionPerformed

    private void jBaddCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddCondActionPerformed
        // añadir clientes a la base de datos
        //cogemos todos los datos e instanciamos 
        String dni,nom,ape;
        int edad,anyosC,resp = -1;
        boolean anyadido;
        Conductor cond;
        dni = jFTdni.getText().toUpperCase();
        nom = jTFnom.getText();
        ape = jTFape.getText();
        edad = Integer.parseInt(jTFedad.getText());
        anyosC = Integer.parseInt(jTFany.getText());
        cond = new Conductor(dni, nom, ape, edad, anyosC);
        
        //añadirmos el conductor a la BBDD
        try{
            con.conecta();
            con.crearSentencia();
            resp = con.grabaCliente(cond);
            con.cerrarConexion();
            if (resp != -1) {
                JOptionPane.showMessageDialog(null, "Datos del conductor\n ----------------------\n" + cond.infoCond(), "Conductor Añadido", JOptionPane.INFORMATION_MESSAGE);
                //pregunta si queremos añadir más
                int opc = JOptionPane.showConfirmDialog(this, "¿Desea añadir más conductores?", "Siguiente paso", JOptionPane.YES_NO_CANCEL_OPTION);
                if (opc == 0) {
                    //borraError();
                    JFcond_alta altaCond = new JFcond_alta();
                    altaCond.setVisible(true);
                    dispose();
                } else if (opc == 1) {
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "El conductor no se ha añadido", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error BBDD. Alta conductor", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error BBDD. Alta conductor", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBaddCondActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaddCond;
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBcheckDni;
    private javax.swing.JButton jBvalidaDatos_;
    private javax.swing.JFormattedTextField jFTdni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLerrorAnyosCarne;
    private javax.swing.JLabel jLerrorApe;
    private javax.swing.JLabel jLerrorDni;
    private javax.swing.JLabel jLerrorEdad;
    private javax.swing.JLabel jLerrorNom;
    private javax.swing.JLabel jLerrorpma;
    private javax.swing.JLabel jLtotalCond;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotonera;
    private javax.swing.JPanel jPdatosCond;
    private javax.swing.JPanel jPintroMat;
    private javax.swing.JTextField jTFany;
    private javax.swing.JTextField jTFape;
    private javax.swing.JTextField jTFedad;
    private javax.swing.JTextField jTFnom;
    // End of variables declaration//GEN-END:variables
}
