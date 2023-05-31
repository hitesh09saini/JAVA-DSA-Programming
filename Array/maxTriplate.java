import java.util.Arrays;

public class maxTriplate {
    public static void main(String[] args) {
      long  arr[] = {-3, -5, 1, 0, 8, 3, -2} ;

      System.out.println(max(arr, arr.length));
    }

    public static long max(long arr[],int n) {
        
        Arrays.sort(arr);
        long pr = arr[n-1]*arr[n-2]*arr[n-3];
        long pr1 = arr[0]*arr[1]*arr[n-1];
        
        return  Math.max(pr,pr1);
    }
}
