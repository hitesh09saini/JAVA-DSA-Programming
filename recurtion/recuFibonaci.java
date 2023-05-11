public class recuFibonaci {
    public static int FibonacciNum(int n) {
       if(n==0||n==1)return n;   
       int fib2= FibonacciNum(n-1);
       int fib1= FibonacciNum(n-2);
    
       return fib1+fib2;       
    }
    
    public static void main(String[] args) {
      System.out.println(FibonacciNum(5));
    }
}
