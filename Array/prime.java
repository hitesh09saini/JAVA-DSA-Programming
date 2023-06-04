import java.util.Arrays;

public class prime {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    private static int countPrimes(int n) {
        int p =0;
        boolean b[] = new boolean[n+1];
        Arrays.fill(b,true);
        
        for(int i =2;i*i<=n; i++){
            for(int j =i*2;j<=n;j+=i){
                b[j] = false;
            }
        }
        for(int i =2;i<n;i++){
          if(b[i]){
            p++;
          }
       }

      
       return p;
    }
   
}
