import java.util.Stack;

public class MaxDiff {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 8, 7, 7, 9, 3 };
        System.out.println(findMaxDiff(arr, arr.length));

    }

    public static int findMaxDiff(int a[], int n) {

        Stack<Integer> s = new Stack<>();
        int[] left = new int[a.length];
        left[0] = 0;
        s.push(0);
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {

                s.pop();

            }
            
            if (s.isEmpty())
                left[i] = 0;
            else
                left[i] = a[s.peek()];
            s.push(i);
        }

        s.clear();

        int[] right = new int[a.length];
        right[n - 1] = 0;
        s.push(n - 1);
        for (int i = n - 2; i > -1; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i])
                s.pop();

            if (s.isEmpty())
                right[i] = 0;
            else
                right[i] = a[s.peek()];
            s.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (Math.abs(right[i] - left[i]) > ans)
                ans = Math.abs(right[i] - left[i]);
        }
        return ans;
    }

    // public static int findMaxDiff(int a[], int n) {

    // // left smallest
    // int left[] = new int[n], in = 1;
    // for (int i = 1; i < n; i++) {

    // if ((a[i - 1] < a[i])) {
    // left[in] = a[i - 1];
    // in++;

    // } else {
    // int k = in;
    // while (left[k-1] > a[i] && k != -1) {
    // k--;
    // }
    // left[in] = left[k-1];
    // in++;

    // }

    // }

    // // right smallest
    // int right[] = new int[n];
    // in = n-2;
    // for (int i = n-2; i >=0; i--) {

    // if ((a[i] > a[i+1])) {
    // right[in] = a[i +1];
    // in--;

    // } else {
    // int k = in;
    // while (right[k+1] > a[i] && k != n) {
    // k++;
    // }
    // right[in] = right[k+1];
    // in--;

    // }

    // }

    // // maximum
    // int max = -1;
    // for(int i=0;i<n;i++){
    // max = Math.max(max, Math.abs(left[i]-right[i]));
    // }

    // return max;

    // }
}
