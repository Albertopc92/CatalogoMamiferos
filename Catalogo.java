package catalogoMamiferos;

import java.util.ArrayList;
import java.util.ListIterator;

import catalogoMamiferos.excepciones.*;
import utiles.Menu;
import utiles.Teclado;

public class Catalogo {

	private ArrayList<Mamifero> catalogoMamiferos = new ArrayList<Mamifero>();

	public void addMamifero() {
		Menu menu = new Menu("---------- Mamifero a añadir ----------", new String[] {"Homo Sapiens", "Murcielago", "Foca"} );
		
		switch (menu.gestionar()) {
		case 1:
			/*String nombreHomo = Teclado.leerCadena("Introduce el nombre del Homo Sapiens:");
			HomoSapiens homoSapiens = new HomoSapiens(nombreHomo);
			if (catalogoMamiferos.contains(homoSapiens))
				throw new YaExisteException("El Homo Sapiens " + nombreHomo + " ya existe");
			catalogoMamiferos.add(homoSapiens);*/
			catalogoMamiferos.add(new HomoSapiens(Teclado.leerCadena("Nombre del Homo Sapiens")));
			break;
		case 2:
			/*String nombreMurcielago = Teclado.leerCadena("Introduce el nombre del Murcielago:");
			if (catalogoMamiferos.contains(nombreMurcielago))
				throw new YaExisteException("El Murcielago " + nombreMurcielago + " ya existe");
			catalogoMamiferos.add(new HomoSapiens(nombreMurcielago));*/
			catalogoMamiferos.add(new Murcielago(Teclado.leerCadena("Nombre del Murcielago")));
			break;
		case 3:
			/*String nombreFoca = Teclado.leerCadena("Introduce el nombre de la foca:");
			if (catalogoMamiferos.contains(nombreFoca))
				throw new YaExisteException("El Murcielago " + nombreFoca + " ya existe");
			catalogoMamiferos.add(new HomoSapiens(nombreFoca));*/
			catalogoMamiferos.add(new Foca(Teclado.leerCadena("Nombre de la foca")));
			break;
		case 4:
			return;

		default:
			break;
		}

	}
	
	/**
	 * Lista los mamiferos
	 */
	public void listarMamiferos() {
		for (Mamifero mamifero : catalogoMamiferos) {
			System.out.println(mamifero);
		}
	}
	
	/**
	 * Lista los humanos
	 */
	public void listarHumanos() {
		for (Mamifero mamifero : catalogoMamiferos) {
			if(mamifero instanceof HomoSapiens)
				System.out.println(mamifero);
		}
	}
	
	/**
	 * Lista las focas de manera inversa
	 */
	public void listarFocasInverso() {
		ListIterator<Mamifero> it = catalogoMamiferos.listIterator(catalogoMamiferos.size());
		
		while(it.hasPrevious()) {
			if(it.next() instanceof Foca)
				System.out.println(it);
		}
	}
	
	/**
	 * Cuanta los murcielagos del catalogo
	 * @return int numero de murcielagos
	 */
	public int contarMurcielagos() {
		int i = 0;
		for (Mamifero mamifero : catalogoMamiferos) {
			if(mamifero instanceof Murcielago)
				i++;
		}
		
		return i;
	}
	
	/**
	 * Alimentar a todos los mamiferos del catalogo
	 */
	public void alimentarTodos() {
		for (Mamifero mamifero : catalogoMamiferos) {
			mamifero.alimentar();
		}
	}
	
}
