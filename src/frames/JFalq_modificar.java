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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Lidia Baixauli de la Villa
 */
public class JFalq_modificar extends javax.swing.JFrame {

   
    private ConectaBBDD con = new ConectaBBDD();

    public JFalq_modificar() {
        initComponents();
        setLocationRelativeTo(null);

        //ponemos el número de alquileress totales
        int numAlq;
        try{
            con.conecta();
            con.crearSentencia();
            con.cargaTabla("Alquiler");
            numAlq = con.tamanyo();
            con.cerrarConexion();
            jLtotalAlq.setText(Integer.toString(numAlq));
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error Conexión!!", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error!!", JOptionPane.ERROR_MESSAGE);
        }
        
        jBmodif_alq.setEnabled(false);
        //se bloquean los botones hasta validar la matrícula
        jPdatosAlq.setVisible(false);
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
        jPdatosAlq = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTFdias = new javax.swing.JTextField();
        jLerrorDias = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLdiasActuales = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_infoAlq = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLfechaDev = new javax.swing.JLabel();
        jPintroMat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFTmat = new javax.swing.JFormattedTextField();
        jLerrorMatri = new javax.swing.JLabel();
        jBcheck_mat_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLtotalAlq = new javax.swing.JLabel();
        jPbotonera = new javax.swing.JPanel();
        jBvalidaAl_ = new javax.swing.JButton();
        jBmodif_alq = new javax.swing.JButton();
        jBcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar alquiler");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 134, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 300));

        jPdatosAlq.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Días actuales de alquiler:");

        jTFdias.setBackground(new java.awt.Color(153, 204, 255));
        jTFdias.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFdias.setForeground(new java.awt.Color(0, 0, 153));

        jLerrorDias.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorDias.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorDias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Introduzca días:");

        jLdiasActuales.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLdiasActuales.setForeground(new java.awt.Color(0, 0, 153));

