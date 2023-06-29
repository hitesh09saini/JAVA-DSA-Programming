import java.util.Arrays;

public class tworeaptenum {
    public static void main(String[] args) {
        int array[] = {1,2,2,1,3};
        int n =2;

        num(array , n);
        
    }

    private static void num(int[] a, int n) {
           
        int arr[] = new int[n+1];
        Arrays.fill(arr , 0);

        for(int i=0;i<n+2;i++){
            arr[a[i]-1]++;  
        }

        for(int i =0;i<n;i++){
            if(arr[i] == 2){
                System.out.println(i+1);
            }
        }

    }
}
