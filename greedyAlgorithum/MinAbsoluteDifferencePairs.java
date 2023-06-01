package greedyAlgorithum;

import java.util.Arrays;

public class MinAbsoluteDifferencePairs {
    
    public static void main(String[] args) {
        int A[] ={4,1,8,7};
        int B[] ={2,3,6,5};

       findAbsoluteDiff(A ,B);
    }

    private static void findAbsoluteDiff(int[] A, int[] B) {

        Arrays.sort(A);
        Arrays.sort(B);

        int min =0;

        for(int i=0;i<A.length;i++)
        min += Math.abs(B[i]-A[i]);
            
        

        System.out.println(min);
    }
}
