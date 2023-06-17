package heaps;

import java.util.PriorityQueue;

public class weakestSoldier {
    static class Row implements Comparable<Row> {
        int soldiers;
        int inx;

        public Row(int soldiers, int idx) {

            this.soldiers = soldiers;

            this.inx = idx;

        }
 

        @Override
        public int compareTo(Row r2) {

            if (this.soldiers == r2.soldiers) {

                return this.inx - r2.inx;
            } else {

                return this.soldiers - r2.soldiers;
            }

        }

    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 1, 1 },
                         { 1, 0, 0, 0 },
                         { 1, 0, 0, 0 } };

        int k = 2;

        PriorityQueue<Row> q = new PriorityQueue<>();

        for(int i=0;i<army.length;i++){
            int count =0;
            for(int j=0;j<army[0].length;j++){
                count += army[i][j] == 1 ? 1:0;
            }
            q.add(new Row(count, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("R"+q.remove().inx);
        }

    }
}
