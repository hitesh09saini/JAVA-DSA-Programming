import java.util.Stack;

public class duplicateParant {
    public static void main(String[] args) {
        String s = "((a+b))";

       System.out.println( check(s));
    }

    private static boolean check(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
           
            char ch = s.charAt(i);
            if(ch==')'){
                int c =0;
                while(st.peek()!='('){
                    c++;
                    st.pop();
                   
                }
                if(c<1)return true;
                 
            }else st.push(ch);
            
        }

        return false;
    }
}
 