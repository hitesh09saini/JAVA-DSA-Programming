import java.util.ArrayList;
import java.util.Arrays;

public class total {

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 7, 5 };
        int s = 12;
        System.out.println(subString(a, a.length, s));
    }

    public static ArrayList<Integer> subString(int[] a, int n, int s) {
        ArrayList<Integer> li = new ArrayList<>();
       
        int i = 0, j = 0, sum = 0;

        while (i <= j && j < n) {
           
            if (sum == s) {
                li.add(i + 1);

                li.add(j );
                return li;

            } else if (sum < s) {
                sum = sum + a[j];
                j++;
            }

            else {
              System.out.println(i +" "+sum);
                sum -= a[i];
                System.out.println("                "+s);
                i++;
            }
      


        }

        return li;
    }

}
