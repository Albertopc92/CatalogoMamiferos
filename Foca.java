package catalogoMamiferos;

/**
 * Define una foca
 * @author Alberto Pérez Cano
 * @version 1.0
 */
public class Foca extends Mamifero {
	/**
	 * Extremidades de la foca
	 */
	private int extremidades = 4;
	
	public Foca(String nombre) {
		super(nombre);
	}
	
	/**
	 * Alimenta a una foca
	 */
	@Override
	protected String alimentar() {
		amamantar();
		if(etapa == Etapa.CRIA)
			return "Estoy mamando";
		return "Come peces, crustáceos y cefalópodos";
	}

	/**
	 * Desplaza a una foca
	 */
	@Override
	protected String desplazar() {
		return "Repta y nada";
	}
	
	/**
	 * Muestra los datos generales de la foca
	 */
	@Override
	public String toString() {
		return super.toString() + "[extremidades=" + extremidades + "]";
	}
	
	

}
