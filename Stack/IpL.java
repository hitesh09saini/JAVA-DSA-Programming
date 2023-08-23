import java.util.Stack;

public class IpL {
    public static void main(String[] args) {
        String s = ")(";
        System.out.println(finalIpL(s));
    }

    private static int finalIpL(String s) {
        Stack<Character> st = new Stack<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {

                st.push('(');
            } else {

                if (!st.isEmpty()) {
                    c += 2;
                    st.pop();
                }
            }
        }

        return c;
    }
}
