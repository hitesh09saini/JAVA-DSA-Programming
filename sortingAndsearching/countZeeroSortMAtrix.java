public class countZeeroSortMAtrix {
    public static void main(String[] args) {
        int a[][] ={{0, 0, 0},
                    {0, 0, 1},
                    {0, 1, 1}};

        count(a,a.length);
    }

    private static void count(int[][] a, int n) {
        int  c=0;
        for(int i=0;i<n;i++){
            if(a[i][0] == 0){
                 for(int j =0;j< n;j++){
                     if(a[i][j] != 0)break;
                     c++;
                 }
            }
        }
        System.out.println(c);
    }
}
