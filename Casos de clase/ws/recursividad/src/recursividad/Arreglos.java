package recursividad;

public class Arreglos {

	public static void main(String[] args) {
		int arreglo[] = {1,2,3,4,5};
		imprimirArreglo2(arreglo,0);

	}

	private static void imprimirArreglo(int[] arreglo) {
		for (; ;) {
			System.out.println("hola");
		}
	}
	
	
	private static void imprimirArreglo2(int[] arreglo, int i) {
		
		// caso base
		if(i == arreglo.length-1) {
			System.out.println("Valor "+arreglo[i]);
		}else {
			imprimirArreglo2(arreglo,i+1);
			System.out.println("Valor "+arreglo[i]);

		}
//		System.out.println("hola");
	}
}
