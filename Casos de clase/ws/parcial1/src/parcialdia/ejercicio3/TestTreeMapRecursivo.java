package parcialdia.ejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMapRecursivo {

    public class BuscarEnTreeMap {

        public static <K extends Comparable<K>, V> V buscarRecursiva(TreeMap<K, V> map, K clave) {
            if (map.isEmpty()) {
                return null;
            }

            K primeraClave = map.firstKey();

            if (primeraClave.equals(clave)) {
                return map.get(primeraClave);
            }

            TreeMap<K, V> subMapa = new TreeMap<>(map.tailMap(map.higherKey(primeraClave), true));

            return buscarRecursiva(subMapa, clave);
        }
    }


//    public <T> T buscarElemento(Map<T, T> map, T elemento, int index) {
//        List<T> lista = new ArrayList<>(map.keySet());
//
//        if (index >= lista.size()) {
//            return null;
//        }
//
//        T s = lista.get(index);
//
//        if (s.equals(elemento)) {
//            return map.get(s);
//        }
//
//        return buscarElemento(map, elemento, index + 1);
//    }


//    public <T> buscarElemento(TreeMap<T,T> mapa, T clave){
//        if(mapa.isEmpty()){
//            return null;
//        }
//
//        T llavesita = mapa.get();
//        if(!llavesita= mapa.get(clave)){
//            return buscarElemento(mapa.remove(llavesita), clave)
//        }
//
//        return mapa.get(llavesita);
//    }

//    public <K,V> V buscarElemento(K key, TreeMap<K,V> treemap, int i){
//        if (i == treemap.entrySet().size())
//            return null;
//
//        else if (treemap.entrySet().get(i).equals(key))
//            return treemap.entrySet().get(i).getValue();
//
//        return buscarElemento(key, treemap, i+1);
//    }


//    public V <T,V> buscarElemento(TreeMap<T, V> lista, T clave){
//        ListSet<T> llaves = lista.keySet();
//        int pos = buscarElemento(llaves, 0, clave);
//        return lista.getValue(pos);
//    }
//
//    public int buscarElemento(ListSet<T> llaves, int i, T clave){
//        if (i == llaves.size())
//            return -1;
//        else if (llaves.get(i) == clave)
//            return i;
//        else
//            return buscarElemento(llaves, i+1, clave);
//    }

//    public static <K extends Comparable<K>, V> V buscarElemento(
//            TreeMap<K, V> map, K clave, K actual) {
//
//        if (actual == null || map.containsKey(actual)) {
//            return null;
//        }
//
//        if (actual.equals(clave)) {
//            return map.get(actual);
//        }
//
//        K siguiente = clave.compareTo(actual) < 0 ? map.lowerKey(actual) : map.higherKey(actual);
//
//        return buscarElemento(map, clave,siguiente);
//    }

}

