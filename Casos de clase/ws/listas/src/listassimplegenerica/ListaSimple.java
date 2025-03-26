package listassimplegenerica;

public class ListaSimple<T> {

	private int size;
	private Nodo<T> nodoPrimero;

	public ListaSimple() {
		super();
		this.size = 0;
		this.nodoPrimero = null;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Nodo<T> getNodoPrimero() {
		return nodoPrimero;
	}
	public void setNodoPrimero(Nodo<T> nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}

	public void addFirst(T t) {
		Nodo<T> nuevoNodo =  new Nodo<T>(t);
		if(isEmpty()) {
			nodoPrimero = nuevoNodo;
		}else {
			nuevoNodo.setNodoSiguiente(nodoPrimero);
			nodoPrimero = nuevoNodo;
		}
		size ++;
	}
	private boolean isEmpty() {
		return size == 0;
	}

	public void addEnd(T dato) {
		Nodo<T> nuevoNodo = new Nodo<T>(dato);
		if (isEmpty()) {
			nodoPrimero = nuevoNodo;
		}else {
			Nodo<T> aux = nodoPrimero;
			while (aux.getNodoSiguiente() != null) {
				aux = aux.getNodoSiguiente();

			}
			aux.setNodoSiguiente(nuevoNodo);	
		}
		size ++;
	}
	public void imprimirLista() {

		if(isEmpty()) {
			System.out.println("la lista esta vacia");

		}else {
			Nodo<T> aux = nodoPrimero; //i=0	
			while (aux != null) {//i < n
				System.out.println(aux.getDato());
				aux = aux.getNodoSiguiente();//i++
			}
		}
	}
	
	public void imprimirLista2() {

		if(isEmpty()) {
			System.out.println("la lista esta vacia");

		}else {
			for(Nodo<T> aux = nodoPrimero; aux != null; aux = aux.getNodoSiguiente()) {
				System.out.println(aux.getDato());
			}
		}
	}
	
	public void imprimirLista3() {
		imprimirLista3(nodoPrimero);
	}
	
	private void imprimirLista3(Nodo<T> aux) {
		if(aux != null) {
			System.out.println(aux.getDato());
			imprimirLista3(aux.getNodoSiguiente());// i++
		}
	}
	
	
}