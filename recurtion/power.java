package recurtion;

import java.util.logging.Handler;

public class power {
    public static void main(String[] args) {
        int n =2;
        int x =2;
        int ans = x;
       System.out.println(power(x, ans));
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

    public static int power(int x ,int n) {
       
      if(n==0)return 1;

      int halfpower = power(x, n/2);
      int halfPowersq = halfpower*halfpower;
      
      // if  n is odd 

      if(n%2!=0){
        halfPowersq*=x;
      }
      return halfPowersq;

    }
} 
