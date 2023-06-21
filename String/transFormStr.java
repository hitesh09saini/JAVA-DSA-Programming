import java.util.Arrays;

public class transFormStr {
    public static void main(String[] args) {
        String s1 = "hitesh";
        String s2 = "hiesht";

       System.out.println(nuOfSteps(s1, s2));

    
    }

    private static int nuOfSteps(String s1, String s2) {
        int m[]= new int[256];
       
        if(s1.length() !=s2.length())return -1;
        for(int i=0;i<s1.length();i++){
            m[s1.charAt(i)]++;
            m[s2.charAt(i)]--;
        }
          
        for(int i=0;i<256;i++)if(m[i]!=0)return-1;

         int ans=0,i=s1.length()-1,j=s2.length()-1;
        // change
       while(i>=0){
         if(s1.charAt(i) != s2.charAt(j)){
            ans++;
         }else{
           
            j--;
         }
         i--;
       }

        return ans;

    }

    
}
