package hashing;

import java.util.HashMap;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();

        h.put("India", 1352655550);
        h.put("China", 1452655550);
        h.put("UK", 13526);
        h.put("USA", 135265);

        System.out.println(h.get("India"));

       Set<String> keys = h.keySet();
       System.out.println(keys);

       for (String  x : keys) {
          System.out.println(h.get(x));
       }
    }

}
