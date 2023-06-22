import java.util.Stack;

public class minimumremoveMakeVAlid {
    public static void main(String[] args) {
        String s = "l)ee(t(c)ode";

        mankr(s);
    }

    private static void mankr(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder(s);
        int c = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
                c++;
            }
            if (s.charAt(i) == ')') {
                c--;

               if(!st.isEmpty()){
                    st.pop();
                }else{
                    sb.deleteCharAt(i);
                }
            }
        }
        
        

        System.out.println(c);
        if (c < 0) {
            for (int j = 0; j < sb.length(); j++) {
                if (c != 0) {
                    if (sb.charAt(j) == ')') {
                        sb.deleteCharAt(j);
                        c++;
                        System.out.println("huhi"+j);
                    }
                    
                }
            }
        } else if (c > 0) {
            for (int j = sb.length()-1; j >=0 ; j--) {
                if (c != 0) {
                    if (sb.charAt(j) == '(') {
                        sb.deleteCharAt(j);
                        c--;
                    }

                 
                }
            }
        }

        System.out.println(sb);

    }
}
