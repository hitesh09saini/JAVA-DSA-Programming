package recurtion;

public class tilingProblem {
    public static void main(String[] args) {
      
      System.out.println(tilingCount(5));
      
    }

    /// find way of tile the given on board

    public static int tilingCount(int n)  // 2 X n ( floor size )
    {    // base case
        if(n==0||n==1){
            return 1;
        }       
        //kaam
        // vertical Choice
        int verticalTiles = tilingCount(n-1);
        
        // horizontal choice
        int horizontalTiles = tilingCount(n-2);

        int totWays = verticalTiles+horizontalTiles;

        return totWays;
    }
}
