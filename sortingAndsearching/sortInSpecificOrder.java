import java.util.Arrays;

public class sortInSpecificOrder {
    public static void main(String[] args) {
        long a[] = {0, 4, 5, 3, 7, 2, 1};

        sort(a,a.length);
    }

    private static void sort(long[] a, long n) {
        int v = (int) n;
        long b[] = new long[v];

        Arrays.sort(a);
        int j=0;
        for(int i =v-1;i>=0;i--){
            if(a[i]%2 != 0){
                b[j] = a[i];
                j++;
            }
        }

        for(int i =0 ;i<v;i++){
           if(a[i]%2 == 0){
              b[j] = a[i];
            j++;
           }
        }

        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
