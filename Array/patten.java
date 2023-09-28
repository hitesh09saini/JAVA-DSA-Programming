import java.util.Scanner;

public class patten {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        printPattern(n);

    }

    private static void printPattern(int n) {

        int num = n*(n+1)/2;

        for (int i = 1; i <=n; i++) {
            int p = n-2;
            int x = n-1;

            for (int j = 1; j <=i; j++) {

                if (j==1) {
                     System.out.print(num+" ");
                    
                } else {
                    System.out.print(num-x + "  ");
                    x = x+p;
                    p--;
                }
                
            }num--;
            System.out.println();
            
        }

    }

}
