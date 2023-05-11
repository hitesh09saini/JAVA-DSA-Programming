public class swapbybit {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(" a is " + a + " b is " + b);
        a = a ^ b;
        b = a ^ b;
        a = b ^ a;
        System.out.println(" a is " + a + " b is " + b);
    }
}
