package Dp;

import java.util.Arrays;

public class longestComSub {
    public static void main(String[] args) {
        String s = "abcde";
        String s1 = "ace";

        int dp[][] = new int[s.length()+1][s1.length()+1];

        // for(int ar[] : dp){
        //     Arrays.fill(ar,-1);
        // }

        System.out.println(LCS2(s, s1, s.length(), s1.length(), dp));

        // System.out.println(LCS(s , s1,s.length(),s1.length()));
    }

    // recursion

    private static int LCS(String s, String s1,int n ,int m) {
        // base case
        if(n==0 ||  m==0)return 0;
        // if equal 

        if(s.charAt(n-1) == s1.charAt(m-1)){
            return LCS(s, s1, n-1, m-1)+1;
        }
        // not equal
        else{
            int ans1 = LCS(s, s1, n-1, m);
            int ans2 = LCS(s, s1, n, m-1);
           return Math.max(ans1, ans2);
        }

    }

    // memoization  O(n)

    private static int LCS1(String s, String s1,int n ,int m ,int dp[][]) {
        // base case
        if(n==0 ||  m==0)return 0;

        if(dp[n][m]!= -1)return dp[n][m];        // if equal 

        if(s.charAt(n-1) == s1.charAt(m-1)){
            return LCS1(s, s1, n-1, m-1,dp)+1;
        }
        // not equal
        else{
            int ans1 = LCS1(s, s1, n-1, m,dp);
            int ans2 = LCS1(s, s1, n, m-1,dp);
           return Math.max(ans1, ans2);
        }

    }


    //  tabulation

    private static int LCS2(String s, String s1,int n ,int m ,int dp[][]) {
   
                        
        for(int i = 1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++){

                if(s.charAt(i-1) == s1.charAt(j-1)){

                    dp[i][j] = dp[i-1][j-1]+1;

                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];

                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }

}
