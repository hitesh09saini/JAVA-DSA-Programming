import javax.xml.transform.Source;

public class recurtion {
    public static void call(int n) {
        if(n==0) return;
       
        call(n-1);
        System.out.println(n+" ");
        
    }
    public static void main(String[] args) {
        int n =10;
        call(n);
    }
}
