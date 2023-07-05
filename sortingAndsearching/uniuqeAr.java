import java.util.Arrays;


public class uniuqeAr {
    public static void main(String[] args) {
        int a[] = {1,1,2,3,3};
       
        System.out.println(output(a,a.length));
    
    }
    private static long output(int[] arr, int n) {
         long count = 0;
        Arrays.sort(arr);
        for(int i = 1; i < n; i++)
        {
            if(arr[i] <= arr[i-1])
            {
                int val = arr[i-1] - arr[i] + 1;
                count += val;
                arr[i] += val;
            }
        }
        return count;
    }
}
