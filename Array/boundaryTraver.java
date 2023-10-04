import java.util.ArrayList;

public class boundaryTraver {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println(traversal(a, a.length, a[0].length));
    }

    private static ArrayList<Integer> traversal(int[][] a, int n, int m) {

         int sr = 0, er = n;
        int sc = 0, ec = m;
        ArrayList<Integer>arr = new ArrayList<>();

        for (int i = sr; i < er; i++) {
            // left to right
            for (int j = sc; j < ec; j++) {
            
                arr.add(a[sr][j]);
            }
            sr++;
            // right to bottom
            for (int j = sr; j < er; j++) {
             
                arr.add(a[j][ec - 1] );
            }
            ec--;

            // right to left
            for (int j = ec - 1; j >= sc; j--) {
                
                arr.add(a[er - 1][j] );
            }
            er--;
            // left to up

            for (int j = er - 1; j >= sr; j--) {
               
                arr.add(a[j][sc]);
            }
            sc++;

        }
        
        return arr;

    }
}
