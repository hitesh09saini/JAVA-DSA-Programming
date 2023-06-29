public class selectionSort {
    public static void main(String[] args) {
        int arr[] = {4,1,3,9,7};

        sort(arr);
        for(int i:arr){
           System.out.print(i+" ");
        }
    }

    private static void sort(int[] a) {
        for(int i=0;i<a.length-1;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[min] > a[j]){
                     min = j;
                }
            }

            // swap
            int t = a[min];
            a[min] = a[i];
            a[i] = t;

        }
    }
}
