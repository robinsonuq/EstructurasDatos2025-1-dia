package dividevenceras;

public class Operacion {

	
	public  int sumarArreglo(int [] arreglo) {
		int inicio = 0;
		int fin = arreglo.length-1;
		return sumarArreglo(arreglo,inicio,fin);
	}

	private  int sumarArreglo(int[] arreglo, int inicio, int fin) {
		
		//caso base
		if(inicio == fin) {
			return arreglo[fin];
		}else {
			int mitad = (inicio +fin)/2;
			
			int izquierda = sumarArreglo(arreglo,inicio,mitad);
			int derecha = sumarArreglo(arreglo,mitad + 1,fin);
			return izquierda + derecha;
		}
	}
	
}
