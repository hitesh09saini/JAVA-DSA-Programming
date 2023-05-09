public class recuProblem1 {
    
    public static void main(String[] args) {
        Print(10);
    }

    public static void Print(int a) {
        
        if(a==0){
            return;
        }
        // System.out.println(a);  for 10 --- 1
        Print(a-1);
        System.out.println(a);   // for 1 --- 10
    }
}
