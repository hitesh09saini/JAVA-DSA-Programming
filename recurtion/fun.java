package recurtion;

import java.time.chrono.MinguoChronology;

public class fun {
    public static void main(String[] args) {
        int x =2;
        int n =2;
     System.out.println(name(n, x));
    }
    public static int name(int n,int x) {
        if(n==0)return 1;
    
        int ni = name(n/2, x);
        int nt=ni*ni;
        if(n%2!=0){
            nt*=x;
        }
       return nt;
    }
}
