public class string {
    public static void main(String[] args) {
       String s ="racecar";
       boolean b = false;
       int j = s.length()-1;

       for(int i = 0; i <s.length()/2;i++){
        if(s.charAt(i)==s.charAt(j-i)){
            b = true;
        }
       
       }System.out.println(b);
    }
}
