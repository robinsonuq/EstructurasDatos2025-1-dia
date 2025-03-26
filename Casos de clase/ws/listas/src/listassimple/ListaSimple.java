package listassimple;

public class ListaSimple {

	private int size;
	private Nodo nodoPrimero;
	private Nodo nodoUltimo;

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
	public Nodo getNodoPrimero() {
		return nodoPrimero;
	}
	public void setNodoPrimero(Nodo nodoPrimero) {
		this.nodoPrimero = nodoPrimero;
	}

	public void removeEnd() {
		
	}
	
	
	
	
	public void addFirst(int dato) {
		Nodo nuevoNodo =  new Nodo(dato);
		if(isEmpty()) {
			nodoPrimero = nuevoNodo;
			nodoUltimo = nuevoNodo;
		}else {
			nuevoNodo.setNodoSiguiente(nodoPrimero);
			nodoPrimero = nuevoNodo;
		}
		size ++;
	}
	private boolean isEmpty() {
		return size == 0;
	}

	public void addEnd(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		if (isEmpty()) {
			nodoPrimero = nuevoNodo;
			nodoUltimo = nuevoNodo;
		}else {
			nodoUltimo.setNodoSiguiente(nuevoNodo);	
		}
		nodoUltimo = nuevoNodo;
		size ++;
	}
	
	public void imprimirLista() {

		if(isEmpty()) {
			System.out.println("la lista esta vacia");

		}else {
			Nodo aux = nodoPrimero; //i=0	
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
			for(Nodo aux = nodoPrimero; aux != null; aux = aux.getNodoSiguiente()) {
				System.out.println(aux.getDato());
			}
		}
	}
	
	public void imprimirLista3() {
		imprimirLista3(nodoPrimero);
	}
	
	private void imprimirLista3(Nodo aux) {
		if(aux != null) {
			System.out.println(aux.getDato());
			imprimirLista3(aux.getNodoSiguiente());// i++
		}
	}
	
	
}