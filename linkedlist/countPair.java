import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

import hashing.hashSet;

public class countPair {
    public static void main(String[] args) {
        Integer a[] ={1,2,3,4,5,6};
        Integer  b[] = {11,12,13};
       LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(a));
       LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(b));
        int x = 15;
       Collections.sort(l1);
       Collections.sort(l2);
       
       int count =0;
       for(int i=0;i<l1.size();i++){
           
           for(int j=0;j<l2.size();j++){
             
             if(l1.get(i)+l2.get(j)==x){
                 count++;
             }
            }
       }

   
       System.out.println(count);
    }
}
