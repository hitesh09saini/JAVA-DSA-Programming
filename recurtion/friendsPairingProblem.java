package recurtion;
 

public class friendsPairingProblem {

    public static int friendsPair(int n) {
        // base condition
        if(n==1||n==2||n==0){
            return n;
        }
        
        // // single choice
        // int fnm1 = friendsPair(n-1);
        
        // // pair 
        // int fnm2 = friendsPair(n-2);
        // int pairways = (n-1)*fnm1;

        // // total ways
        // int totWays = fnm1+pairways;

        return friendsPair(n-1)+(n-1)*friendsPair(n-2);

    }
    
    public static void main(String[] args) {
        System.out.println(friendsPair(4));
    }
}
