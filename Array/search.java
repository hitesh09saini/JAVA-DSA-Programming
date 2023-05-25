public class search {
    public static void main(String[] args) {
        int board[][] = { { 1, 3 ,5 }};

        int target = 1;
        System.out.println(searchMatrix(board, target));
    }

   
        //Approach:by Using Binary Search Algorithm Time: O(log(mn)) | Space: O(1)
        
        public static boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length == 0) return false;
            int rows = matrix.length;
            int columns = matrix[0].length;
    
            int low = 0;
            int high = rows * columns;
    
            while(low < high) {
                int mid = (low+high)/2;
               
                if(matrix[mid/columns][mid%columns] == target) {
                    return true;
                } else if (matrix[mid/columns][mid%columns] < target) {
                    low = mid+1;
                } else {
                    high = mid;
                }
            }
            return false;
        }
}


