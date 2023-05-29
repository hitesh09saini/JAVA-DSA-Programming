import java.util.Arrays;

public class Pythagorean {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 6, 5 };
       
        int n = arr.length;

        find(arr, n);
    }

    private static void find(int[] ar, int n) {
        int a = 0, b = 0, c = 0;

        int i=0;
        while(i<n){
            int j = 1;
        
        while(j<n){
           for(int k=0; k<n; k++){
               if((ar[i] * ar[i])+ (ar[j]*ar[j]) == (ar[k] * ar[k])){
                a = ar[i];
                b = ar[j];
                c =ar[k];
               break;
               }
        }
        j++;
        }
        i++;
        }
        System.out.println(a + "  " + b + "  " + c);
    }
}
