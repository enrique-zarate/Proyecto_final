package modelo;

/**
 *
 * @author Mathias Ciancio - CO6607 
 */
public class ExcepcionPonenciaNoEncontrada extends Exception {
    public ExcepcionPonenciaNoEncontrada(){
        super("No se ha encontrado la ponencia.");
    }
}
