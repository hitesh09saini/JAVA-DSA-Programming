package recurtion.backtracking;

public class n_QueenAll {
    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        // initalize

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);

    }

    // print
    public static void print(char[][] board) {
        System.out.println("-------CHESS BOARD--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // nQueens place
    public static void nQueens(char ch[][], int in) {
        // base case
        if (in == ch.length) {

            print(ch);

            return;
        }

        // recursion
        for (int i = 0; i < ch.length; i++) {
            ch[in][i] = 'Q';
            nQueens(ch, in + 1); // function call
            ch[in][i] = '.'; // backTracking step
        }

        
    }
}
