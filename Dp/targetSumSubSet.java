package Dp;

public class targetSumSubSet {
    
    public static void main(String[] args) {
        int numbers[] = {4,2,7,1,3};
        int TargetSum =  10;

        System.out.println(has(numbers, TargetSum));
    }
// tabulation
    private static boolean has(int[] n, int t) {
        boolean [][]dp = new boolean[n.length+1][t+1];

        for(int i=0;i<n.length+1;i++){
            dp[i][0] = true;
        }

        for(int i=1 ;i<n.length+1;i++){
            for(int j=1;j<t+1;j++){
                int v = n[i-1];
                //   include
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }

                //  exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;
                }
            }
        }


        return dp[n.length][t];
    }
}
