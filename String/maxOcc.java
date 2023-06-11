import java.util.Arrays;

public class maxOcc {
    public static void main(String[] args) {
        String str = "";
         
        System.out.println(maxOcc(str));
    }
   
    public static char maxOcc(String str) {
      
      int map[] = new int[26];
      Arrays.fill(map,0) ;

      for(int i=0;i<str.length();i++){
        map[str.charAt(i)-'a']++;
      }
      
      int max = 0;
      char c= 'a';
      int k=-1;
      for(int i=0;i<26;i++){    
         if(max<map[i]){
             max =map[i];
             k=i;
         }
      }
     
      for(int i=0;i<k;i++){
         c++;
      }
      
     
      if(k==-1)return ' ';
    
      
      return c;
    }
}
