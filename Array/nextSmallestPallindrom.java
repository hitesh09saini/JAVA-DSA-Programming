import java.util.Vector;

public class nextSmallestPallindrom {
    public static void main(String[] args) {
        int a[] = { 3 ,3  ,3};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println("\n\n\n\n");

        Vector<Integer> v = nextPallindrom(a, a.length);

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
    }

    public static Vector<Integer> nextPallindrom(int[] a, int n) {
        Vector<Integer> v = new Vector<>();

        if(IsPalindrom(a,n)){
            if(n==1){
                a[0]++;
            }else if(n==2){
                 a[0]++;
                 a[1]++;
            }
            else{
                int m =n/2;
              if(n%2==0){
                 a[m-1]++;
                 a[m]++;
              }else{
                  a[m]++;
              }
              

            }
         }
        else{

            int s = 0, e = n - 1;
            while (s < e) {

                if (a[s] > a[e]) {

                    a[e] = a[s];

                } else if (a[s] < a[e]) {
                    a[e] = a[s];
                    a[e - 1] = 1 + a[e - 1];

                    if (a[e - 1] >= 10) {
                        a[e - 1] = 0;
                        a[e - 2] = a[e - 2] + 1;

                    }
                    if (a[s] > a[e]) {
                        a[e] = a[s];
                    }
                }

                s++;
                e--;
            }
        }

        for (int i = 0; i < a.length; i++) {
            v.add(a[i]);
        }

        return v;
    }
    
   public static boolean IsPalindrom(int a[],int n) {
    int s=0,e=n-1;
    while(s<e){

         if(a[s]!=a[e]){
            return false;
         }
       s++;
       e--;
    }

    return true;
   }
}
