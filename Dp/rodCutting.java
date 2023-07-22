package Dp;

public class rodCutting {
    
    public static void main(String[] args) {
        int length[] = {1,2,3,4,5,6,7,8};
        int price[] = {1,5,8,9,10,17,17,20};

        int rodLength = 8;

        System.out.println(RodCutting(length ,price, rodLength));
    }

    private static int RodCutting(int[] l, int[] p, int r) {
       int n =p.length;
       int dp[][] = new int[n+1][r+1];

       for(int i=0;i<dp.length;i++){
           dp[i][0] = 0;
       }

       for(int i=0;i<dp[0].length;i++){
           dp[0][i] = 0;
       }

       for(int i=1;i<n+1;i++){
           for(int j=1;j<r+1;j++){
             if(l[i-1] <= j){

                dp[i][j]  = Math.max(p[i-1]+dp[i][j-l[i-1]], dp[i-1][j]);
             }else
             {
                dp[i][j] = dp[i-1][j];
             }
           }
       }


        return dp[n][r];
    }
}
