package hashing;

import java.util.LinkedHashMap;

public class linkedHash {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> lh = new LinkedHashMap<>();
        lh.put("A", 2);
        lh.put("B", 4);
        lh.put("E", 8);

       System.out.println(lh);
    }
}
