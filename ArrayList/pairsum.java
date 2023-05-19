package ArrayList;

import java.util.ArrayList;

public class pairsum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<7;i++){
            list.add(i);
        }

        int target = 5;
       System.out.println( pairsum2(list, target));

       
    }

    



    // Approch 2

    public static boolean pairsum2(ArrayList<Integer> list, int target) {
         int s =0,e = list.size()-1;
        while(s<e){
           if(list.get(s)+list.get(e)==target){

            return true;
           }else if(list.get(s)+list.get(e)>target){

            e--;

           }else{
             s++;
           }

        }


     return false;
    }


    // brute force  Approch 1

    public static boolean pairsum1(ArrayList<Integer> list, int target) {
         
        
      
        for(int i=0;i<list.size();i++){
            for(int j=1+i;j<list.size();j++){
            if(list.get(i)+list.get(j)==target){
               return true;

            }
            
        }


    }

 return false;
}
}