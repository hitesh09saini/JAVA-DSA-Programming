package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class itrationOnHashset {
    public static void main(String[] args) {
          HashSet<String> s = new HashSet<>();
        s.add("a");
        s.add("d");
        s.add("b");
        
        for(String st :s){
            System.out.println(st);
        }
        
        
    //    Iterator i = s.iterator();

    //    while(i.hasNext()){
    //     System.out.println(i.next());
    //    }
    }
}
