public class reverseString {
    public static void main(String[] args) {
        String s = "Hitesh";

        System.out.println(reve(s));
    }

    private static String reve(String s) {
        String ns="";
        for(int i=s.length()-1;i>=0;i--){
               ns+=s.charAt(i);
        }

        return ns;
    }
}
