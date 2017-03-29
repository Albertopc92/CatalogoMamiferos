package catalogoMamiferos;

public class HomoSapiens extends Mamifero {
	
	private int brazos = 2;
	private int piernas = 2;
	
	public HomoSapiens(String nombre) {
		super(nombre);
	}

	@Override
	protected String alimentar() {
		amamantar();
		if(etapa == Etapa.CRIA)
			return "Estoy mamando";
		return "Como de todo";
	}

	@Override
	protected String desplazar() {
		if(etapa == Etapa.CRIA)
			return "Gateo";
		return "Corro";
	}

	@Override
	public String toString() {
		return super.toString() + "[brazos=" + brazos + ", piernas=" + piernas + "]";
	}
}
