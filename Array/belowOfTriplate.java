import java.util.Arrays;

public class belowOfTriplate {
    public static void main(String[] args) {
        long a[] = { -2, 0, 1, 3 };
        int n = a.length;
        int sum = 2;

        System.out.println(find(a, n, sum));
    }

    private static long find(long[] arr, int n, int sum) {
        int cnt=0;

        Arrays.sort(arr);
   
         
   
         for(int i=0;i<n-2;i++){
   
           int s=i+1, e=n-1;   
   
           while(s<e){
   
               if(arr[i]+arr[s]+arr[e]<sum){
   
                   cnt+=e-s;
   
                  s++;
   
               }
   
                else{
   
                   e--;
   
                }
           }
   
           
   
         }
   
         return cnt;  
   

        

    }
}
