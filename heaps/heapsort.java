package heaps;

public class heapsort {
    public static void heapSort(int arr[]) {
        // step 1  - build maxHeap
        int n = arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(i,n,arr);
        }

        // step 2  push largest at end
        for(int i=n-1;i>=0;i--){
            // swap (largest first with last)

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        
            heapify(0,i,arr);
        }

    }
      private static void heapify(int i,int n, int []arr) {
                 int max = i;
                 int left = 2*i+1;
                 int right = 2*i+2;

                if(left < arr.length && right< arr.length){
         
                 if(arr[max]>arr[left]){
                   max = left;
                 }
                 if(arr[min]>arr[right]){
                   min = right;
                 }
                }

                if(min != i){
                    //  swap
                    int temp = arr[i];
                    arr[i]= arr[min];
                    arr[min]= temp;

                    heapify(min,arr);
                }
        }




    public static void main(String[] args) {
        int a[]={1,2,4,5,3};


    }
}
