package hashing;

import java.util.LinkedHashSet;

public class linkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String>s = new LinkedHashSet<>();
        s.add("a");
        s.add("e");
        s.add("b");

        for(String st :s){
            System.out.println(st);
        }
    }
}
