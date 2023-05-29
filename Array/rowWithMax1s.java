public class rowWithMax1s {
    public static void main(String[] args) {
        int a[][]= {{0, 1, 1, 1}, //0 1 1 1 0 0 1 1 1 1 1 1 0 0 0 0
        {0, 0, 1, 1},
        {1, 1, 1, 1},
        {0, 0, 0, 0}};
        int r = a.length;
        int c= a[0].length;
        System.out.println(find(a,r,c));
    }

    private static int find(int[][] a, int n, int m) {
     
       for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
            if(a[j][i]==1){
             return j+1;
            }
         }
       }

      return -1;
    }
}
