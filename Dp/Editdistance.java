package Dp;

public class Editdistance {
    
    public static void main(String[] args) {
        
        String s = "abc";
        String s1 = "sbd";

        System.out.println(editDistance(s, s1));
    }

    public static  int editDistance(String s ,String s1){
        int n = s.length();
        int m  = s1.length();

        int dp[][] = new int[n+1][m+1]; 

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                  
                if(i == 0){
                   dp[i][j] = j;
                }

                if(j==0){
                    dp[i][j] = i;
                }
            }
        }

        // bottom up
        for(int i= 1;i<n+1;i++){
            for(int j =1;j<m+1;j++){

                if(s.charAt(i-1) == s1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];

                }else{
                    int add = dp[i][j-1]+1;
                    int del = dp[i-1][j]+1;
                    int rep = dp[i-1][j-1]+1;

                    dp[i][j]  = Math.min(add, Math.min(del, rep));

                }
            }
        }

        return dp[n][m];
    }
}
