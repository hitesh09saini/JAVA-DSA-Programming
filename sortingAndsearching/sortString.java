import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        String s = "edcab";
       System.out.println(s);
        
       System.out.println(sort(s ));
    }
  

    private static String sort(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}
