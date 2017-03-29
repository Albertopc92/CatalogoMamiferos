package catalogoMamiferos.excepciones;

/**
 * Excepcion que se lanza cuando una lista no contiene elementos y se pretende realizar uan accion con ella
 * 
 * @author Alberto Pérez Cano
 * @version 1.0
 */
public class ListaVaciaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ListaVaciaException(String msg) {
		super(msg);
	}

}
