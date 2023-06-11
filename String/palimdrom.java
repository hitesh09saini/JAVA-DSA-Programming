public class palimdrom {
    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrom(s));
    }

    private static boolean isPalindrom(String s) {
        
        for(int i=0,e=s.length()-1;i<s.length()/2;i++,e--){
            if(s.charAt(i)!=s.charAt(e))return false;
        }
        return true;
    }
}
