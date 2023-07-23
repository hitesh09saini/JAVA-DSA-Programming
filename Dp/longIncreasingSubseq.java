package Dp;

import java.util.Arrays;
import java.util.HashSet;

public class longIncreasingSubseq {
    public static void main(String[] args) {
        int a[] = {50,3,10,7,40,80};
        
        System.out.println(LIS(a,a.length));
    }

    private static int LIS(int[] a, int n) {
 
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }

        int a1[] = new int[set.size()];

        int i=0;
        for(int num :set){
            a1[i] = num;
            i++;
        }

        Arrays.sort(a1);




        return lcs(a,a1);
    }

    private static int lcs(int[] a, int[] a1) {

        int n = a.length;
        int m = a1.length;

        int dp[][] = new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a[i-1]==a1[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
`
        return dp[n][m];
    }
}
