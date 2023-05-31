package recurtion.backtracking;

public class nextPermutation {
    public static void main(String[] args) {
        int arr[] ={1,5,8,4,7,6,5,3};
        permutation(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void permutation(int[] a) {

        int i = a.length - 2, j = a.length - 1;

        while (i >= 0) {
            if (a[i] < a[i+1]) {
                break;
            } else {
                --i;
            }
        }

        if (i == -1) {
            for(i = 0; i < a.length / 2; ++i) {
                int temp = a[i];
                a[i] = a[a.length - i - 1];
                a[a.length - i - 1] = temp;
            }
        } else {
            
            while (j >= 0) {
                if (a[j] > a[i]) {
                    break;
                } else {
                    --j;
                }
            }

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            int shift = i + 1;

            for(int k = 0; k < (a.length - shift) / 2; ++k) {
                temp = a[shift + k];
                a[shift + k] = a[a.length - k - 1];
                a[a.length - k - 1] = temp;
            }
        }

    }
}
