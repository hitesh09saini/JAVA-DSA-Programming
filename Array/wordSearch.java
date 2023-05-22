
public class wordSearch {
    static boolean visited[][];
    public static void main(String[] args) {
        char[][] ch = { { 'A', 'N', 'S', 'Q' }, { 'S', 'O', 'L', 'R' }, { 'K', 'T', 'O', 'G' } };
        String word = "SQR";

        System.out.println(exist(ch, word));
    }
 
    public static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        boolean result = false;

        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(dfs(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return result;
    }

    public static boolean dfs(char[][] board, String word, int i, int j, int inx)
    {
        int m = board.length;
        int n = board[0].length;

        if(i<0 || j<0 || i>=m || j>=n)
        {
            return false;
        }

        if(board[i][j] == word.charAt(inx))
        {
            char temp = board[i][j];
            board[i][j]='#';

            if(inx==word.length()-1)
            {
                return true;
            }
            else if(dfs(board, word, i-1, j, inx+1) ||dfs(board, word, i+1, j, inx+1) ||dfs(board, word, i, j-1,inx+1) ||dfs(board, word, i, j+1, inx+1))
            {
                return true;
            }
            board[i][j]=temp;
        }
        return false;
    }
}
