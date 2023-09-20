
public class encapsulation {
    static int x =0;
       static boolean in(){
        x++;
        return true;
      }
   
    public static void main(String[] args) {
        if(in()|in()||in()){
            x++;
            System.out.println(x);
        }
     
    }
   
}
