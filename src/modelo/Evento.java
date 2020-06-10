package modelo;

import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author Mathias Ciancio - CO6607 
 */
public class Evento implements Comparable<Evento>{
    private int codigo_evento;
    private String nombre_evento;
    private String ciudad;
    private String fechaDesde;
    private String fechaHasta;
    //private ArrayList<Ponencia> listaPonencias;
    
    public Evento(int cod, String nombre, String c, String desde, String hasta){
        codigo_evento = cod;
        nombre_evento = nombre;
        ciudad = c;
        fechaDesde = desde;
        fechaHasta = hasta;        
    }
    
    //Setters
    public void setCodigoEvento(int cod){
        codigo_evento = cod;
    }
    public void setNombreEvento(String nom){
        nombre_evento = nom;
    }
    public void setCiudad(String c){
        ciudad = c;
    }
    public void setFechaDesde(String desde){
        fechaDesde = desde;
    }
    public void setFechaHasta(String hasta){
        fechaHasta = hasta;
    }
    /*
    public void asignarPonencias(Ponencia p){
        listaPonencias.add(p)
    }
    */
    //Getters
    public int getCodigoEvento(){
        return codigo_evento;
    }
    public String getNombreEvento(){
        return nombre_evento;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getFechaDesde(){
        return fechaDesde;
    }
    public String getFechaHasta(){
        return fechaHasta;
    }
    
    /*public ArrayList getListaPonencias(){
        return listaPonencias;
    }
    */  

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\nDatos del Evento:");
        str.append("\nID: ").append(codigo_evento);
        str.append("\nNombre: ").append(nombre_evento);
        str.append("\nCiudad: ").append(ciudad);
        str.append("\nInicio: ").append(fechaDesde);
        str.append("\nFin: ").append(fechaHasta);
        /*
        Agregar las ponencias aqui
        */
        return str.toString();
    }
    
    @Override
    public int compareTo(Evento e){
        return Comparator.comparingInt(Evento::getCodigoEvento)
                .thenComparing(Evento::getNombreEvento)
                .thenComparing(Evento::getCiudad)
                .compare(this,e);
    }
    
    
}
