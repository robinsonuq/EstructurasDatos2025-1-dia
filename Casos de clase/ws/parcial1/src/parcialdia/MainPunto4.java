package parcialdia;

import java.util.*;

public class MainPunto4 {
    public static void main(String[] args) {
        // Pregunta A
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("A");

        for (String s : set) {
            System.out.print(s + " ");
        }

        //d) El orden de salida no está garantizado


        // Pregunta B
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "A");
        treeMap.put(2, "B");
        treeMap.put(3, "C");

        for (Integer key : treeMap.keySet()) {
            if (key == 2) {
                treeMap.put(4, "D");
            }
        }

        System.out.println(treeMap);
        //c) ConcurrentModificationException


        // Pregunta C
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Iterator<Integer> it1 = list.iterator();
        Iterator<Integer> it2 = list.iterator();

        it1.next();
        it1.remove();
        it2.next();

        System.out.println(list);
        //c) ConcurrentModificationException


        // Pregunta D
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.print(pq.poll() + " "); // 10
        System.out.print(pq.poll() + " "); // 20
        System.out.print(pq.peek()); // 30


        // Pregunta E
        Map<String, Integer> map = new TreeMap<>();
        map.put("Z", 3);
        map.put("A", 1);
        map.put("B", 2);

        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        // Respuesta: "A B Z"
    }

}
