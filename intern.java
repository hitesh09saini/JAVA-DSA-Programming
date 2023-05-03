public class intern {
    public static void main(String[] args) {
        String s = "hill";
        
        String s1= "hill".intern();

        System.out.println(s==s1? "yes":"no");

    }
}