        jTextArea_infoAlq.setEditable(false);
        jTextArea_infoAlq.setBackground(new java.awt.Color(153, 204, 255));
        jTextArea_infoAlq.setColumns(20);
        jTextArea_infoAlq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea_infoAlq.setForeground(new java.awt.Color(0, 0, 153));
        jTextArea_infoAlq.setRows(5);
        jTextArea_infoAlq.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Información", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jScrollPane1.setViewportView(jTextArea_infoAlq);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Nuevo precio :");

        jLprecio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLprecio.setForeground(new java.awt.Color(0, 0, 153));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Nueva fecha de devolución", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLfechaDev.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLfechaDev.setForeground(new java.awt.Color(0, 0, 153));
        jLfechaDev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLfechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLfechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPdatosAlqLayout = new javax.swing.GroupLayout(jPdatosAlq);
        jPdatosAlq.setLayout(jPdatosAlqLayout);
        jPdatosAlqLayout.setHorizontalGroup(
            jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFdias, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLdiasActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPdatosAlqLayout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLerrorDias, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPdatosAlqLayout.setVerticalGroup(
            jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLdiasActuales, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jLerrorDias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPintroMat.setBackground(new java.awt.Color(153, 204, 255));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Introduzca la matrícula:");

        jFTmat.setBackground(new java.awt.Color(255, 255, 255));
        jFTmat.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 0));
        jFTmat.setForeground(new java.awt.Color(0, 0, 153));
        try {
            jFTmat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####???")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTmat.setText("");
        jFTmat.setAlignmentX(10.0F);
        jFTmat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFTmat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jFTmat.setMargin(new java.awt.Insets(0, 10, 0, 0));
        jFTmat.setPreferredSize(new java.awt.Dimension(38, 22));

        jLerrorMatri.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorMatri.setForeground(new java.awt.Color(255, 0, 51));

        jBcheck_mat_.setBackground(new java.awt.Color(164, 164, 140));
        jBcheck_mat_.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBcheck_mat_.setForeground(new java.awt.Color(51, 51, 0));
        jBcheck_mat_.setText("Comprobar ");
        jBcheck_mat_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheck_mat_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheck_mat_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPintroMatLayout = new javax.swing.GroupLayout(jPintroMat);
        jPintroMat.setLayout(jPintroMatLayout);
        jPintroMatLayout.setHorizontalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPintroMatLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jBcheck_mat_, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLerrorMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(57, 57, 57))
        );
        jPintroMatLayout.setVerticalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPintroMatLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcheck_mat_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerrorMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar alquiler");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº alquileres:");

        jLtotalAlq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLtotalAlq.setForeground(new java.awt.Color(255, 255, 255));
        jLtotalAlq.setText("-");

        jPbotonera.setBackground(new java.awt.Color(51, 134, 209));

        jBvalidaAl_.setBackground(new java.awt.Color(164, 164, 140));
        jBvalidaAl_.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBvalidaAl_.setForeground(new java.awt.Color(51, 51, 0));
        jBvalidaAl_.setText("Validar días");
        jBvalidaAl_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvalidaAl_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvalidaAl_ActionPerformed(evt);
            }
        });

        jBmodif_alq.setBackground(new java.awt.Color(164, 164, 140));
        jBmodif_alq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBmodif_alq.setForeground(new java.awt.Color(51, 51, 0));
        jBmodif_alq.setText("Modificar alquiler");
        jBmodif_alq.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBmodif_alq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodif_alqActionPerformed(evt);
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
                .addComponent(jBmodif_alq, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPbotoneraLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jBvalidaAl_, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                    .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );
        jPbotoneraLayout.setVerticalGroup(
            jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotoneraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jBmodif_alq, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPbotoneraLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBvalidaAl_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLtotalAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPbotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPdatosAlq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
                            .addComponent(jLtotalAlq))))
                .addGap(18, 18, 18)
                .addComponent(jPintroMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPdatosAlq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPbotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBvalidaAl_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidaAl_ActionPerformed
        //valida los días d alquiler
        //Variables
        boolean correcto=true;
        int dias;
        String mat;
        Date fechaFinal = new Date();
        Date fechaInicial;
        long time;
        Alquiler alq=null;
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        
        //validar dias alquiler
        if(jTFdias.getText().isEmpty()){
            jLerrorDias.setText("Introduzca los días de alquiler");
            jTFdias.requestFocus();
            correcto = false;
                    
        }else{
            try{
            dias = Integer.parseInt(jTFdias.getText());
            //suponemos q cm máximo se puede alquilar 2 meses, por ejemplo
            MiLibreria.controlRangos(dias,1,60); 
            jLerrorDias.setText("");
            }
             catch (NumberFormatException e) {
                jLerrorDias.setText("Ha introducido caracteres no numéricos");
                correcto = false;
                jTFdias.requestFocus();
            } catch (ExcepcionPropia e) {
                jLerrorDias.setText(e.getMessage());
                correcto = false;
                jTFdias .requestFocus();
            }
        }
    
        if (correcto) {
            mat = jFTmat.getText().toUpperCase();
            dias = Integer.parseInt(jTFdias.getText());
            //marca el nuevo precio
            try {
                con.conecta();
                con.crearSentencia();
                jLprecio.setText(Float.toString(con.buscaVehiculo(mat).calculaPrecio(dias)) + " €");
                alq = con.buscaAlq(mat);
                con.cerrarConexion();
                //ponemos la nueva fecha de devolución
                fechaInicial = alq.getFechaAlq();
                time = fechaInicial.getTime() + (dias * 86400000);
                fechaFinal.setTime(time);
                jLfechaDev.setText(formato.format(fechaFinal));

                //habilita botón de modificar
                jBmodif_alq.setEnabled(true);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error Conexión. \nCálculo nuevo precio de alquiler!!", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El alquiler no se ha modificado", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    //fin botón validar
    }//GEN-LAST:event_jBvalidaAl_ActionPerformed

    private void jBmodif_alqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodif_alqActionPerformed
        int dias;
        int modif = -1;
        Alquiler alq=null;
        dias= Integer.parseInt(jTFdias.getText());
        
        try{
            con.conecta();
            con.crearSentencia();
            con.cargaTabla("Alquiler");
            alq = con.buscaAlq(jFTmat.getText().toUpperCase());
            modif = con.modifAlquiler(dias, alq);
            //lo volvemos a buscar para recargar la informacion
            alq = con.buscaAlq(jFTmat.getText().toUpperCase());
            con.cerrarConexion();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error Conexión al modificar alquiler!!", JOptionPane.ERROR_MESSAGE);
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "El alquiler no se ha modificado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        if(modif==1){
            JOptionPane.showMessageDialog(null, "" +alq.verInfo(),"Alquiler modificado",JOptionPane.INFORMATION_MESSAGE );
            jTextArea_infoAlq.setText(alq.verInfo());
            
        }else{
            JOptionPane.showMessageDialog(null, "El alquiler no se ha modificado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBmodif_alqActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelActionPerformed

    private void jBcheck_mat_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheck_mat_ActionPerformed
        //para validar matrícula
        boolean matOk=true,alquilado=true,existeMat;
        Alquiler alq;
        String matricula = jFTmat.getText().toUpperCase();
        //El recuadro para introducir datos solo deja el patron de 4num + 3 letras
        
        
        //comprobar q existe el vehículo y está alquilado
        if(jFTmat.getValue()==null){
            jLerrorMatri.setText("Introduzca la matrícula. Formato admitido: 4 números + 3 letras");
            jFTmat.setText("");
            jFTmat.requestFocus();
            matOk = false;
        }else{
            try{
                matOk = MiLibreria.controlMatricula(matricula);
                jLerrorMatri.setText("");
                if (matOk) {
                    //si pasa el control, vemos si ya existe
                    try {
                        existeMat = LibreriaUsoBBDD.existeMatricula(matricula);
                        if (!existeMat) {
                            jLerrorMatri.setText("Este vehículo NO existe");
                            jFTmat.setText("");
                            jFTmat.requestFocus();
                            matOk = false;
                            /*COmprobar si está alquilado*/
                        } else if (!LibreriaUsoBBDD.existeAlquiler(matricula)) {
                            //no se puede borrar
                            JOptionPane.showMessageDialog(this, "El vehículo NO está alquilado.\n", "Vehículo NO Alquilado", JOptionPane.ERROR_MESSAGE);
                            alquilado = false;
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error ver matricula!!", JOptionPane.ERROR_MESSAGE);
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error mat!!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            catch(ExcepcionPropia e){
                jLerrorMatri.setText(e.getMessage());
                matOk = false;
                jFTmat.setText("");
                jFTmat.requestFocus();
            }
            catch(Exception e){
                matOk = false;
                jLerrorMatri.setText("Fallo al validar la matrícula");
            }

        }//fin valida mat

        if (matOk && alquilado) {
            try {
                con.conecta();
                con.crearSentencia();
                alq = con.buscaAlq(matricula);
                con.cerrarConexion();
                jPdatosAlq.setVisible(true);
                jPbotonera.setVisible(true);
                jLdiasActuales.setText(Integer.toString(alq.getDias()));
                //mostrar info actual
                jTextArea_infoAlq.setText(alq.verInfo());

                //se bloquea la matrícula para evitar modificaciones sin validación
                jFTmat.setEnabled(false);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error ver matricula!!", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error mat!!", JOptionPane.ERROR_MESSAGE);
            }

        }

    }//GEN-LAST:event_jBcheck_mat_ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBcheck_mat_;
    private javax.swing.JButton jBmodif_alq;
    private javax.swing.JButton jBvalidaAl_;
    private javax.swing.JFormattedTextField jFTmat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLdiasActuales;
    private javax.swing.JLabel jLerrorDias;
    private javax.swing.JLabel jLerrorMatri;
    private javax.swing.JLabel jLfechaDev;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JLabel jLtotalAlq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPbotonera;
    private javax.swing.JPanel jPdatosAlq;
    private javax.swing.JPanel jPintroMat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFdias;
    private javax.swing.JTextArea jTextArea_infoAlq;
    // End of variables declaration//GEN-END:variables
}