import java.util.Arrays;

public class solution {
   public static void main(String[] args) {

      String str1 = "cars";
      String str = "racs";

      char a[] = str1.toCharArray();
      char b[] = str.toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);
      if (Arrays.equals(a, b)) {
         System.out.println("==");
      } else {
         System.out.println("not");
      }
   }
}
