package hashing;

import java.util.Iterator;

import hashing.implement.HashMap;

public class Ticket {
    public static void main(String[] args) {
        /*
         * "chennai " ="bengaluru"
         * "Mumbai" = "Dehli"
         * "Goa" = "Chennai"
         * "Dehli" = "Goa"
         * 
         * "Mumbai" ->"Delhi"-> "Goa" -> "Chennai" ->"bengaluru"
         */

          HashMap<String,String> m = new HashMap<>();
         
// from to 
          m.put("Chennai", "Bengaluru");
          m.put("Mumbai", "Delhi");
          m.put("Goa", "Chennai");
          m.put("Delhi", "Goa");

        String st = getStart(m);
        System.out.print(st);

        for(String k : m.keySet()){
            System.out.print(" -> "+m.get(st));
            st = m.get(st);
        }
       
    }

    public static String getStart(HashMap<String,String> m) {
        HashMap<String,String> tm = new HashMap<>();
       
        for(String k : m.keySet()){
            tm.put(m.get(k), k);
        }

        for(String k : m.keySet()){
            if(!tm.containeKey(k)){
                return k;
            }
        }
        return null;
    }
}
