public class perfectSquere {
   
   public static void main(String[] args) {
         long n = 5;
 
         long s =0;
         long e = n;
         long ans =-1;
         
         
         while(s<=e){
             long m = s+(e-s)/2;
             
             long sq = m*m;
             
             if(sq == n){
                System.out.println(m);
                break;
             }

             if(sq < n){
                 ans = m;
                 s = m+1;
             }else{
                 e = m -1;
             }
  
         }
         
        System.out.println(ans);
   }
       
}
