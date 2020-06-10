package modelo;

/**
 *
 * @author Mathias Ciancio - CO6607 
 */
public class Ciudad implements Comparable<Ciudad> {
    private int codigo_ciudad;
    private String ciudad;
    
    //Constructores
    public Ciudad(int cod, String c){
        codigo_ciudad = cod;
        ciudad = c;
    }
    
    //Setters
    public void setCiudad(String c){
        ciudad = c;
    }
    public void setCodigo(int cod){
        codigo_ciudad = cod;
    }
    
    //Getters
    public String getCiudad(){
        return ciudad;
    }
    public int getCodigoCiudad(){
        return codigo_ciudad;
    }
    
    //Metodos
    @Override
    public String toString(){
        StringBuilder str = new StringBuilder("\nCiudad:");
        str.append("\nID: ").append(codigo_ciudad);
        str.append("\nNombre: ").append(ciudad);
    
        return str.toString();
    }   
    
    @Override
    public int compareTo(Ciudad c){
        return this.ciudad.compareTo(c.getCiudad());
    }
}
