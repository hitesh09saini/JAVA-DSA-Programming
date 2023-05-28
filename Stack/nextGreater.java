import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int a[] = { 6, 8, 0, 1, 3 };

        int greater[] = new int[a.length];

        fix(a, greater);

        for (int i = 0; i < greater.length; i++) {
            System.out.print(greater[i] + " ");
        }

    }

    private static void fix(int[] a, int[] greater) {
        Stack<Integer> s = new Stack<>();
        int next = 0;
        for (int i = a.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && a[s.peek()] <= a[i]) {

                s.pop();
            }

            if (s.isEmpty()) {
                next = -1;
               
            } else {
                next = a[s.peek()];
            }
            s.push(i);
            greater[i] = next;

        }
    }
}
