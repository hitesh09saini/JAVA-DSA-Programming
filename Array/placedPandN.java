import java.util.Arrays;
import java.util.Collections;

public class placedPandN{

    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 } ;
        int n = arr.length;

        sort(arr,n);
        
    }

    public static void sort(int[] arr, int n) {
       
          int[]copy = new int[n];
          int i=0;
          for(int a:arr)if(a>0)copy[i++]=a;       // greater then
          for(int a:arr)if(a<0)copy[i++]=a;     // les ten zero
          for(int k=0;k<n;k++)arr[k]=copy[k];  // copy in arr
       
    }
}