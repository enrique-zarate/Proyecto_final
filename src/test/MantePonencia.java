
package test;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.*;


public class MantePonencia extends javax.swing.JInternalFrame {
     private static int idPonencia = 0;
    public static final File ORIGINAL_PONENCIAS = new File("Ponencias.csv");

    /**
     * Creates new form MantePonencia
     */
    public MantePonencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloPonencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePonencia = new javax.swing.JTextField();
        ddtFecRealizacion = new com.toedter.calendar.JDateChooser();
        txtNombreInvestigador = new javax.swing.JTextField();
        txtDescripcionPonen = new javax.swing.JTextField();
        jComboBoxMedio = new javax.swing.JComboBox<>();
        btnSalirPonencia = new javax.swing.JButton();
        btnGuardarPonencia = new javax.swing.JButton();

        setResizable(true);
        setTitle("Ponencias");

        lblTituloPonencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTituloPonencia.setText("Titulo:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Fecha de realizacion:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre del Investigador:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descripcion:");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel5.setText("Creacion de Ponencias");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Medio:");

        txtNombrePonencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombrePonencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePonenciaActionPerformed(evt);
            }
        });

        ddtFecRealizacion.setForeground(new java.awt.Color(255, 0, 51));

        txtNombreInvestigador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDescripcionPonen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDescripcionPonen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescripcionPonen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionPonenActionPerformed(evt);
            }
        });

        jComboBoxMedio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMedio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "Presencial", "Online" }));
        jComboBoxMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMedioActionPerformed(evt);
            }
        });

        btnSalirPonencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalirPonencia.setText("Salir");
        btnSalirPonencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirPonenciaActionPerformed(evt);
            }
        });

        btnGuardarPonencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarPonencia.setText("Guardar");
        btnGuardarPonencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPonenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloPonencia)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ddtFecRealizacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombrePonencia)
                            .addComponent(txtNombreInvestigador)
                            .addComponent(jComboBoxMedio, 0, 164, Short.MAX_VALUE)
                            .addComponent(txtDescripcionPonen)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel5)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnSalirPonencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarPonencia)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTituloPonencia)
                            .addComponent(txtNombrePonencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(ddtFecRealizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3))
                    .addComponent(txtNombreInvestigador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDescripcionPonen, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalirPonencia)
                            .addComponent(btnGuardarPonencia))
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePonenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePonenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePonenciaActionPerformed

    private void txtDescripcionPonenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionPonenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionPonenActionPerformed

    private void jComboBoxMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMedioActionPerformed

    private void btnGuardarPonenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPonenciaActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        String tituloPonen = txtNombrePonencia.getText().trim();
        String nombreInvest = txtNombreInvestigador.getText().trim();
        String descPonen = txtDescripcionPonen.getText().trim();
        String medioPonen = jComboBoxMedio.getSelectedItem().toString();
        String fechaRealizacion = null;

        
        try {
            fechaRealizacion = dateFormat.format(ddtFecRealizacion.getDate());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Fecha vacia");
        }
        /*while (this.ddtFecRealizacion.getDate() == null) {
            
            if(this.ddtFecRealizacion.getDate() != null) {
                //idc.setDate(this.jtxtDate.getDate);
                fechaRealizacion = dateFormat.format(ddtFecRealizacion.getDate());
            } else {
                JOptionPane.showMessageDialog(rootPane, "Seleccione una fecha.");
            }
            //fechaRealizacion = dateFormat.format(ddtFecRealizacion.getDate());
        }*/
        
        idPonencia += 1;
        Ponencia pon = new Ponencia(idPonencia, tituloPonen, fechaRealizacion, nombreInvest, descPonen, medioPonen);
        
        grabarEnDocumento(ORIGINAL_PONENCIAS, pon);
        ddtFecRealizacion.setDate(null); // TO-do: Function
    }//GEN-LAST:event_btnGuardarPonenciaActionPerformed

    private void btnSalirPonenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirPonenciaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirPonenciaActionPerformed

    private void grabarEnDocumento(File archivoP, Ponencia p) {
        try {
            StringBuilder sbp = new StringBuilder();
            
            FileWriter fw;
            fw = new FileWriter(archivoP,true);
            PrintWriter pw;
            pw = new PrintWriter(fw);
            sbp.append(p.getCodigo_ponencia()).append("|").append(p.getTituloPonecia()).append("|").append(p.getFechaRealizacion()).append("|").append(p.getNombreInvestigador()).append("|").append(p.getDescripcion()).append("|").append(p.getMedio()).append("|").append(p.getEstado()).append("\n");
            //sbp.append(p.getCodigo_ponencia() + "^" + p.getTituloPonecia() + "^" + p.getFechaRealizacion() + "^" + p.getNombreInvestigador() + "^" + p.getMedio()+ "\n");
            //sb.append(p.getCiudad()).append("^").append(evt.getFechaDesde()).append("^").append(evt.getFechaHasta()).append("^").append("A").append("\n");
            pw.print(sbp);
            pw.close();
            JOptionPane.showMessageDialog(rootPane, "Ponencia guardada!");
            
        } catch(IOException ex){
           JOptionPane.showMessageDialog(this, ex.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
       }catch(Exception e2){
          JOptionPane.showMessageDialog(this, e2.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    public void ActualizarEstadoPonencia (File original, int id, String motivo) throws IOException{
        Ponencia ponen;
        Boolean exito;       
        int codPonencia;
        
         File auxiliar = new File("Auxiliar.csv");

        if (auxiliar.exists()){
            throw new java.io.IOException("existe");
        }

        FileReader fr = new FileReader(original);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        
        if(motivo.equalsIgnoreCase("USADO")){
            while(linea != null){
                String[] split = linea.split(Pattern.quote("|"),6);
                codPonencia = Integer.decode(split[0]); 
                if( codPonencia == id ){
                    ponen = new Ponencia(codPonencia, split[1], split[2], split[3], split[4], split[5]);
                    grabarEnDocumento(auxiliar, ponen);
                }
                /*else{
                    evt = new Evento(codEvento, split[1], split[2], split[3], split[4] );
                    grabarEnDocumento(auxiliar, evt, "GRABAR");
                }*/
                linea = br.readLine();
            }
            br.close();
            exito = original.delete();
            if(!exito){
                 JOptionPane.showMessageDialog(this, "ERROR FATAL. No se pudo eliminar el archivo", "ERROR FATAL", JOptionPane.ERROR_MESSAGE);
            }
            exito = auxiliar.renameTo(original);
            if (!exito){
                JOptionPane.showMessageDialog(this, "ERROR FATAL. No se pudo renombrar", "ERROR FATAL", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    //ComprobarFecha
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarPonencia;
    private javax.swing.JButton btnSalirPonencia;
    private com.toedter.calendar.JDateChooser ddtFecRealizacion;
    private javax.swing.JComboBox<String> jComboBoxMedio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTituloPonencia;
    private javax.swing.JTextField txtDescripcionPonen;
    private javax.swing.JTextField txtNombreInvestigador;
    private javax.swing.JTextField txtNombrePonencia;
    // End of variables declaration//GEN-END:variables
}
