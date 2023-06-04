import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArthmeticSubarrays {
    
    public static void main(String[] args) {
        int nums[] = {4,6,5,9,3,7};
        int l[]={0,0,2};
        int r[]={2,3,5};

     System.out.println(checkArithmeticSubarrays( nums,  l, r));

    }


   
    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> li = new ArrayList<>();

          for(int i =0;i<l.length;i++){
            List<Integer>  sub= new ArrayList<>();
            boolean bo = true;
              for(int j=l[i];j<=r[i];j++){
                
                sub.add(nums[j]);

                
             }
             Collections.sort(sub);
            

             for(int j=0;j<sub.size()-2;j++){
              
                int f = sub.get(j+1)-sub.get(j);
                int se = sub.get(j+2)-sub.get(j+1);

                if(f!=se) bo= false;
                
             }

             li.add(bo);

          }


        return li;
    }

}

