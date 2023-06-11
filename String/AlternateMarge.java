public class AlternateMarge {
    public static void main(String[] args) {
        String s1 = "Hello", s2 = "Bye";

        System.out.println(marge(s1,s2));
    }

    private static String marge(String S1, String S2) {
        int m = S1.length();
        int n = S2.length();
        
        StringBuilder result = new StringBuilder();

        for (int i = 0, j = 0; i < m || j < n; i++, j++) 
        {
            result.append(i < m ? S1.charAt(i) : "");
            result.append(j < n ? S2.charAt(j) : "");
        }

        return result.toString();
    }

}
