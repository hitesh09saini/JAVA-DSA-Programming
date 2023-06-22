import java.util.HashSet;

public class StringFormation {
    public static void main(String[] args) {
        String s = "aaaaaaa";
       System.out.println(name(s));
    }
   
    public static int name(String s) {
      int len = s.length();
       for(int i=len/2; i >= 1; i--)
       {
           if(len%i == 0)
           {
               int repeats = len/i;
               String sub = s.substring(0,i);
               StringBuilder st = new StringBuilder();
               while(repeats-- > 0){
                   st.append(sub);
                 if(st.toString().equals(s))return 1;
                  
               }
           }
       }
       return 0;
       
    }
}
