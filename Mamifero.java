package catalogoMamiferos;

public abstract class Mamifero {
	
	protected String nombre;
	protected Etapa etapa;
	private int amamantado;
	
	public Mamifero(String nombre) {
		this.nombre = nombre;
		this.etapa = Etapa.CRIA;
	}
	
	protected void amamantar() {
		amamantado++;
		if(amamantado == 3)
			madurar();
	}
	
	private void madurar() {
		this.etapa = Etapa.ADULTO;
	}
	
	protected abstract String alimentar();
	
	protected abstract String desplazar();

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[nombre=" + nombre + ", etapa=" + etapa + ", amamantado=" + amamantado + ", alimentar()="
				+ alimentar() + ", desplazar()=" + desplazar() + "]";
	}
	
}

enum Etapa{
	CRIA, ADULTO;
}
