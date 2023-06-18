import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortString {

  public static void main(String[] args) {
    String s = "defRTSersUXI";

     System.out.println(sort(s));
  }

  private static String sort(String str) {
          ArrayList<Character> cap = new ArrayList<>();

 ArrayList<Character> low = new ArrayList<>();

 for(int i = 0;i < str.length();i++)

 {

 int index = str.codePointAt(i);

 if((index >= 65 && index <= 90))

 low.add(str.charAt(i));

 else if((index >= 97 && index <= 122))

 cap.add(str.charAt(i));

 }

 Collections.sort(cap);

 Collections.sort(low);

 // System.out.println(cap);

 // System.out.println(low);

 int a = 0;

 int b = 0;

 StringBuilder sb = new StringBuilder();

 for(int i = 0;i < str.length();i++)

 {

 int index = str.codePointAt(i);

 if(index >= 65 && index <= 90)

 sb.append(low.get(a++));

 else

 sb.append(cap.get(b++));

 }

 

 return sb.toString();
  }
}
