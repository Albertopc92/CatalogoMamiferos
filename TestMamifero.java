package catalogoMamiferos;

import utiles.Menu;

public class TestMamifero {

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo();
		Menu menuPrincipal = new Menu("---------- Catalogo de Mamiferos ----------",
				new String[] { "Añadir Mamifero", "Listar Mamiferos", "Listar Humanos", "Listar focas en orden inverso",
						"Contar Murcielagos", "Alimentar a todos los mamiferos del catalogo" });
		do {
			switch (menuPrincipal.gestionar()) {
			case 1:
				catalogo.addMamifero();
				break;
			case 2:
				catalogo.listarMamiferos();
				break;
			case 3:
				catalogo.listarHumanos();
				break;
			case 4:
				catalogo.listarFocasInverso();
				break;
			case 5:
				System.out.println(catalogo.contarMurcielagos());
				break;
			case 6:
				catalogo.alimentarTodos();
				break;
			default:
				System.out.println("Adios");
				System.exit(0);
			}
		} while (true);
	}
}
