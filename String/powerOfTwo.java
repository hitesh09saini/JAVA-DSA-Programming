public class powerOfTwo {
    

    public static void main(String[] args) {
        int n = 2; 

        
         System.out.println(isPower(n));
    }

    // bit manipuation

    public static boolean isPower(int n) {
        if((n&n-1)==0)return true;

       return false;
    }


    // brute force

    public static boolean isPowerOfTwo(int n,int i) {
      
        double p =Math.pow(2, i);

        // base case
        if(n<p||n==0)return false;

        if(n==1||n==p)return true;
       
      
       return isPowerOfTwo(n,i+1);
        
       
     }

     // 
}
