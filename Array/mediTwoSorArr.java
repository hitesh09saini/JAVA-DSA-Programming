import java.text.DecimalFormat;
import java.util.Arrays;

public class mediTwoSorArr {

    public static void main(String[] args) {
        int n1[] = { 1, 3 };
        int n2[] = { 2 ,4};

        int arr[] = margeArr(n1, n2);

        Arrays.sort(arr);

        double ans = 0;
        int mid = arr.length/2;
        if(arr.length%2==0){
        ans =(double)(arr[mid]+arr[mid-1])/2;
        
        }else{
        ans = (double)arr[mid];
        }
        DecimalFormat df = new DecimalFormat(".00000");

       System.out.println(df.format(ans));

    }

    public static int[] margeArr(int n1[], int n2[]) {
        int arr[] = new int[n1.length + n2.length];
        for (int i = 0; i < n1.length; i++) {
            arr[i] = n1[i];
        }
        for (int i = n1.length, j = 0; i < arr.length; i++, j++) {
            arr[i] = n2[j];
        }

        return arr;
    }
}
