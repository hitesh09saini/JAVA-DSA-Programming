public class updatebit {
    public static void approch1(int a,int b,int i) {
        
        if(b==0){
            System.out.println(a&~(1<<i));
        }else{
            System.out.println(a|1<<i);
        }

    }

    public static void approch2(int a, int b ,int i) {
        
        int n = a&~(b<<i);

        System.out.println(n|b<<i);
    }
    
    public static void main(String[] args) {
        int a =10;
        int b=1; // b =0 
        int i = 2; // position

        approch2(a, b, i);

        
    }
}
