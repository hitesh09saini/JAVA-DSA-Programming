import java.util.HashSet;

public class smallestPositiveMissNu {
    public static void main(String[] args) {
        int N = 5;
        int arr[] = {0,-10,1,3,-20};
        System.out.println(find(arr , N ));

    }

    private static int find(int[] a, int n) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : a){
            set.add(i);
        }
        
        for(int i= 1;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }

        return n+1;
    }
}
