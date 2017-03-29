package catalogoMamiferos;

import catalogoMamiferos.excepciones.ListaVaciaException;
import catalogoMamiferos.excepciones.YaExisteException;
import utiles.Menu;

/**
 * Capa de presentacion y comunicacion con el usuario
 * 
 * @author Alberto Perez Cano
 * @version 1.0
 */

public class TestMamifero {
	
	static Catalogo catalogo = new Catalogo();
	
	public static void main(String[] args) {

		Menu menuPrincipal = new Menu("---------- Catalogo de Mamiferos ----------",
				new String[] { "Añadir Mamifero", "Listar Mamiferos", "Listar Humanos", "Listar focas en orden inverso",
						"Contar Murcielagos", "Alimentar a todos los mamiferos del catalogo" });
		do {
			switch (menuPrincipal.gestionar()) {
			case 1:
				addMamifero();
				break;
			case 2:
				listarMamiferos();
				break;
			case 3:
				listarHumanos();
				break;
			case 4:
				listarFocasInverso();
				break;
			case 5:
				contarMurcielagos();
				break;
			case 6:
				alimentarTodos();
				break;
			default:
				System.out.println("Adios");
				System.exit(0);
			}
		} while (true);
	}
	
	/**
	 * Alimenta a todos los mamiferos del catalogo
	 */
	private static void alimentarTodos() {
		try {
			catalogo.alimentarTodos();
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Cuenta los murcielagos que hay en el catalogo
	 */
	private static void contarMurcielagos() {
		try {
			System.out.println(catalogo.contarMurcielagos());
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Lista las focas del catalogo en orden inverso
	 */
	private static void listarFocasInverso() {
		try {
			catalogo.listarFocasInverso();
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Lista los humanos del catalogo
	 */
	private static void listarHumanos() {
		try {
			catalogo.listarHumanos();
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Lista todos los mamiferos del catalogo
	 */
	private static void listarMamiferos() {
		try {
			catalogo.listarMamiferos();
		} catch (ListaVaciaException e) {
			System.err.println(e.getMessage());
		}
	}
	
	/**
	 * Añade un mamifero al catalogo
	 */
	private static void addMamifero() {
		try {
			catalogo.addMamifero();
		} catch (YaExisteException e) {
			System.err.println(e.getMessage());
		}
	}
}
