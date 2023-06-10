import java.util.Arrays;

public class ArrayingTheArr {
    public static void main(String[] args) {
        int a[]={0,1,0,2};
        Arr(a,a.length);
    }

    private static void Arr(int[] a, int n) {
        
        Arrays.sort(a);

        int s =0,e=n;
        while(s<e-2){
            int m =s+(e-1)/2;
            if(a[m]<0){
                if(a[m+1]>=0){
                    s=e=m;
                    break;
                }
                s= m+1;
            }
            else if(a[m]>=0){
                if(a[m-1]<0){
                     s=e=m;
                    break;
                }
                e = m;
            }
        }
        System.out.println(s);
    }
}
