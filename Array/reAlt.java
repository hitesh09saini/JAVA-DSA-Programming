import java.util.Arrays;

public class reAlt {
    public static void main(String[] args) {
        long arr[] ={ 1,2,3,4,5,6,7};

        reArange(arr ,arr.length);
        for(int  i=0;i<arr.length;i++){
          System.out.print(arr[i]+" ");
        }
    }

    private static void reArange(long[] arr ,int n) {

        // find mid 
        int mid = n/2;

        // make arr
        long l[] = new long[mid];
        long r[] = new long[n-mid];

        for(int i=0;i<l.length;i++){
            l[i] = arr[i];
        }

        for(int i=mid,j=0;i<r.length+mid;i++,j++){
            r[j] = arr[i];
        }
        

        for(int i=0,j=r.length-1 ,k=0;i<n;i++){
           if(i%2==0){
            arr[i]=r[j];
            j--;
           }else{
            arr[i]=l[k];
            k++;
           }
        }
    }
}
