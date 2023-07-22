package Dp;

import java.util.Arrays;

public class knapsack {
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};

        int W =7;

        int dp [][]  = new int[val.length][W+1];
        for (int[] row : dp){
            Arrays.fill(row, -1);
        }

        System.out.println(TotalProfit3(val ,wt , W));
        // System.out.println(TotalProfit2(val ,wt ,W, 0 ,dp));

        // for(int i[]: dp){

        //     for(int j: i){
        //         System.out.print(j+" ");
        //     }System.out.println();
        // }
        // System.out.println(TotalProfit(val ,wt ,W, 0 ));
    }

    private static int TotalProfit(int[] val, int[] wt, int w, int i) {
       if(i ==val.length || w ==0)return 0;


        if(wt[i] <= w){
        //   include
           int ans1 = val[i]+TotalProfit(val, wt, w-wt[i],i+1);
        //   exclude
           int ans2 = TotalProfit(val, wt, w, i+1);

          return  Math.max(ans1, ans2);
    
        }else{
            return TotalProfit(val, wt, w, i+1);
        }
    }
    
// memoizaton         
  
    private static int TotalProfit2(int[] val, int[] wt, int w, int i ,int dp[][]) {
       if(i ==val.length || w ==0)return 0;

       if(dp[i][w] != -1){
        return dp[i][w];
       }

        if(wt[i] <= w){
        //   include
           int ans1 = val[i]+TotalProfit2(val, wt, w-wt[i],i+1,dp);
        //   exclude
           int ans2 = TotalProfit2(val, wt, w, i+1,dp);

          dp[i][w] =   Math.max(ans1, ans2);
          return dp[i][w];
    
        }else{
            dp[i][w] =  TotalProfit2(val, wt, w, i+1 ,dp);
            return dp[i][w];
        }
    }

// tabulation

    public static int TotalProfit3(int val[] ,int wt[], int w ){
        int n = val.length;
       int dp[][] = new int[n+1][w+1];
    //    Oth row 
       for(int i=0; i<dp.length;i++)dp[i][0] = 0;
    //    Oth col
       for(int i=0; i < dp[0].length;i++)dp[0][i] = 0;


       for(int i=1;i<n+1;i++){
          for(int j=1;j<w+1;j++){
            int v = val[i-1];
            int W = wt[i-1];

            if(W <= j){
              int incProfit = v + dp[i-1][j-W];
              int exProfit = dp[i-1][j];

              dp[i][j] = Math.max(incProfit, exProfit);
            } else {
                int exProfit = dp[i-1][j];
                dp[i][j] = exProfit;
            }
          }
       }
       
       return dp[n][w];
    }
} 
