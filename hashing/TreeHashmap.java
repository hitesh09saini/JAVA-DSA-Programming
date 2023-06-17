package hashing;

import java.util.TreeMap;

public class TreeHashmap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
          tm.put("India", 1352655550);
          tm.put("China", 1452655550);
          tm.put("UK", 13526);
          tm.put("USA", 135265);

          System.out.println(tm);
    }
}
