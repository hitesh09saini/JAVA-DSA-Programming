import java.util.Stack;

public class reverseWord {
    public static void main(String[] args) {
        String s ="i.like.this.program.very.much";

        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
       
        Stack<String> st = new Stack<>();
        String sn = "";
        for(int i=0;i<s.length();i++){
           
            
            if(s.charAt(i)=='.'){
                st.push(sn);
                sn ="";
            }else{
                sn +=s.charAt(i);
            }

            if(i==s.length()-1){
                 st.push(sn);
            }
        }

        sn ="";
        while(!st.isEmpty()){
         sn+=st.pop();
         if(!st.isEmpty()){
           sn +=".";
         }
        }
        
     
        return sn;
    }
}
