package collections;

import java.util.Comparator;

public class ComparatorCedula implements Comparator<Estudiante>{

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		
		return o1.getCedula() - o2.getCedula();
	}
	
	
}
