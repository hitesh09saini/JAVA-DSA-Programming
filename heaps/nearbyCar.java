package heaps;

import java.util.PriorityQueue;

public class nearbyCar {
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int sq ;
        int inx;
        
        public Point(int x ,int y,int sq ,int inx) {
            this.x = x;
            this.y = y;
            this.sq = sq;
            this.inx = inx;
        }

        @Override
        public int compareTo(Point o) {
            return this.sq - o.sq;
        }

       
    }
    public static void main(String[] args) {
         int ts[][] = {{3,3},{5,-1},{-2,4}};
         int k =2;

         PriorityQueue<Point> pq = new PriorityQueue<>();

         for(int i=0;i<ts.length;i++){
            int s = ts[i][0]*ts[i][0]+ts[i][1]*ts[i][1];
            
            pq.add(new Point(ts[i][0], ts[i][1], s,i));
         }

         for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().inx);
            
         }
    }  
 }
