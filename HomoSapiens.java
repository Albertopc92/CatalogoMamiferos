package catalogoMamiferos;

/**
 * Define a un HomoSapiens
 * @author Alberto Pérez Cano
 * @version 1.0
 */
public class HomoSapiens extends Mamifero {
	/**
	 * Brazos del Homo Sapiens
	 */
	private int brazos = 2;
	/**
	 * Piernas del Homo Sapiens
	 */
	private int piernas = 2;
	
	public HomoSapiens(String nombre) {
		super(nombre);
	}
	
	/**
	 * Alimenta al Homo Sapiens
	 */
	@Override
	protected String alimentar() {
		amamantar();
		if(etapa == Etapa.CRIA)
			return "Estoy mamando";
		return "Como de todo";
	}
	
	/**
	 * Desplaza al Homo Sapiens
	 */
	@Override
	protected String desplazar() {
		if(etapa == Etapa.CRIA)
			return "Gateo";
		return "Corro";
	}
	/**
	 * Muestra los datos generales del Homo Sapiens
	 */
	@Override
	public String toString() {
		return super.toString() + "[brazos=" + brazos + ", piernas=" + piernas + "]";
	}
}
