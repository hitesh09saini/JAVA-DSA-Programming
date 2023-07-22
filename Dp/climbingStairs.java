package Dp;

import java.util.Arrays;

public class climbingStairs {
    public static void main(String[] args) {
        int n=5;
        int ways[] = new int[n+1];
        Arrays.fill(ways , -1);
        // System.out.println(NoofWays(n));
        // System.out.println(NoofWays1(n,ways));
        System.out.println(count(n));
    }

    private static int NoofWays(int n ) {
        if(n == 0||n ==1)return n;
        return  NoofWays(n-1)+NoofWays(n-2);
    }

    // Memoization - 
     private static int NoofWays1(int n ,int ways[] ) {
        if(n == 0)return 1;
        if(n < 0)return 0;
         if(ways[n] != -1){
            return ways[n];
         }

        ways[n] = NoofWays(n-1)+NoofWays(n-2);
        return ways[n];
    }

    // tabulation

    public static int count(int n){
        int dp[] = new int[n+1];
        dp[0] =1;

        for(int i =1;i<=n;i++){
            if(i!=1){
             dp[i] = dp[i-1]+dp[i-2];
            }
            else{ 
            dp[i] = dp[i-1];
            }
        }
        return dp[n];
    
    }

}
 