package recurtion;

public class ArraSum {
    public static void main(String[] args) {
        int arr[] = {1,4,2,3,5};
       
        System.out.println(sum(arr ,arr.length));
    }

    public static int sum(int[] arr, int l) {
        // base case

        if(l==0)return 0;

        return arr[l-1]+sum(arr,l-1);
    }

}
