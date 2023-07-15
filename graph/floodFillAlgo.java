package graph;

public class floodFillAlgo {
    public static int[][] floodfill(int [][]img,int sr,int sc,int color ){
        boolean vis[][] = new boolean[img.length][img[0].length];
        helper(img ,sr,sc,color ,vis,img[sr][sc]);
        return img;
    }
    private static void helper(int[][] img, int sr, int sc, int color, boolean[][] vis, int org) {
      // base case
      if(sr < 0 || sc <0 || sr >= img.length ||sc >= img[0].length || vis[sr][sc] || img[sr][sc]!= color)return;
      // left
      helper(img, sr, sc-1, color, vis, org);
      // right
      helper(img, sr, sc+1, color, vis, org);
      // up
      helper(img, sr-1, sc, color, vis, org);
      // down
      helper(img, sr+1, sc, color, vis, org);
    }
    public static void main(String[] args) {
        int img[][] ={{1,1,1},{1,1,0},{1,0,1}};

       int ans[][] = floodfill(img,0, 0,1);

       for(int i=0;i<ans.length;i++){
        for(int j=0;j<ans.length;j++){
            System.out.print(ans[i][j]);
        }System.out.println();
       }
    }
}