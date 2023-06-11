import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 ="basgadhbfgvhads";
        String s2 ="sjdhgvbjdsbhvbvd";

        System.out.println(remAnagrams(s1,s2));
    }

    public static int remAnagrams(String s1, String s2) {
           int m[]= new int[26];
        

        Arrays.fill(m,0);
      
        for(int i=0;i<s1.length();i++){
           m[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            m[s2.charAt(i)-'a']--;
            
        }

       int max =0;
       for(int i=0;i<26;i++){
         max +=  Math.abs(m[i]);
       }
       
       return max;
    }
}
