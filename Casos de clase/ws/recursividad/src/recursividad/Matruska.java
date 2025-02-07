package recursividad;

public class Matruska {

	public static void main(String[] args) {
		int n = 5;
		imprimir_matruska(n);
		System.out.println("hola");
	}
	private static void imprimir_matruska(int n) {
		//caso(s) base o condicion de parada
		if(n == 0) {
			System.out.println("Termine");
		}
		else {
			System.out.println("Abriendo matruska "+n);
			imprimir_matruska(n-1);
			System.out.println("Carrando matruska "+n);

		}
		//caso recursivo
	}
}
