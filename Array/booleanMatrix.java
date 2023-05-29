public class booleanMatrix {
    public static void main(String[] args) {
       
        int a[][] = {{0,0,0,0,0,0}
                    ,{0,0,0,0,0,1}
                    ,{0,1,0,0,0,1}};
       
        booleanM(a, a.length, a[0].length);
    }

    private static void booleanM(int[][] a, int r, int c) {
        int b[][] =new int[r][c];

        int s =-1,e=-1;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int v =0;
                if (a[i][j] == 1) {
                  
                  while(v<c){
                    b[i][v]=1;
                    v++;
                  }
                 v=0;
                  while(v<r){
                    b[v][j]=1;
                    v++;
                  }

                }
              
            }
        }
       

        for (int j = 0; j < r; j++) {
            for (int i = 0; i < c; i++) {
            System.out.print(b[j][i]+" ");

            }System.out.println();
        }
    }
}
