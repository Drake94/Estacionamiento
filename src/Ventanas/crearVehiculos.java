package Ventanas;


import javax.swing.border.Border;
import javax.swing.text.Document;
/*
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author draco
 */
public class crearVehiculos extends javax.swing.JPanel {


   
    public crearVehiculos() {
        initComponents();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex){
            Logger.getLogger(crearVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCrearvehiculo = new javax.swing.JLabel();
        jLabelPatente = new javax.swing.JLabel();
        jLabelDueño = new javax.swing.JLabel();
        jLabelTipoVehiculo = new javax.swing.JLabel();
        jBMoto = new javax.swing.JRadioButton();
        jBAuto = new javax.swing.JRadioButton();
        jButtonRegistrar = new javax.swing.JButton();
        TFPatente = new javax.swing.JTextField();
        TFDueño = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(736, 620));

        jLabelCrearvehiculo.setFont(new java.awt.Font("Perpetua", 1, 72)); // NOI18N
        jLabelCrearvehiculo.setForeground(new java.awt.Color(242, 242, 242));
        jLabelCrearvehiculo.setText("Crear Vehiculo");

        jLabelPatente.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabelPatente.setForeground(new java.awt.Color(242, 242, 242));
        jLabelPatente.setText("Patente:");

        jLabelDueño.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabelDueño.setForeground(new java.awt.Color(242, 242, 242));
        jLabelDueño.setText("Dueño:");

        jLabelTipoVehiculo.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabelTipoVehiculo.setForeground(new java.awt.Color(242, 242, 242));
        jLabelTipoVehiculo.setText("Tipo de vehiculo");

        jBMoto.setBackground(new java.awt.Color(51, 153, 255));
        jBMoto.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jBMoto.setForeground(new java.awt.Color(242, 242, 242));
        jBMoto.setText("Moto");
        jBMoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBMoto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBMoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMotoActionPerformed(evt);
            }
        });

        jBAuto.setBackground(new java.awt.Color(51, 153, 255));
        jBAuto.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jBAuto.setForeground(new java.awt.Color(242, 242, 242));
        jBAuto.setText("Automovil");
        jBAuto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBAuto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jBAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAutoActionPerformed(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(51, 153, 255));
        jButtonRegistrar.setText("Registrar vehiculo");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        TFPatente.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        TFPatente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFPatenteActionPerformed(evt);
            }
        });

        TFDueño.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        TFDueño.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vehiculo estacionado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCrearvehiculo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelPatente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelDueño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TFPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TFDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonRegistrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabelTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelCrearvehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TFPatente)
                    .addComponent(jLabelPatente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTipoVehiculo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jBMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    String fechaHora = "";
     public static final String DEST = "proyectoparqueadero/hello_world.pdf";
    private void jBMotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMotoActionPerformed
    }//GEN-LAST:event_jBMotoActionPerformed

    private void jBAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAutoActionPerformed

    }//GEN-LAST:event_jBAutoActionPerformed

    private void TFPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFPatenteActionPerformed

    }//GEN-LAST:event_TFPatenteActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        //Define el tipo de vehiculo guardando este dato en una variable local
        String claseVehiculo = "";
        if(jBAuto.isSelected()){
            claseVehiculo = "Automovil";
        }
        if(jBMoto.isSelected()){
            claseVehiculo="Moto";
        }
        // Conexión con la base de datos
        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/estacionamientonuevaera","root", "");
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            fechaHora = dateFormat.format(date);
            System.out.print(dateFormat.format(date));
            Statement stat = conexion.createStatement();
            String sql = "INSERT INTO vehiculo (Patente, TipoVehiculo, Propietario, horaEntrada, estado) VALUES ('" + TFPatente.getText() + "','" + claseVehiculo + "','" + TFDueño.getText() +  "','"  + fechaHora + "','Disponible')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "El vehiculo se registro exitosamente");

        } catch (SQLException ex) {
            Logger.getLogger(crearVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        /*Error con las importaciones
        String dest = "C:\\Users/draco/OneDrive/Escritorio/sample.pdf";
        
        try{
            
            PdfWriter escrito = new PdfWriter(dest);
            PdfDocument docPdf = new PdfDocument(escrito);
            Document documento = new Document(docPdf, PageSize.A4);
            docPdf.addNewPage();
            
            Paragraph parrafo = new Paragraph ("Boleta estacionamiento");
                    
            parrafo.setBorder(Border.NO_BORDER);
            parrafo.setBold();
            
            paragraph parrafo1 = new Paragraph("Patente del auto N°: "+TFPatente.getText()); 
            paragraph parrafo2 = new Paragraph("Nombre del Dueño: "+TFDueño.getText()); 
            paragraph parrafo3 = new Paragraph("Hora de ingreso: "+fechahora);
            
            documento.add(parrafo);
            documento.add(parrafo1);
            documento.add(parrafo2);
            documento.add(parrafo3);
            document.close();
            System.out.println("PDF Creado");
            
        } catch(FileNotFoundException ex){
            Logger.getLogger(crearVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException ex){
            Logger.getLogger(crearVehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            if((new File("C:\\Users/draco/OneDrive/Escritorio/sample.pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rund1132 url.dll, FileProtocolHandler C:\\Users/draco/OneDrive/Escritorio/sample.pdf");
                        p.waitFor();
            } else{
                System.out.println("Archivo no existe!!");
            }
            System.out.println("Completado!!");
        
        } catch(Exception ex){
            ex.printStackTrace();
        }*/
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFDueño;
    private javax.swing.JTextField TFPatente;
    private javax.swing.JRadioButton jBAuto;
    private javax.swing.JRadioButton jBMoto;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCrearvehiculo;
    private javax.swing.JLabel jLabelDueño;
    private javax.swing.JLabel jLabelPatente;
    private javax.swing.JLabel jLabelTipoVehiculo;
    // End of variables declaration//GEN-END:variables
}
