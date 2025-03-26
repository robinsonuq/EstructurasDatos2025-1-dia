package parcialdia.ejercicio3;
// Método para buscar un elemento en un árbol binario de búsqueda
public class Nodo<K, V> {
    K clave;
    V valor;
    Nodo<K, V> izquierdo;
    Nodo<K, V> derecho;

    public Nodo(K clave, V valor) {
        this.clave = clave;
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
