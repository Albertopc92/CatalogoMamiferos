package catalogoMamiferos;

/**
 * Define a un murcielago
 * @author Alberto Pérez Cano
 * @version 1.0
 */
public class Murcielago extends Mamifero {
	
	/**
	 * Alas del murcielago
	 */
	private int alas = 2;
	/**
	 * Patas del murcielago
	 */
	private int patas = 2;
	
	public Murcielago(String nombre) {
		super(nombre);
	}
	
	/**
	 * Alimenta al murcielago
	 */
	@Override
	protected String alimentar() {
		amamantar();
		if(etapa == Etapa.CRIA)
			return "Estoy mamando";
		return "Como insectos";
	}
	
	/**
	 * Desplaza al murcielago
	 */
	@Override
	protected String desplazar() {
		return "Volar";
	}
	
	/**
	 * Muestra los datos generales del murcielago
	 */
	@Override
	public String toString() {
		return super.toString() + "[alas=" + alas + ", patas=" + patas + "]";
	}
	
}
