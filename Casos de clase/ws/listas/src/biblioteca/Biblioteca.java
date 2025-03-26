package biblioteca;

import listassimplegenerica.ListaSimple;

public class Biblioteca {

	
	ListaSimple<Libro> listaISBN = new ListaSimple<>();
	
	
	public void agregarISBN(int isbn) {
		listaISBN.addEnd(isbn);
	}


	public void imprimirISBNS() {
		
		listaISBN.imprimirLista();
		
	}
	
	
}
