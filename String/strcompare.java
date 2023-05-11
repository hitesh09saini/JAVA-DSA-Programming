public class strcompare {
    public static void main(String[] args) {
        String s = "tony";
       
        String s1 = new String("Tony");
        if(s.compareToIgnoreCase(s1)==0){
           System.out.println("yes");
        }
    }
}
