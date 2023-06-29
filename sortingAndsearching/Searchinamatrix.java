public class Searchinamatrix {
    public static void main(String[] args) {
        int mat[][] = {
                { 3, 30, 38 },
                { 44, 52, 54 },
                { 57, 60, 69 }
        };

        System.out.println(search(mat, 52));
    }

    private static int search(int[][] mat, int k) {

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][mat[0].length - 1] == k) {
                return 1;
            } else if (mat[i][mat[0].length - 1] > k) {

                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == k) {
                        System.out.println("mat["+i+"]"+"["+j+"]");
                        return 1;
                    }
                }

            }

        }

        return 0;
    }
}
