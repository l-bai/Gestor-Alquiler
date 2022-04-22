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
public class JFalq_nuevo extends javax.swing.JFrame {

    /**
     * Creates new form jFnewVeh
     */
    ConectaBBDD con = new ConectaBBDD();
    
    public JFalq_nuevo(){
        initComponents();
        setLocationRelativeTo(null);
        Date fechaHoy = new Date();
        //ponemos el número de alquileress totales
        int numAlq;
        
        //por defecto ponemos la fecha actual
        jDate_final.setDate(fechaHoy);
        jDate_inicial.setDate(fechaHoy);
        jDate_inicial.setMinSelectableDate(fechaHoy);
        
        /*que no se pueda poner una fecha anterior.
        Como no se especifica si se puede alquilar o no con fecha anterior a la actual, no lo usamos*/
//        Calendar limite = Calendar.getInstance();
//        limite.setTime(fechaHoy);
//        jDate_final.setMinDate(limite);

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
        
        jBaddAlq_.setEnabled(false);
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
        jLerrorDias = new javax.swing.JLabel();
        jLfecha = new javax.swing.JLabel();
        jLdias_alquiler = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLprecio_alq = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jDate_inicial = new com.toedter.calendar.JDateChooser();
        jDate_final = new com.toedter.calendar.JDateChooser();
        jPintroMat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFTdni = new javax.swing.JFormattedTextField();
        jLerrorDni = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFTmat = new javax.swing.JFormattedTextField();
        jLerrorMatri = new javax.swing.JLabel();
        jBcheckDniMat_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLtotalAlq = new javax.swing.JLabel();
        jPbotonera = new javax.swing.JPanel();
        jBvalidaAl = new javax.swing.JButton();
        jBaddAlq_ = new javax.swing.JButton();
        jBcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nuevo alquiler");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 134, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 300));

        jPdatosAlq.setBackground(new java.awt.Color(255, 255, 255));

        jLerrorDias.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLerrorDias.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorDias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLfecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLfecha.setForeground(new java.awt.Color(0, 0, 153));

        jLdias_alquiler.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLdias_alquiler.setForeground(new java.awt.Color(0, 0, 153));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Introduzca fecha de devolución:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Introduzca fecha de aquiler:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Total Días:");

        jLprecio_alq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLprecio_alq.setForeground(new java.awt.Color(0, 0, 153));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Precio:");

        jDate_inicial.setDateFormatString("dd-MM-yyyy");

        jDate_final.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout jPdatosAlqLayout = new javax.swing.GroupLayout(jPdatosAlq);
        jPdatosAlq.setLayout(jPdatosAlqLayout);
        jPdatosAlqLayout.setHorizontalGroup(
            jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDate_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(27, 27, 27)
                                .addComponent(jDate_final, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLprecio_alq, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPdatosAlqLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLdias_alquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLerrorDias, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPdatosAlqLayout.setVerticalGroup(
            jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLfecha)
                .addGap(13, 13, 13)
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDate_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLdias_alquiler, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLprecio_alq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addComponent(jLerrorDias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDate_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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

        jLerrorDni.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorDni.setForeground(new java.awt.Color(255, 0, 51));

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

        jBcheckDniMat_.setBackground(new java.awt.Color(164, 164, 140));
        jBcheckDniMat_.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBcheckDniMat_.setForeground(new java.awt.Color(51, 51, 0));
        jBcheckDniMat_.setText("Comprobar ");
        jBcheckDniMat_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheckDniMat_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckDniMat_ActionPerformed(evt);
            }
        });

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPintroMatLayout.createSequentialGroup()
                        .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPintroMatLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBcheckDniMat_, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPintroMatLayout.createSequentialGroup()
                                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLerrorMatri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPintroMatLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(57, 57, 57))))
        );
        jPintroMatLayout.setVerticalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPintroMatLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcheckDniMat_, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerrorMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo alquiler");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº alquileres:");

        jLtotalAlq.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLtotalAlq.setForeground(new java.awt.Color(255, 255, 255));
        jLtotalAlq.setText("-");

        jPbotonera.setBackground(new java.awt.Color(51, 134, 209));

        jBvalidaAl.setBackground(new java.awt.Color(164, 164, 140));
        jBvalidaAl.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBvalidaAl.setForeground(new java.awt.Color(51, 51, 0));
        jBvalidaAl.setText("Validar alquiler");
        jBvalidaAl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBvalidaAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvalidaAlActionPerformed(evt);
            }
        });

        jBaddAlq_.setBackground(new java.awt.Color(164, 164, 140));
        jBaddAlq_.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBaddAlq_.setForeground(new java.awt.Color(51, 51, 0));
        jBaddAlq_.setText("Añadir alquiler");
        jBaddAlq_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBaddAlq_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaddAlq_ActionPerformed(evt);
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
                .addComponent(jBaddAlq_, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
            .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPbotoneraLayout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jBvalidaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
                    .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(46, 46, 46)))
        );
        jPbotoneraLayout.setVerticalGroup(
            jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotoneraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jBaddAlq_, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPbotoneraLayout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBvalidaAl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(16, 16, 16)
                .addComponent(jPdatosAlq, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPbotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBvalidaAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidaAlActionPerformed
        //Variables
        boolean correcto=true;
        int diasAlq=1;
        Date fecha;
        Date fechaFinal;
        Vehiculo vehic;
        //formatos fechas
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        
        //Validar fechas
        try{
            fecha =jDate_inicial.getDate();
            //fecha = jDate_inicial1.getCurrent().getTime();
            fechaFinal = jDate_final.getDate();
            //fechaFinal = jDate_final11.getCurrent().getTime();

            diasAlq = (int) ((fechaFinal.getTime()-fecha.getTime())/86400000);
            jLerrorDias.setText("");
            if(diasAlq<=0){
                jLerrorDias.setText("La fecha de devolución debe ser posterior a la de alquiler");
                correcto = false;
            }
        
        }
        catch (NullPointerException e){
            jLerrorDias.setText("Elija fecha de alquiler y de devolución");
            correcto = false;
            //los campos no pueden estar vacios
        }
        
         if(correcto){
            jLdias_alquiler.setText(Integer.toString(diasAlq));
            //mostrar precio
            try{
                con.conecta();
                con.crearSentencia();
                vehic = con.buscaVehiculo(jFTmat.getText().toUpperCase());
                con.cerrarConexion();
                jLprecio_alq.setText(Integer.toString((int) vehic.calculaPrecio(diasAlq)) + " €");
                jBaddAlq_.setEnabled(true);
            }catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error BBDD. Al consultar precio!!", JOptionPane.ERROR_MESSAGE);
                    }
            //vehic = listaVeh.buscaVehiculo(jFTmat.getText());
            
        }
         
       
         
    //fin botón validar
    }//GEN-LAST:event_jBvalidaAlActionPerformed

    private void jBaddAlq_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaddAlq_ActionPerformed
        // añadir vehículos a la lista
        String dni,mat;
        int dias,graba=-1;
        Conductor cond;
        Vehiculo vehic;
        Alquiler alq=null;
        Date fechaAlquiler;
        //Calendar time;
        
        dni = jFTdni.getText().toUpperCase();
        mat = jFTmat.getText().toUpperCase();
        dias = Integer.parseInt(jLdias_alquiler.getText());
        fechaAlquiler = jDate_inicial.getDate();
