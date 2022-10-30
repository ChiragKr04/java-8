package all_collections.maps;

import java.util.*;

public class MyMaps {

    // Hash Map
    // Stores key value pair. Can store one "null" key
    // Do not maintain insertion order
    private Map<Integer, String> hashMap = new HashMap();

    // Linked Hash Map
    // Stores key value pair. Can store one "null" key
    // Does maintain insertion order
    private Map<Integer, String> linkedHashMap = new LinkedHashMap();

    // Hash Map
    // Stores key value pair. Cannot store null key
    // Stores in sorted manner
    private Map<Integer, String> treeMap = new TreeMap();

    public void hashMapOp() {

        hashMap.put(10,"ten");
        hashMap.put(30,"thirty");
        hashMap.put(20,"twenty");
        hashMap.put(null,"null");

        System.out.println(hashMap);

    }

    public void linkedHashMapOp() {
        linkedHashMap.put(10,"ten");
        linkedHashMap.put(30,"thirty");
        linkedHashMap.put(20,"twenty");
        linkedHashMap.put(null,"null");

        System.out.println(linkedHashMap);
    }

    public void treeMapOp() {
        treeMap.put(10,"Rock");
        treeMap.put(30,"Paper");
        treeMap.put(20,"Scissor");
        // Cannot add null key to tree map will cause error
//        treeMap.put(null,"null");

        System.out.println(treeMap);
    }

}
