public class ValidPallindrom {
    public static void main(String[] args) {
        String s =  "abca";
      System.out.println(  Valid(s));
    }

    private static boolean Valid(String st) {

        int s=0,e=st.length()-1;
        StringBuilder nst = new StringBuilder(st);    
          String re ="";
        while(s < e){
            if( nst.charAt(s) != nst.charAt(e)){
               nst.deleteCharAt(e);
               e--;
               
            }
        
            s++;
            e--;

            if(nst.length()>1&& s==e){
                System.out.println(nst);
                return true;
            }

        }

       
     
        return false;
    }
}
