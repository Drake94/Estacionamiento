package Ventanas;

import javax.swing.table.TableColumnModel;

/**
 *
 * @author draco
 */
public class listarVehiculos extends javax.swing.JPanel {

    public listarVehiculos() {
        initComponents();
        rbFuera.setSelected(true);
        TableColumnModel columnModel = tblVehiculos.getColumnModel();
       
        columnModel.getColumn(0).setPreferredWidth(40);
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(0).setPreferredWidth(100); 
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelListar = new javax.swing.JLabel();
        jLabelTipovehiculoBuscar = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelDueñoBuscar = new javax.swing.JLabel();
        jLabelPatenteBuscar = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        rbEstacionado = new javax.swing.JRadioButton();
        rbFuera = new javax.swing.JRadioButton();
        cbMoto = new javax.swing.JCheckBox();
        cbauto = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        tf1patente = new javax.swing.JTextField();
        tf1Dueño = new javax.swing.JTextField();
        cal = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));

        jLabelListar.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabelListar.setForeground(new java.awt.Color(242, 242, 242));
        jLabelListar.setText("Buscar Vehiculos");

        jLabelTipovehiculoBuscar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabelTipovehiculoBuscar.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTipovehiculoBuscar.setText("Tipo de vehiculo");

        jLabelFecha.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(242, 242, 242));
        jLabelFecha.setText("Fecha");

        jLabelDueñoBuscar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabelDueñoBuscar.setForeground(new java.awt.Color(242, 242, 242));
        jLabelDueñoBuscar.setText("Dueño");

        jLabelPatenteBuscar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabelPatenteBuscar.setForeground(new java.awt.Color(242, 242, 242));
        jLabelPatenteBuscar.setText("Patente");

        jLabelUbicacion.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabelUbicacion.setForeground(new java.awt.Color(242, 242, 242));
        jLabelUbicacion.setText("Ubicacion");

        rbEstacionado.setBackground(new java.awt.Color(51, 153, 255));
        rbEstacionado.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rbEstacionado.setForeground(new java.awt.Color(242, 242, 242));
        rbEstacionado.setText("Estacionado");
        rbEstacionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEstacionadoActionPerformed(evt);
            }
        });

        rbFuera.setBackground(new java.awt.Color(51, 153, 255));
        rbFuera.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rbFuera.setForeground(new java.awt.Color(242, 242, 242));
        rbFuera.setText("Fuera");

        cbMoto.setBackground(new java.awt.Color(51, 153, 255));
        cbMoto.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        cbMoto.setForeground(new java.awt.Color(242, 242, 242));
        cbMoto.setText("Moto");
        cbMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotoActionPerformed(evt);
            }
        });

        cbauto.setBackground(new java.awt.Color(51, 153, 255));
        cbauto.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        cbauto.setForeground(new java.awt.Color(242, 242, 242));
        cbauto.setText("Automovil");
        cbauto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbautoActionPerformed(evt);
            }
        });

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdVehiculo", "Patente", "Dueño", "Tipo de vehiculo", "Hora de entrada", "Hora de salida", "Pago"
            }
        ));
        jScrollPane1.setViewportView(tblVehiculos);

        tf1Dueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1DueñoActionPerformed(evt);
            }
        });

        cal.setBackground(new java.awt.Color(255, 255, 255));
        cal.setForeground(new java.awt.Color(255, 255, 255));
        cal.setToolTipText("");
        cal.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Cerrar");

        jButtonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setForeground(new java.awt.Color(51, 153, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTipovehiculoBuscar)
                            .addComponent(jLabelUbicacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMoto)
                            .addComponent(rbFuera))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbauto)
                            .addComponent(rbEstacionado))
                        .addContainerGap(299, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPatenteBuscar)
                            .addComponent(jLabelDueñoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf1Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addComponent(jLabelFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf1patente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(414, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabelListar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelListar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPatenteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1patente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDueñoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf1Dueño, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(cal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipovehiculoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbauto)
                    .addComponent(cbMoto))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbEstacionado)
                    .addComponent(rbFuera))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotoActionPerformed
       
    }//GEN-LAST:event_cbMotoActionPerformed

    private void cbautoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbautoActionPerformed
        
    }//GEN-LAST:event_cbautoActionPerformed

    private void rbEstacionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEstacionadoActionPerformed
        
    }//GEN-LAST:event_rbEstacionadoActionPerformed

    private void tf1DueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1DueñoActionPerformed
        
    }//GEN-LAST:event_tf1DueñoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser cal;
    private javax.swing.JCheckBox cbMoto;
    private javax.swing.JCheckBox cbauto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabelDueñoBuscar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelListar;
    private javax.swing.JLabel jLabelPatenteBuscar;
    private javax.swing.JLabel jLabelTipovehiculoBuscar;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbEstacionado;
    private javax.swing.JRadioButton rbFuera;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField tf1Dueño;
    private javax.swing.JTextField tf1patente;
    // End of variables declaration//GEN-END:variables
}
