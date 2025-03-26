package listassimple;

public class Nodo {

	private int dato;
	private Nodo nodoSiguiente;
	
	public Nodo(int dato) {
		super();
		this.dato = dato;
		this.nodoSiguiente = null;
	}
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getNodoSiguiente() {
		return nodoSiguiente;
	}
	public void setNodoSiguiente(Nodo nodoSiguiente) {
		this.nodoSiguiente = nodoSiguiente;
	}
	
	
	
}
