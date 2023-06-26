public class insertionSort {
    public static void main(String[] args) {
        int a[]={1,3,4,7,9};
        InsertionSort(a);
    }

    private static void InsertionSort(int[] a) {
         for(int i=1;i<a.length;i++){
            int c = a[i];
            int p =i-1;

            while(p>=0&&a[p]>c){
                a[p+1] = a[p];
                p--;
            }

            a[p+1] = c; 
         }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
