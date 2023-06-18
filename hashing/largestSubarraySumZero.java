package hashing;

import java.util.HashMap;

public class largestSubarraySumZero {
   public static void main(String[] args) {
     int arr[] = {15,-2,2,-8,1,7,10,23};

      System.out.println( largestsum(arr));
   }

private static int largestsum(int[] arr) {
    HashMap<Integer,Integer> m = new HashMap<>();

    int sum =0;
    int l =0;

    for(int j=0;j<arr.length;j++){
      sum += arr[j];

      if(m.containsKey(sum)){
         l = Math.max(l, j-m.get(sum));
      }else{
        m.put(sum, j);
      }
    }

    return l;
}
}
