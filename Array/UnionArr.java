import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class UnionArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };
        System.out.println(union(arr1, arr2, arr1.length, arr2.length));
    }

    private static ArrayList<Integer> union(int[] arr1, int[] arr2, int l, int l2) {

        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            if (!li.contains(arr1[i])) {
                li.add(arr1[i]);
            }
        }
        for (int i = 0; i < l2; i++) {
            if (!li.contains(arr2[i])) {
                li.add(arr2[i]);
            }
        }
         Collections.sort(li);
       

        return li;
    }

    private static ArrayList<Integer> union1(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (i == 0 || arr1[i] != arr1[i-1]) {
                    result.add(arr1[i]);                                
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (j == 0 || arr2[j] != arr2[j-1]) {
                    result.add(arr2[j]);
                }
                j++;
            } else {
                if ((i == 0 || arr1[i] != arr1[i-1]) && (j == 0 || arr2[j] != arr2[j-1])) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // 
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i-1]) {
                result.add(arr1[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j-1]) {
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }
}
