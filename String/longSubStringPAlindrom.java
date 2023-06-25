public class longSubStringPAlindrom {
    public static void main(String[] args) {
        String str = "babcbabcbaccba";

        System.out.println(longestPalindrom(str));
    }

    public static String longestPalindrom(String s) {
        int n = s.length();
        if (n <= 1)
            return s;

        int st = 0;
        int mx = 1;

        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                int l = i;
                int r = i;
                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                int len = r - 1 - l;

                if (len > mx) {
                    mx = len;
                    st = 1 + l;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                int l = i;
                int r = i + 1;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                }
                int len = r - l - 1;
                if (len > mx) {
                    mx = len;
                    st = l + 1;
                }

            }
        }
        return s.substring(st, st + mx);
    }
}
