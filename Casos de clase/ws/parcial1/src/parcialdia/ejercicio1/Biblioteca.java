package parcialdia.ejercicio1;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Biblioteca <T extends Libro>{
    private LinkedList<T> listaLibros = new LinkedList<>();

    public void agregarLibro (T nuevoLibro){
        listaLibros.add(nuevoLibro);
    }

    public LinkedList<T> buscarLibrosAnio(int anio) {
        LinkedList<T> lisbrosFiltrados = new LinkedList<>();
        Iterator<T> it = listaLibros.iterator();
        while (it.hasNext()) {
            T l = it.next();
            if (l.getAnio().equals(anio)) {
                lisbrosFiltrados.add(l);
            }
        }
        return lisbrosFiltrados; 
    }
    
    public class ComparatorPorAnio implements Comparator<Libro> {
        @Override
        public int compare(Libro l1, Libro l2) {
//            return l1.getAnio().compareTo(l2.getAnio());
            return Integer.compare(l1.getAnio(), l2.getAnio());
        }
    }

}
