public class recuProblem3 {
    // print sum for N natural numbers

    public static void sum(int n ,int ans) {
       
       if(n==0){ 
       System.out.println(ans);
       return;
       }
        
        ans +=n;
       
        sum(n-1,ans);
        
        
        
    }
    
    public static void main(String[] args) {
       sum(5,0);
   }

} 
