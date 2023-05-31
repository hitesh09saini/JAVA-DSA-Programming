public class container {
    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 3 };
        System.out.println(max(a, a.length));
    }

    private static int max(int[] a, int n) {
        int l[] = new int[n];
        int r[] = new int[n];

        int max = l[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                l[i] = a[i];
            }

        }

        max = r[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (max < a[i]) {
                r[i] = a[i];
            }
        }

        max = 0;
        for (int i = 0; i < n; i++) {
            int ar = 
        }

        return max;
    }
}
