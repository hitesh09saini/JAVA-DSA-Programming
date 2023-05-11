
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triplateSum {

    public static void main(String[] args) {
        int n[] = { -1, 0, 1, 2, -1, -4 };

        Arrays.sort(n);

        List<List<Integer>> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            if (i== 0 || n[i] != n[i - 1]){
               

            int j = i + 1;
            int k = n.length - 1;

            while (j < k) {
                sum = n[i] + n[j] + n[k];
                if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
                else {
                    List<Integer> inList = new ArrayList<>();
                    inList.add(n[i]);
                    inList.add(n[j]);
                    inList.add(n[k]);
                    list.add(inList);
                   
                    while (j < k && n[j] == n[j + 1]){
                        j++;}
                    while (j < k && n[k] == n[k - 1]){
                        k--;}

                        j++;
                        k--;
                }


            }
        }
        }
        System.out.println(list);
    }
}
