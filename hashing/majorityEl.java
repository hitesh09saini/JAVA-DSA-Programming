package hashing;

import java.util.HashMap;

public class majorityEl {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> h = new HashMap<>();
        for (int n : nums) {

          h.put(n, h.getOrDefault(n,0)+1);

            if (h.get(n) > nums.length / 3) {
                System.out.println(n);
            }
          
        }

    }
}
