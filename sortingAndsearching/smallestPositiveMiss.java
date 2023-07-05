import java.util.HashSet;

public class smallestPositiveMiss {
    public static void main(String[] args) {
        int a[] = {0,-10,1,3,-20};

        System.out.println(find(a, a.length));
    }

    private static int find(int[] a, int n) {
        HashSet<Integer> se = new HashSet<>();
        for (int i : a)if(i>0)se.add(i);
        for (int i = 1; i <=n+1; i++)if(!se.contains(i))return i;
    
        return 0;
    }
}
