import java.util.Stack;

public class maxHIstro {
    public static void main(String[] args) {
        int a[] = { 2, 1, 5, 6, 2, 3 };
        System.out.println(maxArea(a));
    }

    private static int maxArea(int[] a) {
        int n = a.length;
         
        int left[] = new int[n];
        int right[] = new int[n];
        int maxArea = 0;

        // smallest right
        Stack<Integer> s = new Stack<>();
        for (int i = n-1; i >=0; i--) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                right[i] = a.length;
            } else {
                right[i] = s.peek();
            }
            s.push(i);
        }

       ;

        // smallest left
        s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && a[s.peek()] >= a[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                left[i] = a.length;
            } else {
                left[i] = s.peek();
            }
            s.push(i);
        }

        
        for (int i = 0; i < n; i++) {

            int wi = right[i]-left[i]-1;
            int Area = wi*a[i];
            
 
            maxArea = Math.max(maxArea, Area);

        }

        return maxArea;
    }

}
