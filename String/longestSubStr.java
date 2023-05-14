import java.util.ArrayList;
import java.util.List;

public class longestSubStr {

    public static void main(String[] args) {
        String str = "abcabcaaa";

        System.out.println("\n"+checkSubString(str));
    }

    public static int checkSubString(String s) {

        List<Character> arr = new ArrayList<>();
        int mc = 0, c = 0, p = 1;

        for (int i = 0; i < s.length(); i++) {

            
            if (arr.contains(s.charAt(i))) {
                mc = c > mc ? c : mc;
                c = 0;
                i = p;
                p = p + 1;
                arr = new ArrayList<>();
            }
            c++;
            arr.add(s.charAt(i));
          
            
        }

        for(int j =0;j<arr.size();j++){
            System.out.print(arr.get(j));
           }
       
        return c > mc ? c : mc;

    }
}
