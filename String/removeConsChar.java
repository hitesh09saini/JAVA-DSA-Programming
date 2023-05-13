import java.util.Arrays;

public class removeConsChar {
    public static void main(String[] args) {
        String st = "acabb";
        char []ch =  st.toCharArray();
        char  max = ' ';
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<st.length();i++){

            if(max != ch[i]){
               max = ch[i];
              sb.append(max);
            }
           

        }
         sb.toString();        // StringBuilder convert into String 
        System.out.println(sb);
    }
}
