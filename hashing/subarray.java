package hashing;

import java.util.HashMap;

public class subarray {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int k=3;
        sumN(arr,k);
    }

    private static void sumN(int[] arr, int k) {
        HashMap<Integer ,Integer> m = new HashMap<>();
        m.put(0, 1);
        int sum =0;
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(m.containsKey(sum-k)){
              ans += m.get(sum-k);
            }
            m.put(sum, m.getOrDefault(sum,0)+1);
        }

        System.out.println(ans);
    }
}
