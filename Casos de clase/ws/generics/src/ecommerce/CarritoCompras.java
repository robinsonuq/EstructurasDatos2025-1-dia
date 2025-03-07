package ecommerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CarritoCompras <T extends Comparable<T> & Calculable> implements Iterable<T>  {
	
	private String codigo;
	private ArrayList<T> listaProductos = new ArrayList<>();
	
	public CarritoCompras(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public ArrayList<T> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(ArrayList<T> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	
	public void agregar(T t) {
		listaProductos.add(t);
	}
	
	public T obtenerMayor() {
		return Collections.max(listaProductos);
	}
	
	public double calcularTotal() {
		double total = 0;
		
		for (T t : listaProductos) {
			total += t.getPrecio();
		}
		
		return total;
	}

	@Override
	public Iterator<T> iterator() {
		
		return new CarritoIterator(listaProductos);
	}
}
