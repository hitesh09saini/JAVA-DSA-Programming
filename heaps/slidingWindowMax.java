package heaps;

import java.util.PriorityQueue;

public class slidingWindowMax {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public  Pair(int val ,int idx){
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair o) {
            
          return o.val - this.val;
        }

        
    }
    public static void main(String[] args) {
        int arr[] ={1,3,-1,-3,5,3,6,7};

        int k=3;
        int res[] = new int[arr.length -k+1];
      
        PriorityQueue<Pair> p = new PriorityQueue<>();

        // 1st window 

        for(int i=0;i<k;i++){
           p.add(new Pair(arr[i], i));
        }

        res[0] = p.peek().val;

        for(int i=k;i< arr.length;i++){
           while(p.size() >0 && p.peek().idx <= (i-k)){
             p.remove();
           }
           p.add(new Pair(arr[i], i));
           res[i-k+1] = p.peek().val;
        }

        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
