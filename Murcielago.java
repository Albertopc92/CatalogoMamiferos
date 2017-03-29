package catalogoMamiferos;

public class Murcielago extends Mamifero {
	
	private int alas = 2;
	private int patas = 2;
	
	public Murcielago(String nombre) {
		super(nombre);
	}

	@Override
	protected String alimentar() {
		amamantar();
		if(etapa == Etapa.CRIA)
			return "Estoy mamando";
		return "Como insectos";
	}

	@Override
	protected String desplazar() {
		return "Volar";
	}

	@Override
	public String toString() {
		return super.toString() + "[alas=" + alas + ", patas=" + patas + "]";
	}
	
	
	
	
}
