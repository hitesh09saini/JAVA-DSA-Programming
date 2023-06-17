package hashing;

import java.util.HashSet;

public class unionAndIntersectionOfTwoArr {
    public static void main(String[] args) {
        int arr1[]={7,3,9,2};
        int arr2[]={6,3,9,2,9,4};

        find(arr1,arr2);
    }

    private static void find(int[] arr1, int[] arr2) {
       HashSet<Integer>h = new HashSet<>();
       HashSet<Integer>in = new HashSet<>();

       for(int i:arr1){
          h.add(i);
       }
      
       for(int i:arr2){
        if(h.contains(i)){
            in.add(i);
        }
        h.add(i);
       }

       System.out.println("Union of two Arr: "+h + ",  intersection : "+in);
    }
}
