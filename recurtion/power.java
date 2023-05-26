package recurtion;

import java.util.logging.Handler;

public class power {
    public static void main(String[] args) {
        int n =2;
        int x =4;
   
       System.out.println(power(n, x ));
    }
    public static int pow(int x ,int n,int ans) {
        if(n==1)return ans;
        return pow(x, n-1, ans*x);
    }

    public static int  pow1(int x,int n ) {
        if(n==0)return 1;

        return x*pow1(x, n-1);
       }

    //approch 3  O(logn)
    static long mod = 1000000007L;  

    public static long power(int n,int r)

    {

        if(r == 0)return 1;
        if(r%2 == 0)return power(n*n, r/2)%mod;
        else return (n*power(n, r-1)%mod);
    }
} 
