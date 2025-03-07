package ecommerce;

import java.util.ArrayList;
import java.util.Iterator;

public class CarritoIterator<T> implements Iterator<T> {

	int indice = 0;
	private ArrayList<T> lista;
	
	public CarritoIterator(ArrayList<T> lista) {
		this.lista = lista;
	}
	
	@Override
	public boolean hasNext() {
		if(indice < lista.size()) {
			return true;
		}
		return false;
	}

	@Override
	public T next() {

		if(indice < lista.size()) {
			throw new ArrayIndexOutOfBoundsException("Erro no sea asi");
		}
		
		
		T aux = lista.get(indice);
		indice += 2;
		return aux;
	}

	
}
