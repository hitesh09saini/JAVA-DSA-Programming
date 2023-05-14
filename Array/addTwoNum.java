import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

import java.util.List;


public class addTwoNum {
   public static void main(String[] args) {
        List<Integer> li = new ArrayList<>( Arrays.asList(2,4,3));
        List<Integer> li1 = new ArrayList<>( Arrays.asList(5,6,4));
        
        
        
      print(addTwonumber(li, li1));
        
    
   } 
    //add two number

   public static List<Integer> addTwonumber(List li ,List li1 ) {
    Collections.reverse(li);
    int  a = value(li);
    Collections.reverse(li1);
    int b = value(li1);

    int result = a+b;
    
    return convertIntoList(result);
   }

   // numer convet to list
   
   public static List<Integer> convertIntoList(int re) {
    List<Integer> li = new ArrayList<>( );
    
    while(re>0){
     int a = re%10;
     li.add(a);
     re = re/10;
    }

    return li;
   }

   
  // list convert to number

  public static int value(List li) {
    int value = 0;
    for(int i =0;i<li.size();i++){
       
       value += (int)li.get(i);
       value*=10;
        
    }
    return value/10;
  }

  // print

  public static void print(List li) {

    for(int i =0;i<li.size();i++){
       
     System.out.print(li.get(i)+" ");
         
     }
   }
}
