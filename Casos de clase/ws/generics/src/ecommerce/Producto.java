package ecommerce;

public class Producto implements Comparable<Producto>, Calculable{

	private String nombre;
	private String codigo;
	private double precio;
	
	
	public Producto(String nombre, String codigo, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public int compareTo(Producto o) {
		return Double.compare(precio, o.getPrecio());
	}
	
	
}
