
public class StringFormation {
    public static void main(String[] args) {
        String s = "ababab";
       System.out.println(name(s));
    }
   
    public static String name(String s) {
       String pr = s,su =s;
       String ans="";
       
       for(int i=s.length();i>=0 ;i--){ 
         
          pr = pr.substring(0,i);
          su = su.substring(, s.length());
         System.out.println(pr+" "+su );
         
         
       }
       return ans;
       
    }
}
