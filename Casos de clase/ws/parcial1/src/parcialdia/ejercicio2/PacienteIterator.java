package parcialdia.ejercicio2;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PacienteIterator <T extends Paciente> implements Iterator<Paciente> {
    private ListIterator<T> newIterator;
    int indice = 0;

    public PacienteIterator(List<T> pacientes) {
    	indice = pacientes.size()-1;
        this.newIterator = pacientes.listIterator(pacientes.size());
    }

    @Override
    public boolean hasNext() {
        return indice >= 0;
    }

    @Override
    public Paciente next() {
    	indice--;
        return newIterator.previous();
    }
}
