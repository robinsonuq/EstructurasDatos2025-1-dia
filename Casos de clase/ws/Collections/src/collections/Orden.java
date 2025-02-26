package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Orden {

	public static void main(String[] args) {
		
		ArrayList<Estudiante> lista = new ArrayList<>();
		lista.add(new Estudiante("Robinson",20,2));
		lista.add(new Estudiante("Juan",18,4));
		lista.add(new Estudiante("Maria",12,1));
		
		ComparatorCedula conComparatorCedula = new ComparatorCedula();
		
		Comparator<Estudiante> comparatorEdad = new Comparator<Estudiante>() {

			@Override
			public int compare(Estudiante o1, Estudiante o2) {
				
				return o1.getEdad() - o2.getEdad();
			}
		};
				
		Collections.sort(lista,(Estudiante e1,Estudiante e2)-> e1.getEdad() -e2.getEdad());
		Collections.sort(lista,(Estudiante e1,Estudiante e2)-> e1.getCedula() -e2.getCedula());
		
		System.out.println(lista.toString());
	}
}
