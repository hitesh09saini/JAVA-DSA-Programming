public class numAndDigiSum {
    public static void main(String[] args) {
        int N = 13, K = 2,count =0;

        for (int i = 10; i <= N; i++) {
            int sum = 0;
            int n = i; 
            while (n != 0) {
                sum += n % 10;
                n = n / 10;
            }
        
            if(i-sum >=K)count++;

        }
       System.out.println(count);
    }
}
