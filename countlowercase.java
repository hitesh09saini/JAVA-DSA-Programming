public class countlowercase {
    public static void main(String[] args) {
        String s = "abcdesfgt";
        int  count =0;
       
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a'&&c<='z'){
               count++;
            }
        }System.out.println(count);

    }
}
