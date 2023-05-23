package recurtion;

public class calcuExpo {
   public static void main(String[] args) {
    int a =3;
    int n =3;
   System.out.println( power(a ,n));
   }

  public  static int power(int a, int n) {

    // base case
    if(n==0)return 1;   
    
    power(a, n-1);
    
    return a*a;
    
    
 }
}
