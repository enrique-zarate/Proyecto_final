
package modelo;

import java.util.Comparator;

/**
 *
 * @author Enri - Co6590
 */
public class Ponencia implements Comparable<Ponencia> {
    private int codigo_ponencia;
    private String titulo_ponencia;
    private String fechaRealizacion;
    private String nombreInvestigador;
    private String descripcion;
    private String medio;
    private String estado;
    
    /**
     * Constructor
     */
    public Ponencia(int cod, String titulo_p, String fechaR, String nombreInvest, String desc, String m) {
        codigo_ponencia = cod;
        titulo_ponencia = titulo_p;
        fechaRealizacion = fechaR;
        nombreInvestigador = nombreInvest;
        descripcion = desc;
        medio = m;
        estado = "N"; //No esta asignado a ningun evento
    }
    public Ponencia (int cod, String titulo, String fechaR){
        codigo_ponencia = cod;
        titulo_ponencia = titulo;
        fechaRealizacion = fechaR;
    }
   
    
    /**
     * Getters y setters
     */
    public void setCodigo_ponencia (int codi) {
        codigo_ponencia = codi;
    }
    public int getCodigo_ponencia () {
        return codigo_ponencia;
    }
    public void setTitulo_ponencia (String titu) {
        titulo_ponencia = titu;
    }
    public String getTituloPonecia () {
        return titulo_ponencia;
    }
    public void setFechaRealizacion (String fRealiza) {
        fechaRealizacion = fRealiza;
    }
    public String getFechaRealizacion () {
        return fechaRealizacion;
    }
    public String getNombreInvestigador () {
        return nombreInvestigador;
    }
    public String getMedio () {
        return medio;
    }
    public String getEstado () {
        return estado;
    }
    public void setEstado (String e) {
        estado = e;
    }
    public String getDescripcion () {
        return descripcion;
    }
    
    /**
     * toString
     */
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\nDatos de la Ponencia:");
        str.append("\nID: ").append(codigo_ponencia);
        str.append("\nTitulo: ").append(titulo_ponencia);
        str.append("\nFecha de realizacion: ").append(fechaRealizacion);
        str.append("\nFin: ").append(nombreInvestigador);
        str.append("\nDescripcion: ").append(descripcion);
        str.append("\nMedio: ").append(medio);
        
        return str.toString();
    }
    
    @Override
    public int compareTo(Ponencia p){
        return Comparator.comparingInt(Ponencia::getCodigo_ponencia)
                .thenComparing(Ponencia::getFechaRealizacion)
                .thenComparing(Ponencia::getTituloPonecia)
                .compare(this,p);
    }
    
}
