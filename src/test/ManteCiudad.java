/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Mathias Ciancio - CO6607
 */
public class ManteCiudad extends javax.swing.JInternalFrame implements Serializable {

    private ArrayList<Ciudad> listaCiudades = new ArrayList<>();
    private static int ultimoCodigo;
    public static final File ORIGINAL = new File("Ciudades.csv");
    
    
    public ManteCiudad() {
        listaCiudades = leerDocCiudades(ORIGINAL);
        initComponents();
        mostrarDatosEnTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCiudad = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCiudades = new javax.swing.JTable();
        btnGrabar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento de Ciudades");

        lblCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCiudad.setText("Ciudad:");

        txtCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tablaCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaCiudades);
        if (tablaCiudades.getColumnModel().getColumnCount() > 0) {
            tablaCiudades.getColumnModel().getColumn(0).setMinWidth(30);
            tablaCiudades.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaCiudades.getColumnModel().getColumn(0).setMaxWidth(30);
            tablaCiudades.getColumnModel().getColumn(2).setMinWidth(30);
            tablaCiudades.getColumnModel().getColumn(2).setPreferredWidth(30);
            tablaCiudades.getColumnModel().getColumn(2).setMaxWidth(30);
        }

        btnGrabar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.setToolTipText("Graba los datos proporcionados.");
        btnGrabar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setToolTipText("Borra los eventos seleccionados en la tabla.");
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela la carga y desmarca los eventos a borrar.");
        btnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCiudad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCiudad)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGrabar)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        boolean borrado = false;
        int id;
        for (int i = 0; tablaCiudades.getRowCount() > i; i++) {
            if( tablaCiudades.getValueAt(i, 2) == Boolean.TRUE ){
                try {
                    id = (Integer)tablaCiudades.getValueAt(i,0);
                    listaCiudades.remove(buscarCiudad(id));
                    ActualizarCiudad(ORIGINAL, id, "BAJA CIUDAD");
                    borrado = true;
                } catch (ExcepcionCiudadNoEncontrada ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    Logger.getLogger(ManteEvento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(borrado){
            mostrarDatosEnTabla();
        }
        else{
            JOptionPane.showMessageDialog(this, "No se seleccionó la ciudad a borrar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtCiudad.setText("");
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        String nombre = txtCiudad.getText().trim();
        
        if ( !verificarCamposCargados(nombre) && !verificarNombreRepetido(nombre)){
            Ciudad c = new Ciudad(ultimoCodigo,nombre);
            ultimoCodigo +=1;
            listaCiudades.add(c);        
            grabarEnDocumento(ORIGINAL, c, "GRABAR");
            mostrarDatosEnTabla();
        }
        txtCiudad.setText("");
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private boolean verificarCamposCargados(String ciudad){  
        boolean error = false;

        if ( ciudad.equalsIgnoreCase("") ){
            JOptionPane.showMessageDialog(this, "No se puede grabar una Ciudad sin nombre", "Advertencia", JOptionPane.WARNING_MESSAGE);
            error = true;
        }
        return error;
    }
    
    //Con este metodo puedo comparar letra por letra aun si tienen caracteres especiales como los acentos, asi me aseguro que no se dupliquen campos con acentos
    private String quitarAcentos(String s){
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    private boolean verificarNombreRepetido(String ciudad){
        boolean error = false;
        String nuevoSinAcento = quitarAcentos(ciudad);
        for( Ciudad c : listaCiudades){
            String ciudadSinAcento = quitarAcentos(c.getCiudad().trim());
            if( nuevoSinAcento.equalsIgnoreCase(ciudadSinAcento) ){
                error = true;
                break;
            }
        }
        return error;
    }
    
    private void mostrarDatosEnTabla(){
        String titulos[] = {"ID","Nombre","Seleccionar"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos){
            Class[] types = new Class [] {Integer.class, String.class, Boolean.class};
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };    
        
        if (!listaCiudades.isEmpty()){
            for(Ciudad c : listaCiudades){
                if(c != null){
                    Object campos[] = new Object[3];
                    campos[0] = c.getCodigoCiudad();
                    campos[1] = c.getCiudad();
                    campos[2] = Boolean.FALSE;                      
                    modelo.addRow(campos);
                }
                tablaCiudades.setModel(modelo);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "El archivo esta vacio.","Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    public Ciudad buscarCiudad(int cod) throws ExcepcionCiudadNoEncontrada{      
        Ciudad busqueda = null;
        if (!listaCiudades.isEmpty()){
            for(Ciudad c : listaCiudades){
            //Si coinciden los nombres de autor y titulo
                if ( cod == c.getCodigoCiudad() ){
                    busqueda = c;
                    break;
                }
            }
            if (busqueda != null){
                return busqueda;
            }
            else{
                throw( new ExcepcionCiudadNoEncontrada() );
            }
        }else{
            JOptionPane.showMessageDialog(this, "El archivo esta vacio.","Alerta", JOptionPane.ERROR_MESSAGE);
        }
        return busqueda;
    }
    
    
    //GRABAR, BORRAR, ACTUALIZAR, LEER
    private void ActualizarCiudad(File original, int id,String motivo) throws IOException{
        Ciudad c;
        Boolean exito;       
        int codCiudad;
        
            File auxiliar = new File("Auxiliar.csv");
            
            if (auxiliar.exists()){
                throw new java.io.IOException("existe");
            }    
            
            FileReader fr = new FileReader(original);
            BufferedReader br = new BufferedReader(fr);
            
            String linea = br.readLine();
            if(motivo.equalsIgnoreCase("BAJA CIUDAD")){
                while(linea != null){
                    String[] split = linea.split(Pattern.quote("|"),3);
                    codCiudad = Integer.decode(split[0]); 
                    if( codCiudad == id ){
                        c = new Ciudad(codCiudad, split[1]);
                        grabarEnDocumento(auxiliar, c, "BORRAR");
                    }
                    else{
                         c = new Ciudad(codCiudad, split[1] );
                        grabarEnDocumento(auxiliar, c, "GRABAR");
                    }                    
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
    private void grabarEnDocumento(File archivo, Ciudad c, String accion){
    /*
        A = Alta / Activo
        B = Baja / Borrado / Inactivo
    */  
        try{
           StringBuilder sb = new StringBuilder();
           
           if (accion.equalsIgnoreCase("GRABAR")){
             FileWriter fw = new FileWriter(archivo,true);
             PrintWriter pw = new PrintWriter(fw);
             sb.append(c.getCodigoCiudad()).append("|").append(c.getCiudad()).append("|").append("A").append("\n");
             pw.print(sb.toString());
             pw.close();
           }
           else if (accion.equalsIgnoreCase("BORRAR")){
             FileWriter fw = new FileWriter(archivo,true);
             PrintWriter pw = new PrintWriter(fw);
             sb.append(c.getCodigoCiudad()).append("|").append(c.getCiudad()).append("|").append("B").append("\n");
             pw.print(sb.toString());
             pw.close();
           }
           
       }catch(IOException ex){
           JOptionPane.showMessageDialog(this, ex.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
       }catch(Exception e2){
          JOptionPane.showMessageDialog(this, e2.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
       }
    }

    private ArrayList leerDocCiudades(File archivo){
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        Ciudad c;
        int cod;
        int ultCod = 0;
        try{            
            if (archivo.exists()){
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea = br.readLine();
                while(linea != null){
                    String split[] = linea.split(Pattern.quote("|"),3);
                    cod = Integer.decode(split[0]);
                    c = new Ciudad(cod, split[1]);                    
                    if( split[2].equalsIgnoreCase("A")){
                        ciudades.add(c);
                    }
                    ultCod = Integer.decode(split[0]);                  
                    linea = br.readLine();
                }
                ultimoCodigo = 1 + ultCod;
                br.close();
            }
            else{
                JOptionPane.showMessageDialog(this, "Se creará un archivo nuevo vacío.", "Alerta", JOptionPane.ERROR_MESSAGE);
            }
        }catch(IOException e){
            JOptionPane.showMessageDialog(this, e.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
            
        }
        Collections.sort(ciudades);    
        return ciudades;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JTable tablaCiudades;
    private javax.swing.JTextField txtCiudad;
    // End of variables declaration//GEN-END:variables
}
