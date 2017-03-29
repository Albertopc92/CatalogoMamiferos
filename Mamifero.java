package catalogoMamiferos;

/**
 * Define un mamifero
 * @author Alberto Pérez Cano
 * @version 1.0
 */
public abstract class Mamifero {
	
	/**
	 * Nombre del mamifero
	 */
	protected String nombre;
	/**
	 * Etapa en la qeu se encuentra el mamifero
	 */
	protected Etapa etapa;
	/**
	 * Las veces que se ha amamantado el mamifero
	 */
	private int amamantado;
	
	public Mamifero(String nombre) {
		this.nombre = nombre;
		this.etapa = Etapa.CRIA;
	}
	
	
	/**
	 * Amamanta al mamifero
	 */
	protected void amamantar() {
		amamantado++;
		if(amamantado == 3)
			madurar();
	}
	
	/**
	 * Pasa a la etapa madura a un mamifero
	 */
	private void madurar() {
		this.etapa = Etapa.ADULTO;
	}
	
	/**
	 * Alimenta a un mamifero
	 * @return Manera en la que se alimenta el mamifero
	 */
	protected abstract String alimentar();
	/**
	 * Desplaza a un mamifero
	 * @return Manera en la que se desplaza el mamifero
	 */
	protected abstract String desplazar();
	
	/**
	 * Muestra los datos del mamifero
	 */
	@Override
	public String toString() {
		return getClass().getSimpleName() + "[nombre=" + nombre + ", etapa=" + etapa + ", amamantado=" + amamantado + ", alimentar()="
				+ alimentar() + ", desplazar()=" + desplazar() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mamifero other = (Mamifero) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equalsIgnoreCase(other.nombre))
			return false;
		return true;
	}
	
}

/**
 * Etapas de la vida
 * @author Alberto Perez Cano
 *
 */
enum Etapa{
	CRIA, ADULTO;
}
