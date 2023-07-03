import java.util.Arrays;

public class triplateFamily {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};

        System.out.println(TriplateFind(a, a.length));
    }

    private static int TriplateFind(int[] a, int n) {
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
         }System.out.println();
         Arrays.sort(a);
          
         for(int i =0;i<n-2;i++){
             int j = n-1;
            if(a[i]+a[i+1] == a[j]){
                return 1;
            }else{
                
                while(i<j){
                   if(a[i]+a[i+1] == a[j]){
                     return 1;
                    }
                    j--;
                }
            }
         }

        return -1;
    }
}
