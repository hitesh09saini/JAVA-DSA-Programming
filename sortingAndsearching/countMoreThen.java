import java.util.Arrays;


public class countMoreThen {
    public static void main(String[] args) {
        int arr[] = {2};
        int n =1;
        int k =3;

       System.out.println( find(arr , n ,k));
    }

    private static int find(int[] arr, int n, int k) {
        if(n == 1)return arr[0];
        Arrays.sort(arr);
        int p = arr[0];
        int c =1;
        for(int i=1;i<n;i++){
           if(p == arr[i]){
            c++;
           }else{
            if(c > n/k)return p;
            p = arr[i];
            c= 1;

           }
        }
        
       
        return -1;
    }
}
