public class longPalindSub {
    
    public static void main(String[] args) {
        String str ="babba";
        Check(str);
    }

    public static void Check(String st) {
       
        int max =0;
       

        for(int i =0;i<st.length();i++){
            int s= i,e= st.length();
            StringBuilder sm =new StringBuilder();
            StringBuilder em = new StringBuilder();
          while(s<e){
        
            char sc = st.charAt(s);
            
            char en = st.charAt(e-1);
            
          if((sc-en)==0){

            s++;e--;
           sm.append(sc);
           em.append(en);

          }else{
            e--;
          }
        
          }
          
          
          i++;
        }
        
        System.out.println();
        
    }
}
