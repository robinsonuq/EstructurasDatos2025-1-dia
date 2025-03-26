package parcialdia.ejercicio1;
import java.util.Comparator;

public class ComparatorPorAnio implements Comparator<Libro> {
    @Override
    public int compare(Libro l1, Libro l2) {
//        return l1.getAnio().compareTo(l2.getAnio());
        return Integer.compare(l1.getAnio(), l2.getAnio());
    }
}
