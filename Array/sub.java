import java.util.ArrayList;

public class sub {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };

        System.out.println(send(arr, arr.length, 12));
    }

    private static ArrayList<Integer> send(int[] a, int n, int s) {

        ArrayList<Integer> li = new ArrayList<>();

        int st = 0, e = 0;
        int sum = 0;
        while (e < n) {
            sum += a[e];
            while (sum > s) {
                sum -= a[st++];
            }

            if (sum == s && st <= e) {
                li.add(st + 1);
                li.add(e + 1);
                return li;
            }

            e++;

        }

        li.add(-1);

        return li;
    }

}
