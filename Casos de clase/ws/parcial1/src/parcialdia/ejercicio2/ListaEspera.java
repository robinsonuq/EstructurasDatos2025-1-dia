package parcialdia.ejercicio2;
import java.util.Iterator;
import java.util.LinkedList;

public class ListaEspera<T extends Paciente> implements Iterable<Paciente>{
    private LinkedList<Paciente> listaEspera;

    public void agregarPaciente(T nuevoPaciente){
        listaEspera.add(nuevoPaciente);
    }

    @Override
    public Iterator<Paciente> iterator() {
        return new PacienteIterator(listaEspera);
    }
}
