package ecommerce;

public class Servicio implements Comparable<Servicio> {

	private String nombre;
	private double precio;
	
	
	
	public Servicio(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public int compareTo(Servicio o) {
		// TODO Auto-generated method stub
		return Double.compare(precio, o.getPrecio());
	}
	
	
}
