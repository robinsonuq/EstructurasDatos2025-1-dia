package collections;

import java.util.Objects;

public class Empleado {

	private String nombre;
	private String identificacion;
	public Empleado(String nombre, String identificacion) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(identificacion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(identificacion, other.identificacion) && Objects.equals(nombre, other.nombre);
	}
	
	
}
