public class maxcoin {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1, 1, 1} ,
                       {2, 2, 2, 2, 2} ,
                       {3, 8, 6, 7, 3} ,
                       {4, 4, 4, 4, 4} ,
                       {5, 5, 5, 5, 5}};

        int n = mat.length;
         System.out.println(find(mat,n,3));              
    }

    private static int find(int[][] mat, int n, int k) {
       int mx = Integer.MIN_VALUE;
       int d[][] =new int[n+1][n+1];

       for(int i=0;i<=n;i++){

           for(int j=0;j<=n;j++){
        
            if(i==0 || j==0){
                d[i][j]= 0;
            }else{
                d[i][j]= mat[i-1][j-1]
                        +d[i-1][j]
                        +d[i][j-1]
                        -d[i-1][j-1];
            }

            if(i>=k&&j>=k){
                mx = Math.max(d[i][j]-(d[i][j-k]+d[i-k][j]-d[i-k][j-k] ),mx);
            }
           }
       }
       return mx;
    }
}
