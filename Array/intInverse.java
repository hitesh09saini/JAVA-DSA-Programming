public class intInverse {
    public static void main(String[] args) {
        int a = 1534236469;
        long r=0;
        while(a!=0){
             r = r*10+a%10;
            
            a= a/10;
        }
        if(r>Integer.MAX_VALUE || r<Integer.MIN_VALUE) r=0;

        System.out.println(r);
    }
}
