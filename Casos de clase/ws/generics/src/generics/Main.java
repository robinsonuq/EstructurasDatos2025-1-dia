package generics;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
	
	HashMap<String,Integer> lista = new HashMap<>();
	lista.put("hoy",4);
	lista.put(null,null);
	lista.put(null,6);
	lista.put("hol",null);
	System.out.println(lista);
	
	
	Hashtable<Integer, Integer> lista2 = new Hashtable<>();
	lista2.put(3, 5);
	
	
	}
}
