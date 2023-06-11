
import java.util.HashMap;

public class freq {
    public static void main(String[] args) {
        String s ="testsample";
        find(s);
    }
    
    public static void find(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
       
        for(int i=0;i<s.length();i++){
             
            if(m.containsKey(s.charAt(i))){
                int v = m.get(s.charAt(i));
                 v++;
                m.put(s.charAt(i), v );
            }else{
                m.put(s.charAt(i), 1);
            }
        }
        int max = 0;
         char mc = ' ';
        for(int i=0;i<m.size();i++){
             if(m.get(s.charAt(i))>max){
                 max = m.get(s.charAt(i));
                 mc = s.charAt(i);
             }
        }
         
        System.out.println(mc);
    }
}
