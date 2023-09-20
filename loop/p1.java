package loop;

public class p1 {
    public static void main(String[] args) {

        int n = 4;
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                if (i == 0 || j == 0 || i == n || j == i) {

                    if (j % 2 == 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
