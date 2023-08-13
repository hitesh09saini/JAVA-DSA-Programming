import java.util.Stack;

public class valid {
    public static void main(String[] args) {
        String s = "())({}";
           System.out.println(valid(s));
    }

   public static boolean valid(String s) 
    { 
        // code here
        Stack<Character> st = new Stack<>();
        int i =0;
        
        while(i<s.length()){
            
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                st.push(s.charAt(i));
                
            }else {
            
            if(!st.isEmpty()&&(s.charAt(i) == ')' && st.peek()=='(' ||s.charAt(i)=='}' && st.peek()=='{'||s.charAt(i)==']'&& st.peek()=='[' )){
                st.pop();
             }else{
                 return false;
             }
             
            }
            i++;
        }
        
        
        return st.isEmpty();
    }
}
