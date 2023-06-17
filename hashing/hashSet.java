package hashing;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("a");
        s.add("a");
        s.add("b");
        System.out.println(s);
    }
}
