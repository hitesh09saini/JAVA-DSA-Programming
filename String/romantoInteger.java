import java.util.HashMap;

public class romantoInteger {
    public static void main(String[] args) {
        String s = "IV";
        System.out.println(convert(s));
    }

    private static int convert(String str) {
        HashMap<Character, Integer> hs = new HashMap<>();
        int n = str.length();

        int ans = 0;

        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);

        for (int i = 0; i < n; i++) {

            if (i < n - 1 && hs.get(str.charAt(i)) < hs.get(str.charAt(i + 1))) {
                ans += hs.get(str.charAt(i + 1)) - hs.get(str.charAt(i));
                i++;

            }

            else
                ans += hs.get(str.charAt(i));

        }

        return ans;

    }
}
