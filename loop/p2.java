package loop;

public class p2 {
    public static void main(String[] args) {
        int n =5;
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                if(j==0||i==0||i==n-1||j==n-1)
                System.out.print(" "+1);
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
