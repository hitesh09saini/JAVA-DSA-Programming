import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        String s = "HappyNewYear";
        remove(s);
    }

    private static void remove(String str) {

        boolean m[] = new boolean[26];
        boolean m1[]= new boolean[26];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                if (!m[str.charAt(i) - 'a']) {
                    m[str.charAt(i) - 'a'] = true;
                    sb.append(str.charAt(i));
                }
            } else {
                if (!m1[str.charAt(i) - 'A']) {
                    m1[str.charAt(i) - 'A'] = true;
                    sb.append(str.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
    }

}
