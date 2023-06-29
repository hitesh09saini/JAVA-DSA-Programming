import java.util.Arrays;

public class bitonicPoint {
    public static void main(String[] args) {
        int arr[] = { 1, 15, 25, 41, 42, 21, 17, 12, 11 };
        System.out.println(name(arr, arr.length));

    }

    public static int name(int arr[], int n) {

        int s = 0, e = n - 1, m;

        while (s < e) {
            m = s + (e - s) / 2;
            if(arr[m]<arr[m+1]){
                s = m;
            }else if(arr[m]>arr[m-1]&&arr[m]>arr[m+1]){
                    return arr[m];
            }else{
                 e = m;
            }

        }

        return 0;
    }

}
