public class clearRangevalue {
    
    public static void main(String[] args) {
        int a = 10;
        int i=2 ,j=4;

        int  b= -1<<j+1|(int) Math.pow(2, i)-1;
      
        System.out.println(a&b);
       
    }

}
