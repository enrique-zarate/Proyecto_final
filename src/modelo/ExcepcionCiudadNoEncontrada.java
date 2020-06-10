package modelo;

/**
 *
 * @author Mathias Ciancio - CO6607 
 */
public class ExcepcionCiudadNoEncontrada extends Exception {
    public ExcepcionCiudadNoEncontrada(){
        super("No se encontró la ciudad.");
    }
}
