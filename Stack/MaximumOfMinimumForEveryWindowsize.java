
import java.util.Stack;

public class MaximumOfMinimumForEveryWindowsize {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30 };
        print(arr);
        int[] a = max(arr, arr.length);
        print(a);

    }

    public static void print(int a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }

    public static int[] max(int a[], int n) {

        int[] res = new int[n];
        int k = 0;
        Stack<Integer> s = new Stack<>();

        for (int i = 1; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= n - i; j++) {
                int c = 0;

                s = new Stack<>();
                int inx = j;

                while (i > c) {

                    if (s.isEmpty())
                        s.push(a[inx]);

                    else {

                        while (!s.isEmpty() && s.peek() > a[inx])s.pop();

                        if (s.isEmpty())s.push(a[inx]);

                    }
                    c++;
                    inx++;
                }

                if (!s.isEmpty())
                    max = max < s.peek() ? s.peek() : max;

            }

            res[k] = max;
            k++;

        }

        return res;
    }

}