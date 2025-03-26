package parcialdia.ejercicio3;
public class ArbolBinarioBusqueda {

    // Método para buscar un elemento en el árbol
    public <K,V> V buscarElemento(Nodo<K, V> nodo, K clave) {
        if (nodo == null) {
            return null;
        }

        if (nodo.clave.equals(clave)) {
            return nodo.valor;
        }

        V resultadoIzquierdo = buscarElemento(nodo.izquierdo, clave);
        if (resultadoIzquierdo != null) {
            return resultadoIzquierdo;
        }

        return buscarElemento(nodo.derecho, clave);
    }
}
