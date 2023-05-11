public class waterContainer {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int s = 0, e = arr.length - 1;

        // left
        int left[] = new int[e + 1];

        int max = 0;
        for (int i = 0; i <= e; i++) {
            if (max < arr[i]) {
                left[i] = arr[i];
                max = arr[i];
            } else {
                left[i] = max;
            }
        }

        // right

        int right[] = new int[e + 1];
        max = 0;
        for (int i = e; i >= 0; i--) {
            if (max < arr[i]) {
                right[i] = arr[i];
                max = arr[i];
            } else {
                right[i] = max;
            }
        }
        name(arr);
        System.out.println();
        MaxWaterCon(arr, left, right);
    }

    public static void MaxWaterCon(int[] a, int left[], int right[]) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {

            int s = 0;
            int e = a.length - 1;

            while (a[i] > left[s])
                s++;
            while (a[i] > right[e])
                e--;

            int result = a[i] * (e - s);

            if (max < result) {
                max = result;
            }

        }
        System.out.println("Max Area of container is : "+max);

    }

    public static void name(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
