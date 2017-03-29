package catalogoMamiferos;

import java.util.ArrayList;
import java.util.ListIterator;

import catalogoMamiferos.excepciones.*;
import utiles.Menu;
import utiles.Teclado;

/**
 * Define el catalogo de mamiferos y las acciones que pueden realizarse con el
 * 
 * @author Alberto Perez Cano
 * @version 1.0
 */

public class Catalogo {
	
	/**
	 * Catalogo de mamiferos
	 */
	private ArrayList<Mamifero> catalogoMamiferos = new ArrayList<Mamifero>();
	
	/**
	 * Añade los mamiferos al catalogo
	 * @throws YaExisteException Ya existe un elemento igual en la lista
	 */
	public void addMamifero() throws YaExisteException {
		Menu menu = new Menu("---------- Mamifero a añadir ----------", new String[] {"Homo Sapiens", "Murcielago", "Foca"} );
		
		switch (menu.gestionar()) {
		case 1:
			String nombreHomo = Teclado.leerCadena("Introduce el nombre del Homo Sapiens:");
			HomoSapiens homoSapiens = new HomoSapiens(nombreHomo);
			if (catalogoMamiferos.contains(homoSapiens))
				throw new YaExisteException("El Homo Sapiens " + nombreHomo + " ya existe");
			catalogoMamiferos.add(homoSapiens);
			break;
		case 2:
			String nombreMurcielago = Teclado.leerCadena("Introduce el nombre del Murcielago:");
			if (catalogoMamiferos.contains(nombreMurcielago))
				throw new YaExisteException("El Murcielago " + nombreMurcielago + " ya existe");
			catalogoMamiferos.add(new HomoSapiens(nombreMurcielago));
			break;
		case 3:
			String nombreFoca = Teclado.leerCadena("Introduce el nombre de la foca:");
			if (catalogoMamiferos.contains(nombreFoca))
				throw new YaExisteException("El Murcielago " + nombreFoca + " ya existe");
			catalogoMamiferos.add(new HomoSapiens(nombreFoca));
			break;
		case 4:
			return;

		default:
			break;
		}

	}
	
	/**
	 * Lista los mamiferos
	 * @throws ListaVaciaException La lista esta vacia
	 */
	public void listarMamiferos() throws ListaVaciaException {
		comprobarSiListaVacia();
		for (Mamifero mamifero : catalogoMamiferos) {
			System.out.println(mamifero);
		}
	}
	
	/**
	 * Comprueba si la lista esta vacia y laza la excepcion
	 * @throws ListaVaciaException La lista esta vacia
	 */
	private void comprobarSiListaVacia() throws ListaVaciaException {
		if(catalogoMamiferos.isEmpty())
			throw new ListaVaciaException("La lista esta vacia");
	}
	
	/**
	 * Lista los humanos
	 * @throws ListaVaciaException La lista esta vacia
	 */
	public void listarHumanos() throws ListaVaciaException {
		comprobarSiListaVacia();
		for (Mamifero mamifero : catalogoMamiferos) {
			if(mamifero instanceof HomoSapiens)
				System.out.println(mamifero);
		}
	}
	
	/**
	 * Lista las focas de manera inversa
	 * @throws ListaVaciaException La lista esta vacia
	 */
	public void listarFocasInverso() throws ListaVaciaException {
		comprobarSiListaVacia();
		ListIterator<Mamifero> focas = catalogoMamiferos.listIterator(catalogoMamiferos.size());
		Mamifero mamifero;
		while(focas.hasPrevious()) {
			mamifero = focas.previous();
			if(mamifero instanceof Foca)
				System.out.println(mamifero);
		}
	}
	
	/**
	 * Cuanta los murcielagos del catalogo
	 * @return int numero de murcielagos
	 * @throws ListaVaciaException La lista esta vacia
	 */
	public int contarMurcielagos() throws ListaVaciaException {
		comprobarSiListaVacia();
		int i = 0;
		for (Mamifero mamifero : catalogoMamiferos) {
			if(mamifero instanceof Murcielago)
				i++;
		}
		
		return i;
	}
	
	/**
	 * Alimentar a todos los mamiferos del catalogo
	 * @throws ListaVaciaException La lista esta vacia
	 */
	public void alimentarTodos() throws ListaVaciaException {
		comprobarSiListaVacia();
		for (Mamifero mamifero : catalogoMamiferos) {
			mamifero.alimentar();
		}
	}
	
}
