public class bubbleSort {
    public static void main(String[] args) {
          int arr[]= {4,1,3,9,7};
          BubbleSort(arr);
    }

    private static void BubbleSort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int t= arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
        }
    }
}
