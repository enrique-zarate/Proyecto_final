package modelo;

/**
 *
 * @author Mathias Ciancio - CO6607 
 */
public class ExcepcionEventoNoEncontrado extends Exception{
    public ExcepcionEventoNoEncontrado(){
        super("No se encontró el evento.");
    }
}
