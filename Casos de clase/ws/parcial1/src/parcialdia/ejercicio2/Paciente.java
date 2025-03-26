package parcialdia.ejercicio2;
public class Paciente {
    private String nombre;

    public Paciente(String nombre, int gravedad) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
