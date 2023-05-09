public class recuProblem2 {

    // factorial 

    public static int factorial(int a ) {
        if(a ==0)return 1;

         int n = factorial(a-1);

         return a*n;


    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

}
