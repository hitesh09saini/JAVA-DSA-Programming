public class sudoku {
    public static void main(String[] args) {
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };
     
       
       if(sudokuSolver(sudoku, 0, 0)){
        System.out.println("Solution is exists\n\n");
        Print(sudoku);
       }else{
        System.out.println("solution does not exist");
       }
    }

    // solve Sudoku
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {

        // base case 
        if (row == 9 ) {
           
            return true;
        } 

        int nextrow = row, nextcol = col + 1;
        
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        // is empty

        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextrow, nextcol);
        }

        // place elements

        for (int digit = 1; digit <= 9; digit++) {

            // digit place is safe

            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // put digit

                // soluttion exist
                if (sudokuSolver(sudoku, nextrow, nextcol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        
       return false;

    }

    // safe place
    public static boolean isSafe(int sudoku[][], int r, int c, int di) {

        // column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][c] == di){
              return false;
            }
        }

        // row
        for (int i = 0; i <= 8; i++) {
            if (sudoku[r][i] == di){
                return false;
            }
        }

        // grid 3X3
        int row = (r / 3) * 3, col = (c / 3) * 3;

        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {

                if (sudoku[i][j] == di){
                    return false;
                }
            }

        }

        return true;

    }

    //print 

    public static void Print(int sudoku[][] ) {
        for(int i = 0;i<9;i++){
            for(int j =0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }System.out.println();
        }
    }
}
