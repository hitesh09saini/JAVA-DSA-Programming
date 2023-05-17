
public class gridWays {
    public static void main(String[] args) {
        int n =1,m=1;
        System.out.println(gridWays(n, m, 0, 0));
    }

    public static int gridWays(int n ,int m ,int i ,int j) {
        
        // base case

        if(i == n-1&& j==m-1){
            return 1;
        }else if(i == n || j==n){  // bounary condition
            return 0;
        }
       // right direction
        int w1 = gridWays(n, m, i+1, j);

        // down direction

        int w2 = gridWays(n, m, i, j+1);

        return w1+w2;

    }
}
