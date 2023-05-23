package recurtion;

public class factorial {
    public static void main(String[] args) {
        int n = 3;
        int fact = 1;
       System.out.println( factorial(n, fact));
    }

    public static int factorial(int n, int fact) {

       
        // base case
        if (n == 0)return fact;
       // recursion
        return factorial(n - 1, n*fact);

    }

}
