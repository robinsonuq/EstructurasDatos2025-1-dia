package recursividad;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Suma {

	public static void main(String[] args) {


		ArrayList<String> lista = new ArrayList<>(10);
		lista.add("Robis");
		lista.add("Ruan");
		lista.add("Luis");
		System.out.println(lista.toString());
		
		ListIterator<String> listIterator = lista.listIterator();
		
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		
		
		
		
		
		
		
		
//		
//		
//		while(listIterator.hasNext()) {
//			String nombre = listIterator.next();
//			if(nombre.startsWith("R")) {
//				listIterator.remove();
//			}
//		}
//		System.out.println(lista.toString());

	}



}
