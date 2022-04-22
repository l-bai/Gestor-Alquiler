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
public class JFprecio_vehiculo extends javax.swing.JFrame {

    /**
     * Creates new form jFnewVeh
     */

    public JFprecio_vehiculo() {
        initComponents();
        setLocationRelativeTo(null);

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
        jLprecio = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLdisponibilidad = new javax.swing.JLabel();
        jPintroMat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jFTmat = new javax.swing.JFormattedTextField();
        jLerrorMatri = new javax.swing.JLabel();
        jBcheck = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPbotonera = new javax.swing.JPanel();
        jBverPrecios = new javax.swing.JButton();
        jBcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar precios");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 134, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 300));

        jPdatosAlq.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Precio de alquiler:");

        jTFdias.setBackground(new java.awt.Color(153, 204, 255));
        jTFdias.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFdias.setForeground(new java.awt.Color(0, 0, 153));

        jLerrorDias.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorDias.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorDias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Días:");

        jLprecio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLprecio.setForeground(new java.awt.Color(0, 0, 153));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)), "Estado del vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(0, 0, 153));

        jLdisponibilidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLdisponibilidad.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLdisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLdisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPdatosAlqLayout = new javax.swing.GroupLayout(jPdatosAlq);
        jPdatosAlq.setLayout(jPdatosAlqLayout);
        jPdatosAlqLayout.setHorizontalGroup(
            jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLerrorDias, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jTFdias, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPdatosAlqLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(604, Short.MAX_VALUE)))
        );
        jPdatosAlqLayout.setVerticalGroup(
            jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosAlqLayout.createSequentialGroup()
                .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jTFdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLerrorDias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPdatosAlqLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPdatosAlqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPdatosAlqLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
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

        jBcheck.setBackground(new java.awt.Color(164, 164, 140));
        jBcheck.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBcheck.setForeground(new java.awt.Color(51, 51, 0));
        jBcheck.setText("Comprobar ");
        jBcheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPintroMatLayout = new javax.swing.GroupLayout(jPintroMat);
        jPintroMat.setLayout(jPintroMatLayout);
        jPintroMatLayout.setHorizontalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPintroMatLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLerrorMatri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jBcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPintroMatLayout.setVerticalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPintroMatLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcheck, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerrorMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio de alquiler");

        jPbotonera.setBackground(new java.awt.Color(51, 134, 209));

        jBverPrecios.setBackground(new java.awt.Color(164, 164, 140));
        jBverPrecios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBverPrecios.setForeground(new java.awt.Color(51, 51, 0));
        jBverPrecios.setText("Ver precios");
        jBverPrecios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBverPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverPreciosActionPerformed(evt);
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
            .addGroup(jPbotoneraLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jBverPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPbotoneraLayout.setVerticalGroup(
            jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPbotoneraLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPbotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBverPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPbotonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPdatosAlq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPintroMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPintroMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPdatosAlq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPbotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBverPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverPreciosActionPerformed
        //Variables
        boolean correcto = true,alquilado=false;
        int dias;
        Vehiculo vehic;
        ConectaBBDD con = new ConectaBBDD();
        //validamos q el campo del nombre no está vacío

        //validar dias alquiler
        if (jTFdias.getText().isEmpty()) {
            jLerrorDias.setText("Introduzca los días de alquiler");
            jTFdias.requestFocus();
            correcto = false;

        } else {
            try {
                dias = Integer.parseInt(jTFdias.getText());
                //suponemos q cm máximo se puede alquilar 1 año, por ejemplo
                MiLibreria.controlRangos(dias, 1, 365);
                jLerrorDias.setText("");
            } catch (NumberFormatException e) {
                jLerrorDias.setText("Ha introducido caracteres no numéricos");
                correcto = false;
                jTFdias.requestFocus();
            } catch (ExcepcionPropia e) {
                jLerrorDias.setText(e.getMessage());
                correcto = false;
                jTFdias.requestFocus();
            }
        }

        if (correcto) {
            try {
                dias = Integer.parseInt(jTFdias.getText());
                con.conecta();
                con.crearSentencia();
                vehic = con.buscaVehiculo(jFTmat.getText().toUpperCase());
                con.cerrarConexion();
                jLprecio.setText(Float.toString(vehic.calculaPrecio(dias)) + " €");

                //ver disponibilidad
                //ver si está alquilado
                alquilado = LibreriaUsoBBDD.existeAlquiler(vehic.getMatrícula());
                if (alquilado) {
                    jLdisponibilidad.setText("NO DISPONIBLE");
                    jLdisponibilidad.setForeground(java.awt.Color.red);
                } else {
                    jLdisponibilidad.setText("DISPONIBLE");
                    jLdisponibilidad.setForeground(java.awt.Color.green);
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(this, "El vehículo No existe \nValide de nuevo la matrícula.","Vehículo no alquilado", JOptionPane.ERROR_MESSAGE);
                //desactivamos panel hasta volver a verificar
                jPdatosAlq.setVisible(false);
                jPbotonera.setVisible(false);
                jTFdias.setText("");
            } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error ver matricula!!", JOptionPane.ERROR_MESSAGE);
                   }

        }

    }//GEN-LAST:event_jBverPreciosActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelActionPerformed

    private void jBcheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckActionPerformed
        //para validar matrícula, dni
        boolean matOk = true,existe;
        String matricula = jFTmat.getText().toUpperCase();

        //comprobar q existe el vehículo y no está alquilado
        if (jFTmat.getValue() == null) {
            jLerrorMatri.setText("Introduzca la matrícula. Formato admitido: 4 números + 3 letras");
            jFTmat.setText("");
            jFTmat.requestFocus();
            matOk = false;
        } else {
            try {
                matOk = MiLibreria.controlMatricula(matricula);
                jLerrorMatri.setText("");
                if (matOk) {
                    //si pasa el control, vemos si ya existe
                    try {
                        
                       existe = LibreriaUsoBBDD.existeMatricula(matricula);
                       if (!existe) {
                           jLerrorMatri.setText("Este vehículo NO existe");
                           jFTmat.setText("");
                           jFTmat.requestFocus();
                           matOk = false;
                       }

                   } catch (SQLException ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error ver matricula!!", JOptionPane.ERROR_MESSAGE);
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error mat!!", JOptionPane.ERROR_MESSAGE);
                   }
                    
                    
                }
            } catch (ExcepcionPropia e) {
                jLerrorMatri.setText(e.getMessage());
                matOk = false;
                jFTmat.setText("");
                jFTmat.requestFocus();
            } catch (Exception e) {
                matOk = false;
                jLerrorMatri.setText("Fallo al validar la matrícula");
            }
            if (matOk) {
                jPdatosAlq.setVisible(true);
                jPbotonera.setVisible(true);
            }
        }
    }//GEN-LAST:event_jBcheckActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBcheck;
    private javax.swing.JButton jBverPrecios;
    private javax.swing.JFormattedTextField jFTmat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLdisponibilidad;
    private javax.swing.JLabel jLerrorDias;
    private javax.swing.JLabel jLerrorMatri;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPbotonera;
    private javax.swing.JPanel jPdatosAlq;
    private javax.swing.JPanel jPintroMat;
    private javax.swing.JTextField jTFdias;
    // End of variables declaration//GEN-END:variables
}