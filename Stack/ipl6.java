import java.util.Stack;

public class ipl6 {
    public static void main(String[] args) {
        System.out.println(ipl("abcabababd"));
    }

    public static String ipl(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
        String a = "";

        while (!st.isEmpty()) {
            String b = "";
            if (st.size() % 2 != 0) {
                a = st.pop() + a;
            }
            int n = st.size();
            if (!st.isEmpty() && st.peek() == s.charAt((n - 1) / 2)) {
                int i = (n - 1) / 2;
                int j = st.size() / 2;
                while (i >= 0 && st.size() > j && st.peek() == s.charAt(i)) {
                    b = st.pop() + b;
                    i--;

                }
                if (i == -1) {
                    a = "*" + a;
                } else {
                    a = b + a;
                }
            } else {
                if (!st.isEmpty())
                    a = st.pop() + a;
            }
        }
        return a;
    }
}
