public class setMatrixZeroes {
    public static void main(String[] args) {

        int board[][] = { { 0, 1, 0 }, { 3, 5, 4 }, { 1, 1, 1 } };
        Print(board);
        Check(board);
    }

    public static void Check(int[][] bor) {
        int[][] newb = new int[bor.length][bor[0].length];

        for (int i = 0; i < bor.length; i++) {
            for (int j = 0; j < bor[0].length; j++) {
                newb[i][j] = bor[i][j];
            }

        }

        for (int i = 0; i < bor.length; i++) {
            for (int j = 0; j < bor[0].length; j++) {
                if (bor[i][j] == 0) {

                    int r = 0, c = 0;

                    // set row
                    while (c < bor[0].length) {
                        newb[i][c] = 0;
                        c++;
                    }

                    // set col
                    while (r < bor.length) {
                        newb[r][j] = 0;
                        r++;
                    }

                } else {

                }
            }
        }
        Print(newb);

    }

    public static void Print(int[][] b) {

        for (int i = 0; i < b.length; i++) {
            
            for (int j = 0; j < b[0].length; j++) {

                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }
}
