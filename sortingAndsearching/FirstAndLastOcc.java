import java.util.ArrayList;

public class FirstAndLastOcc {
    public static void main(String[] args) {
        int a[] = { 1, 0,0,0,0};

        System.out.println(sort(a,3));
    }

    private static ArrayList<Integer> sort(int[] a,int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<a.length;i++ ){
            if(a[i] == k){
                al.add(i);
                break;
            }
        }

        for(int i=a.length-1;i>=0;i--){
            if(a[i] == k){
                al.add(i);
                break;
            }
        }
         ArrayList<Integer> t = new ArrayList<>();
         t.add(-1);
         return al.size()== 0 ? t : al;
    }
}