//        time = jDate_inicial.getCalendar();
//        fechaAlquiler = time.getTime();//se transforma en date
//        
        //CONECTAMOS para buscar conductor y vehículo
        try {
            con.conecta();
            con.crearSentencia();
            cond = con.buscaConductor(dni);
            vehic = con.buscaVehiculo(mat);
            alq = new Alquiler(cond, vehic, dias, fechaAlquiler);
            //añadir a la tabla alquiler de  la BBDD
            graba = con.grabaAlq(alq);
            con.cerrarConexion();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error BBDD. Al buscar DNI y vehículo!!", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
       
      
        if(graba==1){
            JOptionPane.showMessageDialog(null, "" +alq.verInfo(),"Alquiler Añadido",JOptionPane.INFORMATION_MESSAGE );
            
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "El alquiler no se ha realizado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBaddAlq_ActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelActionPerformed

    private void jBcheckDniMat_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckDniMat_ActionPerformed
        //para validar matrícula, dni
        boolean matOk=true,alquilado=false,dniOk=true,existeDni,existeMat;
        String matricula = jFTmat.getText().toUpperCase();
        String dni = jFTdni.getText().toUpperCase();
        
        //comprobar DNI
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
                   try {
                        existeDni = LibreriaUsoBBDD.existeDni(dni);
                        if (!existeDni) {
                            jLerrorDni.setText("Este conductor NO está registrado");
                            dniOk = false;
                        }
                   }
                    catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error BBDD. Al buscar DNI!!", JOptionPane.ERROR_MESSAGE);
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
       }
        
        
        //comprobar q existe el vehículo y no está alquilado
        if(jFTmat.getValue()==null){
            jLerrorMatri.setText("Introduzca la matrícula. Formato admitido: 4 números + 3 letras");
            jFTmat.setText("");
            jFTmat.requestFocus();
            matOk = false;
        }else{
            try{
                matOk = MiLibreria.controlMatricula(matricula);
                jLerrorMatri.setText("");
                if(matOk){
                    //si pasa el control, vemos si ya existe
                    try {
                        existeMat = LibreriaUsoBBDD.existeMatricula(matricula);
                        if (!existeMat) {
                            jLerrorMatri.setText("Este vehículo NO existe");
                            jFTmat.setText("");
                            jFTmat.requestFocus();
                            matOk = false;
                            /*COmprobar si está alquilado*/
                        } else if (LibreriaUsoBBDD.existeAlquiler(matricula)) {
                            //no se puede borrar
                            JOptionPane.showMessageDialog(this, "El vehículo está alquilado.\n No se puede alquilar", "Vehículo Alquilado", JOptionPane.ERROR_MESSAGE);
                            alquilado = true;
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
        
        if(matOk && !alquilado && dniOk){
                jPdatosAlq.setVisible(true);
                jPbotonera.setVisible(true);
            }
    }//GEN-LAST:event_jBcheckDniMat_ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBaddAlq_;
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBcheckDniMat_;
    private javax.swing.JButton jBvalidaAl;
    private com.toedter.calendar.JDateChooser jDate_final;
    private com.toedter.calendar.JDateChooser jDate_inicial;
    private javax.swing.JFormattedTextField jFTdni;
    private javax.swing.JFormattedTextField jFTmat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLdias_alquiler;
    private javax.swing.JLabel jLerrorDias;
    private javax.swing.JLabel jLerrorDni;
    private javax.swing.JLabel jLerrorMatri;
    private javax.swing.JLabel jLfecha;
    private javax.swing.JLabel jLprecio_alq;
    private javax.swing.JLabel jLtotalAlq;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotonera;
    private javax.swing.JPanel jPdatosAlq;
    private javax.swing.JPanel jPintroMat;
    // End of variables declaration//GEN-END:variables
}
