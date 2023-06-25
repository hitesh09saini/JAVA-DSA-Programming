public class mincharAddForPalindrom {
    
    public static void main(String[] args) {
        String st = "tcitkg";
        int s =0,e = st.length()-1 ,k=e;
        int count =0;

        while(s<e){

            if(st.charAt(s)!=st.charAt(e))
            {
               s=0;
               count++;
              --e;
            }
            else
            {
               
                s++; 
                e--;
            }
        }
        System.out.println(count);
    }
}
