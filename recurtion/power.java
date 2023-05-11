package recurtion;
public class power {
    public static void main(String[] args) {
        int n =2;
        int x =2;
        int ans = x;
        System.out.println(pow(x, n, ans));
    }
    public static int pow(int x ,int n,int ans) {
        if(n==1)return ans;
        return pow(x, n-1, ans*x);
    }
}
