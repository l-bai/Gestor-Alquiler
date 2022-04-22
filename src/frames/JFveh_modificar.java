package frames;

import DAO.*;
import gestionBBDD.ConectaBBDD;
import gestionBBDD.LibreriaUsoBBDD;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;


/**
 *
 * @author Lidia Baixauli de la Villa
 */
public class JFveh_modificar extends javax.swing.JFrame {

    
    ConectaBBDD con = new ConectaBBDD();
    Vehiculo veh=null;
    /**
     * Creates new form jFnewVeh
     */
    public JFveh_modificar() {
        int numVeh;
        initComponents();
        setLocationRelativeTo(null);
        
        try{
            con.conecta();
            con.crearSentencia();
            con.ejecutaSQL("SELECT * FROM Vehiculos");
            
            //num vehic totales
            numVeh = con.tamanyo();
            jLtotalVeh.setText(Integer.toString(numVeh));
            
           //cargar combo color
            String[] misColor = con.arrayColores();
            for (int i = 0; i < misColor.length; i++) {
                jCcolor.addItem(misColor[i]);
            }
            
            //carga motor
            String[] miMotor = con.arrayMotores();
            for (int i = 0; i < miMotor.length; i++) {
                jCmotor.addItem(miMotor[i]);
            }
            
            con.cerrarConexion();
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error!!", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage(),"Error!!", JOptionPane.ERROR_MESSAGE);
        }
        
     
        jBmodifica_Veh.setEnabled(false);
     
        //tipo vehi. Bloqueamos para q no se pueda modificar
        Enumeration botonTipo = bGtipoVeh.getElements();
        while (botonTipo.hasMoreElements()) {
            AbstractButton but = (AbstractButton) botonTipo.nextElement();
            but.setEnabled(false);
        }

        //se bloquean los botones hasta validar la matrícula
        jPdatosVeh.setVisible(false);
        jPbotonera.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGtipoVeh = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPdatosVeh = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRcoche = new javax.swing.JRadioButton();
        jRmicro = new javax.swing.JRadioButton();
        jRcam = new javax.swing.JRadioButton();
        jRfurgo = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSanVeh = new javax.swing.JSlider();
        jLabel8 = new javax.swing.JLabel();
        jCcolor = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCmotor = new javax.swing.JComboBox<>();
        jTFmarca = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFcilin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFplazas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFpma = new javax.swing.JTextField();
        jLerrorMarca = new javax.swing.JLabel();
        jLerrorCol = new javax.swing.JLabel();
        jLerrorMot = new javax.swing.JLabel();
        jLerrorPlaza = new javax.swing.JLabel();
        jLerrorpma = new javax.swing.JLabel();
        jLerrorCili1 = new javax.swing.JLabel();
        jLmetros = new javax.swing.JLabel();
        jTFmetros = new javax.swing.JTextField();
        jTFruedas = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLerrorRuedas = new javax.swing.JLabel();
        jLerrorMetros = new javax.swing.JLabel();
        jPintroMat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jFTmat = new javax.swing.JFormattedTextField();
        jBcheckMat = new javax.swing.JButton();
        jLerrorMatri = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLtotalVeh = new javax.swing.JLabel();
        jPbotonera = new javax.swing.JPanel();
        jBmodifica_Veh = new javax.swing.JButton();
        jBvalidaDatos_ = new javax.swing.JButton();
        jBcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar vehículo");
        setBackground(new java.awt.Color(255, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 134, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 300));

        jPdatosVeh.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Tipo de vehículo:");

        jRcoche.setBackground(new java.awt.Color(255, 255, 255));
        bGtipoVeh.add(jRcoche);
        jRcoche.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRcoche.setForeground(new java.awt.Color(0, 0, 153));
        jRcoche.setText("Coche");
        jRcoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcocheActionPerformed(evt);
            }
        });

        jRmicro.setBackground(new java.awt.Color(255, 255, 255));
        bGtipoVeh.add(jRmicro);
        jRmicro.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRmicro.setForeground(new java.awt.Color(0, 0, 153));
        jRmicro.setText("Microbus");
        jRmicro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRmicroActionPerformed(evt);
            }
        });

        jRcam.setBackground(new java.awt.Color(255, 255, 255));
        bGtipoVeh.add(jRcam);
        jRcam.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRcam.setForeground(new java.awt.Color(0, 0, 153));
        jRcam.setText("Camión");
        jRcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRcamActionPerformed(evt);
            }
        });

        jRfurgo.setBackground(new java.awt.Color(255, 255, 255));
        bGtipoVeh.add(jRfurgo);
        jRfurgo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRfurgo.setForeground(new java.awt.Color(0, 0, 153));
        jRfurgo.setText("Furgoneta");
        jRfurgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRfurgoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Años:");

        jSanVeh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jSanVeh.setForeground(new java.awt.Color(0, 0, 153));
        jSanVeh.setMajorTickSpacing(1);
        jSanVeh.setMaximum(15);
        jSanVeh.setPaintLabels(true);
        jSanVeh.setValue(0);
        jSanVeh.setCursor(new java.awt.Cursor(java.awt.Cursor.W_RESIZE_CURSOR));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Color:");

        jCcolor.setBackground(new java.awt.Color(51, 134, 209));
        jCcolor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCcolor.setForeground(new java.awt.Color(0, 0, 153));
        jCcolor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Motor:");

        jCmotor.setBackground(new java.awt.Color(51, 134, 209));
        jCmotor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jCmotor.setForeground(new java.awt.Color(0, 0, 153));
        jCmotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        jTFmarca.setBackground(new java.awt.Color(153, 204, 255));
        jTFmarca.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFmarca.setForeground(new java.awt.Color(0, 0, 153));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Cilindrada:");

        jTFcilin.setBackground(new java.awt.Color(153, 204, 255));
        jTFcilin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFcilin.setForeground(new java.awt.Color(0, 0, 153));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Nº plazas:");

        jTFplazas.setBackground(new java.awt.Color(153, 204, 255));
        jTFplazas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFplazas.setForeground(new java.awt.Color(0, 0, 153));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("P.M.A.:");

        jTFpma.setBackground(new java.awt.Color(153, 204, 255));
        jTFpma.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFpma.setForeground(new java.awt.Color(0, 0, 153));

        jLerrorMarca.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorMarca.setForeground(new java.awt.Color(255, 0, 51));

        jLerrorCol.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorCol.setForeground(new java.awt.Color(255, 0, 51));

        jLerrorMot.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorMot.setForeground(new java.awt.Color(255, 0, 51));

        jLerrorPlaza.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorPlaza.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorPlaza.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLerrorpma.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorpma.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorpma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLerrorCili1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorCili1.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorCili1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLmetros.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLmetros.setForeground(new java.awt.Color(0, 0, 153));
        jLmetros.setText("Metros:");

        jTFmetros.setBackground(new java.awt.Color(153, 204, 255));
        jTFmetros.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFmetros.setForeground(new java.awt.Color(0, 0, 153));

        jTFruedas.setBackground(new java.awt.Color(153, 204, 255));
        jTFruedas.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jTFruedas.setForeground(new java.awt.Color(0, 0, 153));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Nº ruedas:");

        jLerrorRuedas.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorRuedas.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorRuedas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLerrorMetros.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorMetros.setForeground(new java.awt.Color(255, 0, 51));
        jLerrorMetros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPdatosVehLayout = new javax.swing.GroupLayout(jPdatosVeh);
        jPdatosVeh.setLayout(jPdatosVehLayout);
        jPdatosVehLayout.setHorizontalGroup(
            jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosVehLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosVehLayout.createSequentialGroup()
                        .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdatosVehLayout.createSequentialGroup()
                                .addComponent(jLmetros, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFmetros, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLerrorMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdatosVehLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLerrorRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPdatosVehLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLerrorpma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPdatosVehLayout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(jTFpma, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPdatosVehLayout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTFruedas, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPdatosVehLayout.createSequentialGroup()
                            .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPdatosVehLayout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSanVeh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPdatosVehLayout.createSequentialGroup()
                                            .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLerrorMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPdatosVehLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jCcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPdatosVehLayout.createSequentialGroup()
                                            .addComponent(jLerrorMot, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPdatosVehLayout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jCmotor, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTFcilin))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPdatosVehLayout.createSequentialGroup()
                            .addComponent(jLerrorCol, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(168, 168, 168)
                            .addComponent(jLerrorCili1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPdatosVehLayout.createSequentialGroup()
                            .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPdatosVehLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFplazas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLerrorPlaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPdatosVehLayout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(jRcoche)
                            .addGap(29, 29, 29)
                            .addComponent(jRmicro)
                            .addGap(28, 28, 28)
                            .addComponent(jRcam)
                            .addGap(28, 28, 28)
                            .addComponent(jRfurgo))))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        jPdatosVehLayout.setVerticalGroup(
            jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPdatosVehLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRcoche)
                    .addComponent(jRmicro)
                    .addComponent(jRcam)
                    .addComponent(jRfurgo))
                .addGap(35, 35, 35)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLerrorMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSanVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCmotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFcilin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLerrorMot, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLerrorCol, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLerrorCili1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosVehLayout.createSequentialGroup()
                        .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFplazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLerrorPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdatosVehLayout.createSequentialGroup()
                        .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFpma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLerrorpma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPdatosVehLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLerrorRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPdatosVehLayout.createSequentialGroup()
                        .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFruedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPdatosVehLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLmetros, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTFmetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLerrorMetros, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPintroMat.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Introduzca la matrícula:");

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

        jBcheckMat.setBackground(new java.awt.Color(164, 164, 140));
        jBcheckMat.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBcheckMat.setForeground(new java.awt.Color(51, 51, 0));
        jBcheckMat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcheckMat.setLabel("Comprobar matrícula");
        jBcheckMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckMatActionPerformed(evt);
            }
        });

        jLerrorMatri.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLerrorMatri.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPintroMatLayout = new javax.swing.GroupLayout(jPintroMat);
        jPintroMat.setLayout(jPintroMatLayout);
        jPintroMatLayout.setHorizontalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPintroMatLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLerrorMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPintroMatLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBcheckMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(57, 57, 57))))
        );
        jPintroMatLayout.setVerticalGroup(
            jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPintroMatLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPintroMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTmat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcheckMat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLerrorMatri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modificar vehículo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nº vehículos actuales:");

        jLtotalVeh.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLtotalVeh.setForeground(new java.awt.Color(255, 255, 255));
        jLtotalVeh.setText("-");

        jPbotonera.setBackground(new java.awt.Color(51, 134, 209));

        jBmodifica_Veh.setBackground(new java.awt.Color(164, 164, 140));
        jBmodifica_Veh.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBmodifica_Veh.setForeground(new java.awt.Color(51, 51, 0));
        jBmodifica_Veh.setText("Modificar vehículo");
        jBmodifica_Veh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBmodifica_Veh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodifica_VehActionPerformed(evt);
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
                .addComponent(jBmodifica_Veh, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jBmodifica_Veh, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jLtotalVeh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPdatosVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jLtotalVeh))))
                .addGap(18, 18, 18)
                .addComponent(jPintroMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPdatosVeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPbotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBcheckMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckMatActionPerformed
        //si la matrícula no existe y es válida deja seguir el proceso
       boolean matOk=true,existe;
       String matricula = jFTmat.getText().toUpperCase();
       //El recuadro para introducir datos solo deja el patron de 4num + 3 letras
       //Si el campo no está vacío
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
                       existe = LibreriaUsoBBDD.existeMatricula(matricula);
                       if (!existe) {
                           jLerrorMatri.setText("Este vehículo NO existe");
                           jFTmat.setText("");
                           jFTmat.requestFocus();
                           matOk = false;
                       }
                   }//try
                   catch (SQLException ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error ver matricula!!", JOptionPane.ERROR_MESSAGE);
                   } catch (Exception ex) {
                       JOptionPane.showMessageDialog(this, ex.getMessage(), "Error matrícula!!", JOptionPane.ERROR_MESSAGE);
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
           if(matOk){//mostramos los datos
              //obtenemos el vehículo por matrícula
               try {
                   con.conecta();
                   con.crearSentencia();
                   veh = con.buscaVehiculo(matricula);
                   con.cerrarConexion();

               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
               } catch (Exception ex) {
                   JOptionPane.showMessageDialog(this, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
               }
               //activamos botones
               jPdatosVeh.setVisible(true);
                jPbotonera.setVisible(true);
               jTFmarca.setText(veh.getMarca());
               jTFcilin.setText(Integer.toString(veh.getCilindrada()));
               jSanVeh.setValue(veh.getAnyos());
               jCcolor.setSelectedItem(veh.getColor().name());
               jCmotor.setSelectedItem(veh.getMotor().name());
               //atributos no comunes
               //limpiamos campos no comunes
               jTFruedas.setText("");
               jTFplazas.setText("");
               jTFpma.setText("");
               jTFmetros.setText("");
               //atributos no comunes
               if (veh instanceof Camion){//vemos ejes
                   jRcam.setSelected(true);
                   jTFruedas.setText(Integer.toString(((Camion) veh).getRuedas()));
                   jTFpma.setText(Integer.toString(((Camion) veh).getPma()));
                   //activar/des campos
                    jTFplazas.setEnabled(false);
                    jTFmetros.setEnabled(false);
                    jTFpma.setEnabled(true);
                    jTFruedas.setEnabled(true);
               } else if (veh instanceof Coche) {
                   jRcoche.setSelected(true);
                   jTFplazas.setText(Integer.toString(((Coche) veh).getPlazas()));
                   jTFplazas.setEnabled(true);
                   jTFpma.setEnabled(false);
                   jTFruedas.setEnabled(false);
                   jTFmetros.setEnabled(false);
               } else if (veh instanceof Furgo) {
                   jRfurgo.setSelected(true);
                   jTFplazas.setText(Integer.toString(((Furgo) veh).getPlazas()));
                   jTFpma.setText(Integer.toString(((Furgo) veh).getPma()));
                   jTFplazas.setEnabled(true);
                   jTFpma.setEnabled(true);
                   jTFruedas.setEnabled(false);
                   jTFmetros.setEnabled(false);
               } else {
                   jRmicro.setSelected(true);
                   jTFplazas.setText(Integer.toString(((MicroBus) veh).getPlazas()));
                   jTFmetros.setText(Integer.toString(((MicroBus) veh).getMetros()));
                   //act/DEs campos
                   jTFplazas.setEnabled(true);
                   jTFmetros.setEnabled(true);
                   jTFpma.setEnabled(false);
                   jTFruedas.setEnabled(false);
                }
               
                JOptionPane.showMessageDialog(this, "Introduzca los cambios.\n Valide primero para aceptar los cambios");
                
           }//fin matOk
       }
               
    }//GEN-LAST:event_jBcheckMatActionPerformed

    private void jRcocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcocheActionPerformed
        jTFplazas.setEnabled(true);
        jTFruedas.setEnabled(false);
        jTFpma.setEnabled(false);
        borraError();
    }//GEN-LAST:event_jRcocheActionPerformed

    private void jRmicroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmicroActionPerformed
       jTFplazas.setEnabled(true);
       jTFruedas.setEnabled(false);
       jTFpma.setEnabled(false);
       borraError();
    }//GEN-LAST:event_jRmicroActionPerformed

    private void jRcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRcamActionPerformed
        jTFplazas.setEnabled(false);
        jTFruedas.setEnabled(true);
        jTFpma.setEnabled(true);
        borraError();
    }//GEN-LAST:event_jRcamActionPerformed

    private void jRfurgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRfurgoActionPerformed
        jTFplazas.setEnabled(true);
        jTFruedas.setEnabled(false);
        jTFpma.setEnabled(true);
        borraError();
    }//GEN-LAST:event_jRfurgoActionPerformed

    private void jBvalidaDatos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvalidaDatos_ActionPerformed
        
        //Variables
        boolean correcto=true;
        int numero,numPlazas;

        //Valida Marca
        if (jTFmarca.getText().isEmpty()) {
            jLerrorMarca.setText("Indique la marca del vehículo");
            correcto = false;
        } else {
            jLerrorMarca.setText("");//borramos error
        }
        
        //Validar motor
       if(jCmotor.getSelectedItem().toString()=="-----"){
           jLerrorMot.setText("Seleccione el motor");
           correcto=false;
       }else{
           jLerrorMot.setText("");
       }
       //valida color
       if(jCcolor.getSelectedItem().toString()=="-----"){
           jLerrorCol.setText("Seleccione el color");
           correcto=false;
       }else{
           jLerrorCol.setText("");
       }
       
       //validar cilindrada
       if(jTFcilin.getText().isEmpty()){
           jLerrorCili1.setText("Introduzca la cilindrada");
           correcto = false;
           jLerrorCili1.requestFocus();
       }else{
           try{
               numero = Integer.parseInt(jTFcilin.getText());
               MiLibreria.controlRangos(numero, 500, 15000);
               jLerrorCili1.setText("");
           }
           catch(NumberFormatException e){
               jLerrorCili1.setText("Ha introducido letras");
               correcto = false;
           }
           catch(ExcepcionPropia e){
               jLerrorCili1.setText(e.getMessage());
               correcto = false;
           }
       }
       
       //control plazas. Para todos menos camión
       
       if(jRcam.isSelected()==false){
           if(jTFplazas.getText().isEmpty()){
               jLerrorPlaza.setText("Introduzca nº plazas");
               correcto = false;
           }else{
               if(jRcoche.isSelected()){
                   try{
                       numPlazas= Integer.parseInt(jTFplazas.getText());
                       MiLibreria.validaPlaza(numPlazas,5);
                       jLerrorPlaza.setText("");
                       
                   }
                   catch(NumberFormatException e){
                       jLerrorPlaza.setText("Ha introducido letras");
                        correcto = false;
                   }
                   catch(ExcepcionPropia e){
                       jLerrorPlaza.setText(e.getMessage());
                       correcto = false;
                   }
               }else if(jRmicro.isSelected()){
                   try{
                       numPlazas= Integer.parseInt(jTFplazas.getText());
                       MiLibreria.validaPlaza(numPlazas,15);
                       jLerrorPlaza.setText("");
                   }
                   catch(NumberFormatException e){
                       jLerrorPlaza.setText("Ha introducido letras");
                        correcto = false;
                   }
                   catch(ExcepcionPropia e){
                       jLerrorPlaza.setText(e.getMessage());
                       correcto = false;
                   }
               }else{//para la furgo
                   try{
                       numPlazas= Integer.parseInt(jTFplazas.getText());
                       MiLibreria.validaPlaza(numPlazas,10);
                       jLerrorPlaza.setText("");
                   }
                   catch(NumberFormatException e){
                       jLerrorPlaza.setText("Ha introducido letras");
                        correcto = false;
                   }
                   catch(ExcepcionPropia e){
                       jLerrorPlaza.setText(e.getMessage());
                       correcto = false;
                   }
               }
               
           }
       }//fin if no camion. CONTROL PLAZAS
       
       //validar ruedas-serán 2-6.  solo camión
       if (jRcam.isSelected()) {
            if (jTFruedas.getText().isEmpty()) {
                jLerrorRuedas.setText("Introduzca el núm de ruedas");
                correcto = false;
                jLerrorRuedas.requestFocus();
            } else {
                try {
                    numero = Integer.parseInt(jTFruedas.getText());
                    MiLibreria.controlRangos(numero, 4, 24);
                    jLerrorRuedas.setText("");
                } catch (NumberFormatException e) {
                    jLerrorRuedas.setText("Ha introducido letras");
                    correcto = false;
                } catch (ExcepcionPropia e) {
                    jLerrorRuedas.setText(e.getMessage());
                    correcto = false;
                }
            }
        }
       
       //validar toneladar. Camión y furgo
       //para camión
        if (jRcam.isSelected() || jRfurgo.isSelected()) {
            if (jTFpma.getText().isEmpty()) {
                jLerrorpma.setText("Introduzca el P.M.A.");
                correcto = false;
                
            } else {
                try {
                    numero = Integer.parseInt(jTFpma.getText());
                    jLerrorpma.setText("");
                    if (jRcam.isSelected()) {
                        try {
                            MiLibreria.controlRangos(numero, 0, 44);
                            jLerrorpma.setText("");
                        } catch (ExcepcionPropia e) {
                            jLerrorpma.setText(e.getMessage());
                            correcto = false;
                            jTFpma.setText("");
                        }
                    } else {//pma furgoneta
                        try {
                            MiLibreria.controlRangos(numero, 0, 5);
                            jLerrorpma.setText("");
                        } catch (ExcepcionPropia e) {
                            jLerrorpma.setText(e.getMessage());
                            correcto = false;
                            jTFpma.setText("");
                        }
                    }
                } catch (NumberFormatException e) {
                    jLerrorpma.setText("Ha introducido letras");
                    correcto = false;
                    jTFpma.setText("");
                
                }
            }
        }
        
         //validar metros. solo microbus
       if (jRmicro.isSelected()) {
            if (jTFmetros.getText().isEmpty()) {
                jLerrorMetros.setText("Introduzca el núm de metros");
                correcto = false;
                jLerrorMetros.requestFocus();
            } else {
                try {
                    numero = Integer.parseInt(jTFmetros.getText());
                    MiLibreria.controlRangos(numero, 4, 6);
                    jLerrorMetros.setText("");
                } catch (NumberFormatException e) {
                    jLerrorMetros.setText("Ha introducido letras");
                    correcto = false;
                } catch (ExcepcionPropia e) {
                    jLerrorMetros.setText(e.getMessage());
                    correcto = false;
                }
            }
        }
       
        if(correcto){
            jBmodifica_Veh.setEnabled(true);
        }
        
    //fin botón validar
    }//GEN-LAST:event_jBvalidaDatos_ActionPerformed

    private void jBmodifica_VehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodifica_VehActionPerformed
        // modificar vehículos 
        String mat, marca, motor,color;
        int plazas=1,anyos, cilin=0,ruedas=0,pma=0,metros = 0,resp =-1;
        Motor mot;
        Color col;
        Vehiculo veh;
        //cogemos el vehiculo por matricula
        mat = jFTmat.getText().toUpperCase();
        
        //tomamos los valores
        marca = jTFmarca.getText();
        motor = jCmotor.getSelectedItem().toString();
        mot = Motor.asignarMotor(motor);
        color = jCcolor.getSelectedItem().toString();
        col = Color.asignarColor(color);
        anyos = jSanVeh.getValue();
        cilin = Integer.parseInt(jTFcilin.getText());
        if (jRcam.isSelected() == false) {
            plazas = Integer.parseInt(jTFplazas.getText());
        } else {
            ruedas = Integer.parseInt(jTFruedas.getText());
        }
        if (jRcam.isSelected() || jRfurgo.isSelected()) {
            pma = Integer.parseInt(jTFpma.getText());
        }
        if (jRmicro.isSelected()) {
            metros = Integer.parseInt(jTFmetros.getText());
        }
        
         //instanciamos vehículo
        if (jRcoche.isSelected()) {
            //car = new Coche(plazas, mat, col, marca, mot, cilin, anyos);
             veh = new Coche(plazas, mat, col, marca, mot, cilin, anyos);
        } else if (jRfurgo.isSelected()) {
            veh = new Furgo(plazas, pma, mat, col, marca, mot, cilin, anyos);
        } else if (jRmicro.isSelected()) {
           veh = new MicroBus(plazas, metros, mat, col, marca, mot, cilin, anyos);
        } else {
            veh = new Camion(ruedas, pma, mat, col, marca, mot, cilin, anyos);
            
        }

        //llama método modificar de la base de datos
        try {
            con.conecta();
            con.crearSentencia();
            resp = con.modificaVehiculo(veh);
            con.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error BBDD", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error BBDD", JOptionPane.ERROR_MESSAGE);
        }

        if (resp != -1) {
            JOptionPane.showMessageDialog(null, "Vehículo modificado", "Vehículo modificado", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "El vehículo no se ha modificado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        //pregunta si queremos añadir más
        int opc = JOptionPane.showConfirmDialog(this, "¿Desea modificar más vehículos?", "Siguiente paso", JOptionPane.YES_NO_CANCEL_OPTION);
        if (opc == 0) {
            //borraError();
            JFveh_modificar modVeh = new JFveh_modificar();
            modVeh.setVisible(true);
            dispose();
        } else if (opc == 1) {
            dispose();
        }

    }//GEN-LAST:event_jBmodifica_VehActionPerformed

    private void jBcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelActionPerformed
        dispose();
    }//GEN-LAST:event_jBcancelActionPerformed

    //borrar todos label error
    public  void borraError(){
      jLerrorCili1.setText("");  
      jLerrorCol.setText("");  
      jLerrorRuedas.setText("");  
      jLerrorMarca.setText("");  
      jLerrorMot.setText("");  
      jLerrorPlaza.setText("");  
      jLerrorpma.setText(""); 
      jLerrorMetros.setText(""); 
      
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGtipoVeh;
    private javax.swing.JButton jBcancel;
    private javax.swing.JButton jBcheckMat;
    private javax.swing.JButton jBmodifica_Veh;
    private javax.swing.JButton jBvalidaDatos_;
    private javax.swing.JComboBox<String> jCcolor;
    private javax.swing.JComboBox<String> jCmotor;
    private javax.swing.JFormattedTextField jFTmat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLerrorCili1;
    private javax.swing.JLabel jLerrorCol;
    private javax.swing.JLabel jLerrorMarca;
    private javax.swing.JLabel jLerrorMatri;
    private javax.swing.JLabel jLerrorMetros;
    private javax.swing.JLabel jLerrorMot;
    private javax.swing.JLabel jLerrorPlaza;
    private javax.swing.JLabel jLerrorRuedas;
    private javax.swing.JLabel jLerrorpma;
    private javax.swing.JLabel jLmetros;
    private javax.swing.JLabel jLtotalVeh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPbotonera;
    private javax.swing.JPanel jPdatosVeh;
    private javax.swing.JPanel jPintroMat;
    private javax.swing.JRadioButton jRcam;
    private javax.swing.JRadioButton jRcoche;
    private javax.swing.JRadioButton jRfurgo;
    private javax.swing.JRadioButton jRmicro;
    private javax.swing.JSlider jSanVeh;
    private javax.swing.JTextField jTFcilin;
    private javax.swing.JTextField jTFmarca;
    private javax.swing.JTextField jTFmetros;
    private javax.swing.JTextField jTFplazas;
    private javax.swing.JTextField jTFpma;
    private javax.swing.JTextField jTFruedas;
    // End of variables declaration//GEN-END:variables
}
