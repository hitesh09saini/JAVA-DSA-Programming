import java.util.ArrayList;
import java.util.Arrays;
public class ropeCuting {
    public static void main(String[] args) {
        int a[]= {5, 1, 1, 2, 3, 5} ;

        System.out.println(cut(a ,a.length));
    }

    private static ArrayList<Integer> cut(int[] arr, int n) {
       Arrays.sort(arr);
       ArrayList<Integer> al=new ArrayList<>();
       int cuttinglength=arr[0];
       for(int i=0;i<n;i++)
       {
           if((arr[i]-cuttinglength)>0)
           al.add(n-i);
           cuttinglength=arr[i];
       }
       return al;
    }
}
