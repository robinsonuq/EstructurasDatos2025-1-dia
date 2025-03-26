package biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarISBN(23);
		biblioteca.agregarISBN(24);
		biblioteca.agregarISBN(28);
		
		biblioteca.imprimirISBNS();
	}
}
