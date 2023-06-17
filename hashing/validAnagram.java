package hashing;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
         String s = "heart";
         String t = "earth";
       System.out.println(  Valid(s,t));
    }

    private static boolean Valid(String s, String t) {
        HashMap<Character,Integer>h = new HashMap<>();
        if(s.length() !=t.length())return false;
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(h.get(ch) !=null){
                if(h.get(ch) == 1){
                    h.remove(ch);
                }else{
                    h.put(ch, h.get(ch)-1);
                }
            }else{
                return false;
            }

        }

       return h.isEmpty();
    }
}
