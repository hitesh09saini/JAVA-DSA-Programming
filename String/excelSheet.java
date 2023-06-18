import java.util.Arrays;

public class excelSheet {
    public static void main(String[] args) {
        int n = 51;
        excelCode(n);
    }

    private static void excelCode(int n) {
       StringBuilder s = new StringBuilder();

       while(n>0){
        int r = (n-1)%26;
        s.append((char)('A'+r));
        n = (n-1)/26;
       }
       s.reverse();
       
       System.out.println(s);
       
    }
}
