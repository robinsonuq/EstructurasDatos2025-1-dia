package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Orden {

	public static void main(String[] args) {
		
		Set<Estudiante> lista = new HashSet<>();
		lista.add(new Estudiante("Robinson",20,2));
		lista.add(new Estudiante("Robinson",20,2));
		lista.add(new Estudiante("Juan",18,4));
		lista.add(new Estudiante("Maria",12,1));
		
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ComparatorCedula conComparatorCedula = new ComparatorCedula();
//		
//		Comparator<Estudiante> comparatorEdad = new Comparator<Estudiante>() {
//
//			@Override
//			public int compare(Estudiante o1, Estudiante o2) {
//				
//				return o1.getEdad() - o2.getEdad();
//			}
//		};
//		
//		Comparator.comparingInt((Estudiante e1)->e1.getEdad()).thenComparing( e2 ->e2.getCedula());
//		
//		Collections.sort(lista,	Comparator.comparingInt((Estudiante e1)->e1.getEdad()).thenComparing( e2 ->e2.getCedula()));
//		Collections.sort(lista,(Estudiante e1,Estudiante e2)-> e1.getCedula() -e2.getCedula());
//		
//		System.out.println(lista.toString());
	}
}
