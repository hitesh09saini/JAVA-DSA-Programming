package ArrayList;


import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       list.add(3);
       list.add(3);
       list.add(50);

      int a= list.get(1);

      list.remove(1);
      System.out.println(list);

      list.set(1, 80);
      System.out.println(list);

      System.out.println( list.contains(2));
      
      list.add(1, 5);
      System.out.println(list);

      Collections.sort(list, Collections.reverseOrder());

      System.out.println(list);
    }
}
