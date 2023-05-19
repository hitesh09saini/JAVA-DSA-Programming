package ArrayList;

import java.util.ArrayList;

public class pairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
         int target  = 17;
         
         
         
         System.out.println(pairsum2(list, target));
    }
    
    public static boolean pairsum2(ArrayList<Integer> list, int target) {
       int bp =-1;
       int n = list.size();
       for(int i=0; i<list.size();i++){
        if(list.get(i)>list.get(i+1)){
            bp= i;                   // smallest
            break;
        }
       }
  
       int s = bp+1;  
       int e= bp;            // largest

       while(s!=e){

          if(list.get(s)+list.get(e)==target){

           return true;
          }
          
          if(list.get(s)+list.get(e)<target){
           
          
            s = (s+1)%n;
          
           

          }else{
            e= (e+n-1)%n;

          
          }

       }


    return false;
   }
}


