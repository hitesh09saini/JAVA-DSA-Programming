public class getITHbit {
    public static void main(String[] args) {
        int a =4;
        int b =2;
        
         
        if((a & 1<<b)==0){
           System.out.println("0");
        }else{
            System.out.println("1");
        }
    }
}
