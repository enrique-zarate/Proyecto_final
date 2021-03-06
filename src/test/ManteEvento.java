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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
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
public class ManteEvento extends javax.swing.JInternalFrame implements Serializable {
    private ArrayList<Evento> listaEventos = new ArrayList<>();
    private ArrayList<Ciudad> listaCiudades = new ArrayList<>();
    private static int ultimoCodigo;
    public static final File ORIGINAL = new File("Evento.csv");
    public static final File CIUDADES = new File("Ciudades.csv");
    

    
    /**
     * Creates new form ManteEvento
     */
    public ManteEvento(){
        listaEventos = leerDocEventos(ORIGINAL);
        listaCiudades = leerDocCiudades(CIUDADES);
        initComponents();
        mostrarDatosEnTabla();
        cargarComboCiudades();
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
        lblEvento = new javax.swing.JLabel();
        lblDesde = new javax.swing.JLabel();
        lblHasta = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        txtNombreEvento = new javax.swing.JTextField();
        ddtFecDesde = new com.toedter.calendar.JDateChooser();
        ddtFecHasta = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEvento = new javax.swing.JTable();
        btnGrabar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Mantenimiento de Eventos");

        lblCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCiudad.setText("Ciudad:");

        lblEvento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEvento.setText("Evento:");

        lblDesde.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDesde.setText("Desde:");

        lblHasta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblHasta.setText("Hasta:");

        cbCiudad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCiudadMouseClicked(evt);
            }
        });

        txtNombreEvento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ddtFecDesde.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        ddtFecHasta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tablaEvento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaEvento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Evento", "Ciudad", "Fecha de Inicio", "Fecha de Finalizacion", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaEvento);
        if (tablaEvento.getColumnModel().getColumnCount() > 0) {
            tablaEvento.getColumnModel().getColumn(0).setMinWidth(60);
            tablaEvento.getColumnModel().getColumn(0).setMaxWidth(60);
            tablaEvento.getColumnModel().getColumn(1).setMinWidth(100);
            tablaEvento.getColumnModel().getColumn(2).setMinWidth(100);
            tablaEvento.getColumnModel().getColumn(3).setMinWidth(100);
            tablaEvento.getColumnModel().getColumn(4).setMinWidth(100);
            tablaEvento.getColumnModel().getColumn(5).setMinWidth(30);
            tablaEvento.getColumnModel().getColumn(5).setPreferredWidth(30);
            tablaEvento.getColumnModel().getColumn(5).setMaxWidth(30);
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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCiudad)
                            .addComponent(lblEvento)
                            .addComponent(lblDesde, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHasta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCiudad, 0, 265, Short.MAX_VALUE)
                            .addComponent(txtNombreEvento)
                            .addComponent(ddtFecDesde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ddtFecHasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCiudad))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEvento))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ddtFecDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(ddtFecHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        String nombre = txtNombreEvento.getText().trim();
        String ciudad = cbCiudad.getItemAt(cbCiudad.getSelectedIndex());
        String fecDesde;
        String fecHasta;
        if (ddtFecDesde.getDate() == null){
            fecDesde = "";
        }
        else{
            fecDesde = dateFormat.format(ddtFecDesde.getDate()); 
        }
        if (ddtFecHasta.getDate() == null){
            fecHasta = "";
        }
        else{
            fecHasta = dateFormat.format(ddtFecHasta.getDate()); 
        }

        if ( !verificarCamposCargados(nombre, fecDesde, fecHasta) && !verificarFechas(ddtFecDesde.getDate(), ddtFecHasta.getDate()) && !verificarEventoRepetido(nombre, ciudad, fecDesde, fecHasta)){
            Evento evento = new Evento(ultimoCodigo,nombre,ciudad,fecDesde,fecHasta );
            ultimoCodigo +=1;
            listaEventos.add(evento);        
            grabarEnDocumento(ORIGINAL, evento, "GRABAR");
            mostrarDatosEnTabla();
        } 
        txtNombreEvento.setText("");
        ddtFecDesde.setDate(null);
        ddtFecHasta.setDate(null);
        
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    public Evento buscarEvento(int cod) throws ExcepcionEventoNoEncontrado{      
        Evento busqueda = null;
        if (!listaEventos.isEmpty()){
            for(Evento evt : listaEventos){
            //Si coinciden los nombres de autor y titulo
                if ( cod == evt.getCodigoEvento() ){
                    busqueda = evt;
                    break;
                }
            }
            if (busqueda != null){
                return busqueda;
            }
            else{
                throw( new ExcepcionEventoNoEncontrado() );
            }
        }else{
            JOptionPane.showMessageDialog(this, "El archivo esta vacio.","Alerta", JOptionPane.ERROR_MESSAGE);
        }
        return busqueda;
    } 
    
    
    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        boolean borrado = false;
        int id;
        for (int i = 0; tablaEvento.getRowCount() > i; i++) {
            if( tablaEvento.getValueAt(i, 5) == Boolean.TRUE ){
                try {
                    id = (Integer)tablaEvento.getValueAt(i,0);
                    listaEventos.remove(buscarEvento(id));
                    ActualizarEvento(ORIGINAL, id, "BAJA EVENTO");
                    borrado = true;
                } catch (ExcepcionEventoNoEncontrado ex) {
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
            JOptionPane.showMessageDialog(this, "No se seleccionó el evento a borrar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void cbCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCiudadMouseClicked
        cbCiudad.removeAllItems();
        listaCiudades = leerDocCiudades(CIUDADES);
        cargarComboCiudades();
    }//GEN-LAST:event_cbCiudadMouseClicked

    /*
    Este metodo verifica que los campos antes de guardar no esten vacios
    */
    private boolean verificarCamposCargados(String n, String fecDesde, String fecHasta){  
        boolean error = false;
 
        if ( (n.equalsIgnoreCase("")) || ( fecDesde.equalsIgnoreCase("")) || (fecHasta.equalsIgnoreCase("")) ){
            JOptionPane.showMessageDialog(this, "No se puede grabar un Evento con un campo vacío", "Advertencia", JOptionPane.WARNING_MESSAGE);
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
    
    /*
    Con este metodo verifico que la fecha de inicio no sea menor que la fecha de finalizacion
    */
    private boolean verificarFechas(Date desde, Date hasta){
        boolean error = false;
        if(desde.compareTo(hasta) > 0){
            JOptionPane.showMessageDialog(this, "La fecha de inicio no puede ser mayor a la fecha de finalizacion.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            error= true;
        }
        return error;
    }
    
    /*
    Con este metodo verifico que no se repitan los datos a la hora de crear un evento
    */
    
    /*
    Aca tiene que recorrer el array por cada control, implemetar eso
    */
    private boolean verificarEventoRepetido(String nom, String c, String desde, String hasta){
    /*Condiciones que se tienen que evitar:
      1- Un evento con mismo nombre, misma ciudad y mismas fechas de inicio y fin.
      2- Un evento con mismo nombre, misma ciudad y una o ambas fechas estan dentro del rango de fechas del evento ya registado.
      3- Un evento con mismo nombre, otra ciudad y una o ambas fechas estan dentro del rango de fechas de un evento en otra ciudad ya registrado.
        
      Se tiene que cumplir:
      1- Un evento con mismo nombre, misma ciudad, rango de fechas de inicio y fin distintos que otro evento cargado.
      2- Un evento con mismo nombre, otra ciudad, rango de fechas de inicio y fin distintos que otro evento cargado.
      2- Un evento con nombre distinto, en alguna ciudad, rango de fechas de inicio y fin distintos que cualquier otro evento cargado.
    */
        
        boolean error = false;
        String nuevoSinAcento = quitarAcentos(nom);
        for( Evento e : listaEventos){
            String nomSinAcento = quitarAcentos(e.getNombreEvento().trim());    
                   
            if( nuevoSinAcento.equalsIgnoreCase(nomSinAcento) ){ //mismo nombre de evento
                if (c.equalsIgnoreCase(e.getCiudad())){ //misma ciudad
                    if(desde.compareTo(e.getFechaDesde()) == 0 && hasta.compareTo(e.getFechaHasta())==0){ //misma Fecha de Inicio y misma Fecha de Fin que otro evento, o sea, repetido
                        JOptionPane.showMessageDialog(this, "001 . No se puede cargar el evento. El evento esta repetido.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        error = true;
                        break;
                    }
                    else if( (desde.compareTo(e.getFechaDesde()) >= 0 && desde.compareTo(e.getFechaHasta())<= 0 ) //La fecha Desde esta entre el desde y el hasta  
                             || (( hasta.compareTo(e.getFechaDesde())>=0 ) && hasta.compareTo(e.getFechaHasta())<= 0 ) //La fecha hasta esta entre el desde y el hasta
                           ){ 
                           //Si llega aca es porque cargo un evento de mismo nombre, en la misma ciudad que el evento que encontro, y la fecha que puso esta entre el comienzo y fin del evento que compara:
                           //Registro 001, Investigacion, Asuncion, 01/05/2020, 05/05/2020
                           //Entrada: 002, Investigacion, Asuncion, 02/05/2020, 03/05/2020   caeria en este error
                           JOptionPane.showMessageDialog(this, "002 . No se puede cargar el evento. Un evento con el mismo nombre está ocurriendo en la misma ciudad entre las fechas cargadas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                           error = true;
                           break;
                    }
                }
                else{ //En otra ciudad
                    if( (desde.compareTo(e.getFechaDesde()) >= 0 && desde.compareTo(e.getFechaHasta())<= 0 ) //La fecha Desde esta entre el desde y el hasta  
                     || (( hasta.compareTo(e.getFechaDesde())>=0 ) && hasta.compareTo(e.getFechaHasta())<= 0 ) //La fecha hasta esta entre el desde y el hasta
                      ){
                        JOptionPane.showMessageDialog(this, "003 . No se puede cargar el evento. Un evento con el mismo nombre está ocurriendo en otra ciudad entre las fechas cargadas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        error = true;
                        break;
                    }
                }
            }else{
                if (c.equalsIgnoreCase(e.getCiudad())){ //misma ciudad
                    //     desde >= desde                              desde <= Hasta
                    if( (desde.compareTo(e.getFechaDesde()) >= 0 && desde.compareTo(e.getFechaHasta())<= 0 ) //La fecha Desde esta entre el desde y el hasta  
                             || (( hasta.compareTo(e.getFechaDesde())>=0 ) && hasta.compareTo(e.getFechaHasta())<= 0 ) //La fecha hasta esta entre el desde y el hasta
                           ){ 
                           //Si llega aca es porque cargo un evento con otro nombre, en la misma ciudad que el evento que encontro, y la fecha que puso esta entre el comienzo y fin del evento que compara:
                           //Registro 001, Investigacion, Asuncion, 01/05/2020, 05/05/2020
                           //Entrada: 002, Planificacion, Asuncion, 02/05/2020, 03/05/2020   caeria en este error
                           JOptionPane.showMessageDialog(this, "004 . No se puede cargar el evento. Un evento está ocurriendo en la misma ciudad entre las fechas cargadas.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                           error = true;
                           break;
                    }
                }
            }
            
        }            
        return error;
    }
    
    private void cargarComboCiudades(){
        for (Ciudad c : listaCiudades) {
            cbCiudad.addItem(c.getCiudad());
        }
    }

    private void mostrarDatosEnTabla(){
        String titulos[] = {"ID","Evento","Ciudad","Fecha de Inicio","Fecha de Finalizacion","Seleccionar"};
        DefaultTableModel modelo = new DefaultTableModel(null,titulos){
            Class[] types = new Class [] {Integer.class, String.class, String.class, String.class, String.class, Boolean.class};
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };    
        
        if (!listaEventos.isEmpty()){
            for(Evento e : listaEventos){
                if(e != null){
                    Object campos[] = new Object[6];
                    campos[0] = e.getCodigoEvento();
                    campos[1] = e.getNombreEvento();
                    campos[2] = e.getCiudad();                      
                    campos[3] = e.getFechaDesde();                    
                    campos[4] = e.getFechaHasta();
                    campos[5] = Boolean.FALSE;
                    modelo.addRow(campos);
                }
                tablaEvento.setModel(modelo);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "El archivo esta vacio.","Alerta", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void ActualizarEvento(File original, int id,String motivo) throws IOException{
        Evento evt;
        Boolean exito;       
        int codEvento;
        
            File auxiliar = new File("Auxiliar.csv");
            
            if (auxiliar.exists()){
                throw new java.io.IOException("existe");
            }    
            
            FileReader fr = new FileReader(original);
            BufferedReader br = new BufferedReader(fr);
            
            String linea = br.readLine();
            if(motivo.equalsIgnoreCase("BAJA EVENTO")){
                while(linea != null){
                    String[] split = linea.split(Pattern.quote("|"),7);
                    codEvento = Integer.decode(split[0]); 
                    if( codEvento == id ){
                        evt = new Evento(codEvento, split[1], split[2], split[3], split[4] );
                        grabarEnDocumento(auxiliar, evt, "BORRAR");
                    }
                    else{
                         evt = new Evento(codEvento, split[1], split[2], split[3], split[4] );
                        grabarEnDocumento(auxiliar, evt, "GRABAR");
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
    
    
    
    
    /*
    Traigo los datos previamente guardados en un archivo csv que tiene informacion de los eventos cargados sin sus ponencias
    */
    
    private ArrayList leerDocEventos(File archivo){
        ArrayList<Evento> eventos = new ArrayList<>();
        Evento evt;
        int cod;
        int ultCod = 0;
        try{            
            if (archivo.exists()){
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String linea = br.readLine();
                while(linea != null){
                    String split[] = linea.split(Pattern.quote("|"),7);
                    cod = Integer.decode(split[0]);
                    evt = new Evento(cod, split[1], split[2], split[3], split[4] );                    
                    
                    //Split[5] es la columna de Estado
                    if( split[5].equalsIgnoreCase("A")){
                        eventos.add(evt);
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
        Collections.sort(eventos);    
        return eventos;
    }
    
    private ArrayList leerDocCiudades(File archivo){
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        Ciudad c;
        int cod;
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
                    linea = br.readLine();
                }
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
    
    
    
    
/*
Este metodo se usa cuando se va a dar de Alta un nuevo evento    
*/    
    private void grabarEnDocumento(File archivo, Evento evt, String accion){
    /*
        A = Alta / Activo
        B = Baja / Borrado / Inactivo
    */  
        try{
           StringBuilder sb = new StringBuilder();
           
           if (accion.equalsIgnoreCase("GRABAR")){
             FileWriter fw = new FileWriter(archivo,true);
             PrintWriter pw = new PrintWriter(fw);
             sb.append(evt.getCodigoEvento()).append("|").append(evt.getNombreEvento()).append("|");
             sb.append(evt.getCiudad()).append("|").append(evt.getFechaDesde()).append("|").append(evt.getFechaHasta()).append("|").append("A").append("|").append(evt.getListaPonencias().size()).append("\n");
             pw.print(sb.toString());
             pw.close();
           }
           else if (accion.equalsIgnoreCase("BORRAR")){
             FileWriter fw = new FileWriter(archivo,true);
             PrintWriter pw = new PrintWriter(fw);
             sb.append(evt.getCodigoEvento()).append("|").append(evt.getNombreEvento()).append("|");
             sb.append(evt.getCiudad()).append("|").append(evt.getFechaDesde()).append("|").append(evt.getFechaHasta()).append("|").append("B").append("|").append(evt.getListaPonencias().size()).append("\n");
             pw.print(sb.toString());
             pw.close();
           }
           
       }catch(IOException ex){
           JOptionPane.showMessageDialog(this, ex.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
       }catch(Exception e2){
          JOptionPane.showMessageDialog(this, e2.getMessage(),"Alerta", JOptionPane.ERROR_MESSAGE);
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> cbCiudad;
    private com.toedter.calendar.JDateChooser ddtFecDesde;
    private com.toedter.calendar.JDateChooser ddtFecHasta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDesde;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblHasta;
    private javax.swing.JTable tablaEvento;
    private javax.swing.JTextField txtNombreEvento;
    // End of variables declaration//GEN-END:variables

 
}
