package parcialdia.ejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BuscarMapaRecursivo {

    public static <K, V> V buscarEnTreeMap(TreeMap<K, V> map, K clave) {
        return buscarRecursivo(map, clave, new ArrayList<>(map.keySet()), 0);
    }

    private static <K, V> V buscarRecursivo(TreeMap<K, V> map, K clave, List<K> claves, int index) {
        if (index >= claves.size()) return null;
        if (claves.get(index).equals(clave)) return map.get(clave);
        return buscarRecursivo(map, clave, claves, index + 1);
    }

}
