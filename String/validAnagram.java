
import java.util.Arrays;

public class validAnagram {

    public static void main(String[] args) {
        String str = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(str, t));
    }

    public static boolean isAnagram(String str, String t) {
       
        char []s1 = str.toCharArray();
        char []s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1, s2)){
            
            return true;
        
        }

      
        return false;
    }
}
