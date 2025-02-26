package collections;

public class Estudiante implements Comparable<Estudiante>{

	private String nombre;
	private int edad;
	private int cedula;
	
	
	
	public Estudiante(String nombre, int edad, int cedula) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	@Override
	public int compareTo(Estudiante o) {
	
		return nombre.compareTo(o.getNombre());
	}
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + "]";
	}
	
	
}
