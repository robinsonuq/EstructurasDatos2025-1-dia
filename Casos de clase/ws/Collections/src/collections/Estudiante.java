package collections;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estudiante other = (Estudiante) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
}
