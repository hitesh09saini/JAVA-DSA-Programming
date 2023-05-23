package recurtion;

import java.util.logging.Handler;

public class power {
    public static void main(String[] args) {
        int n =361;
        int x =163;
   
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

        if(r == 1){

            return n;

        }

        if(r%2 == 0){

            long temp = power(n, r/2)%mod;

            return ((temp*temp)%mod);

        } else {

            return (n*power(n, r-1)%mod);

        }

    }
} 
