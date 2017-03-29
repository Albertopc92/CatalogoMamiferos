package catalogoMamiferos.excepciones;

/**
 * Excepcion que se lanza cuando un elemento ya existe en una lista
 * 
 * @author Alberto Pérez Cano
 * @version 1.0
 */
public class YaExisteException extends Exception {

	public YaExisteException(String msg) {
		super(msg);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	

}
