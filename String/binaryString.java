public class binaryString {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(countSubstr(s));
    }

    private static int countSubstr(String str) {
        int c = 0;
        int n=str.length();

        for(int i=0;i<n;i++){
         if(str.charAt(i)=='1')c++;
        }
        return c*(c-1)/2;

    }
}
