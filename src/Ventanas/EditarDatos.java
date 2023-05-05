package Ventanas;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * @author Diego Ortega
 * @Email: draco_9431@hotmail.com
 * @fecha creacion 02/05/2023
 */
public class EditarDatos extends javax.swing.JPanel {
    listarVehiculos listarVehiculos;

   
    public EditarDatos() {
        initComponents();
        
        try{
            URL url = new URL("http://localhost:8080/vehiculo" );
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            
            int responseCode =conn.getResponseCode();
            if(responseCode != 200 ){
                throw new RuntimeException("Ocurrio un error: " + responseCode);
            }else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                 
                while(scanner.hasNext()){
                    informationString.append(scanner.nextLine());
                }
                scanner.close();
                
                System.out.println(informationString);
            }
        
        }catch(Exception err){
            err.printStackTrace();
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        JLTitulo = new javax.swing.JLabel();
        JLPatente = new javax.swing.JLabel();
        JLDueno = new javax.swing.JLabel();
        JLMarca = new javax.swing.JLabel();
        JTFpatente = new javax.swing.JTextField();
        JTFmarca = new javax.swing.JTextField();
        JTFdueno = new javax.swing.JTextField();
        jBActualizar = new javax.swing.JButton();
        jBVolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(736, 620));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vehiculo estacionado.png"))); // NOI18N

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jBBuscar.setForeground(new java.awt.Color(51, 153, 255));
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jBEliminar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(51, 153, 255));
        jBEliminar.setText("Eliminar");

        JLTitulo.setFont(new java.awt.Font("Perpetua", 1, 68)); // NOI18N
        JLTitulo.setText("Editor de datos");

        JLPatente.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        JLPatente.setText("Patente");

        JLDueno.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        JLDueno.setText("Dueño");

        JLMarca.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        JLMarca.setText("Marca");

        JTFpatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFpatenteActionPerformed(evt);
            }
        });

        JTFdueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFduenoActionPerformed(evt);
            }
        });

        jBActualizar.setBackground(new java.awt.Color(255, 255, 255));
        jBActualizar.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jBActualizar.setForeground(new java.awt.Color(51, 153, 255));
        jBActualizar.setText("Actualizar");

        jBVolver.setBackground(new java.awt.Color(0, 0, 0));
        jBVolver.setFont(new java.awt.Font("Perpetua", 1, 14)); // NOI18N
        jBVolver.setForeground(new java.awt.Color(51, 153, 255));
        jBVolver.setText("Volver");
        jBVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JLPatente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLMarca)
                                    .addComponent(JLDueno)
                                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(JTFmarca)
                                                .addComponent(JTFdueno, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                            .addComponent(JTFpatente, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPatente)
                    .addComponent(JTFpatente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLMarca)
                    .addComponent(JTFmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFdueno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLDueno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTFduenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFduenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFduenoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVolverActionPerformed
        // TODO add your handling code here:
        this.removeAll();
        listarVehiculos list = new listarVehiculos();
        list.setBounds(0, 0, 736, 620);
        add(list);
        list.setVisible(true);
        list.repaint();
        list.revalidate();
    }//GEN-LAST:event_jBVolverActionPerformed

    private void JTFpatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFpatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFpatenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLDueno;
    private javax.swing.JLabel JLMarca;
    private javax.swing.JLabel JLPatente;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JTextField JTFdueno;
    private javax.swing.JTextField JTFmarca;
    private javax.swing.JTextField JTFpatente;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBVolver;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
