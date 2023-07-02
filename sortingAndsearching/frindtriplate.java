import java.util.ArrayList;
import java.util.Arrays;

public class frindtriplate {
    public static void main(String[] args) {
        int a[] = {0,-1,2,-3,1};
        
        find(a,a.length);
    }

    private static void find(int[] a, int n) {
        Arrays.sort(a);
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for(int i:a){
            if(i >=0){
                a1.add(i);
            }else{
                a2.add(i);
            }
        }
      
      System.out.println(a2);


    }
}
