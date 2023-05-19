package recurtion;

public class n_QueenNboard {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        // initalize

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }

    public static void nQueens(char ch[][], int in) {
        // base case
        if (in == ch.length) {

            print(ch);

            return;
        }

        // recursion
        for (int i = 0; i < ch.length; i++) {

            if(isSafe(ch ,in,i)){
            ch[in][i] = 'Q';
            nQueens(ch, in + 1); // function call
            ch[in][i] = 'X'; // backTracking step
            }
        }

        
    }

    // is safe 

    public static boolean isSafe(char board[][] ,int row ,int col)
    {
       //vertical up
       for(int j=row-1;j>=0;j--){
        if(board[j][col]=='Q'){
            return false;
        }
       }
       
       // diag left up
      for(int j =row-1,i=col-1;j>=0&&i>=0;j--,i--){
        if(board[j][i]=='Q'){
            return false;
        }
      }

       //diag right up
       for(int j =row-1,i=col+1;j>=0&&i<board.length;j--,i++){
        if(board[j][i]=='Q'){
            return false;
        }
      }


       return true;
    }



    public static void print(char[][] board) {
        System.out.println("-------CHESS BOARD--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
