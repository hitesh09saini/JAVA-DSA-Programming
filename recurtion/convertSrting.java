package recurtion;

public class convertSrting {
    public static void main(String[] args) {
        int num = 1947;
        String Num[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        convert(num,Num);
    }

    public static void convert(int num,String []Num) {
       // base case
         if(num==0){
            return;
         }
        
       // recursion
        convert(num/10, Num);

        // print string
        System.out.print(Num[num%10]+" ");

    }


}
