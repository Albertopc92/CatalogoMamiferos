package catalogoMamiferos;

public class Foca extends Mamifero {
	
	private int extremidades = 4;
	
	public Foca(String nombre) {
		super(nombre);
	}

	@Override
	protected String alimentar() {
		amamantar();
		if(etapa == Etapa.CRIA)
			return "Estoy mamando";
		return "Come peces, crustáceos y cefalópodos";
	}

	@Override
	protected String desplazar() {
		return "Repta y nada";
	}

	@Override
	public String toString() {
		return super.toString() + "[extremidades=" + extremidades + "]";
	}
	
	

}
