package Dp;

import java.util.HashMap;
import java.util.HashSet;

public class StringConvertion {
    
    // insertion and delete

    public static void main(String[] args) {
        String s = "abcdef";
        String s1 = "aceg";
        System.out.println(stringConv(s,s1));
    }

    private static int stringConv(String s, String s1) {
       
         HashMap<Character,Integer> m = new HashMap<>();
         HashMap<Character,Integer> m1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                int v = m.get(s.charAt(i));
                  v++;
                m.replace(s.charAt(i),v);
            }else{
                m.put(s.charAt(i), 1);
            }
        }


        for(int i=0;i<s1.length();i++){
             if(m1.containsKey(s1.charAt(i))){
                int v = m1.get(s1.charAt(i));
                  v++;
                m1.replace(s1.charAt(i),v);
              }else{
                m1.put(s1.charAt(i), 1);
              }
        }
        int count =0;

        for(int i=0;i<s1.length();i++){
            if(m1.get(s1.charAt(i)) == m.get(s1.charAt(i))){
               count = count+m1.get(s1.charAt(i));
            }
        }
        

        
        return s.length()- count+s1.length()-count;
    }


}
