import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String st = "";

        System.out.println(check(st));
    }
    

    private static boolean check(String st) {
        Stack<Character> s = new Stack<>();
       

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if(ch=='('||ch=='{'||ch=='[')s.push(ch);
            else
            
            if(!s.isEmpty()&&((s.peek() == '{' && ch=='}')||(s.peek() == '(' && ch==')')||(s.peek() == '[' && ch==']')))s.pop();
            else return false;
            
        }

        if(s.isEmpty())return true;

        return false;
    }
}
