package recurtion;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        quickSort(arr, 0, arr.length-1);
        Print(arr);
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e)
            return;

        // last element
        int pidx = partition(arr, s, e);

        quickSort(arr, s, pidx - 1); // left part

        quickSort(arr, pidx + 1, e); // right part

        

    }

    public static int partition(int[] arr, int s, int e) {
        int pivot = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = pivot;
        arr[e] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void Print(int a[]) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }

}