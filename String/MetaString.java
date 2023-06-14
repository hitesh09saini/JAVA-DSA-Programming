import java.util.Arrays;

public class MetaString {
    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "badc";
        System.out.println(meta(s, s1));
    }

    public static boolean meta(String S1, String S2)

    {

        // code here

        int c = 0;

        int swap = 0;

        if (S1.length() != S2.length())return false;

        for (int i = 0; i < S1.length(); i++) {

            if (S1.contains("" + S2.charAt(i)))c++;

        }

        if (c == S1.length()) {

            for (int i = 0; i < S1.length(); i++) {

                if (S1.charAt(i) != S2.charAt(i))swap++;

            }
        }

        if (swap == 2)return true;

        return false;

    }

}
