package ArrayList;

import java.util.ArrayList;

public class twoDarray {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

          ArrayList<Integer> list  = new ArrayList<>();
          ArrayList<Integer> list1  = new ArrayList<>();
          ArrayList<Integer> list2  = new ArrayList<>();
          list.add(4);
          list.add(7);
          list.add(9);

          list1.add(4);
          list1.add(7);
          list1.add(9);

          list2.add(4);
          list2.add(7);
          list2.add(9);
          mainlist.add(list);
          mainlist.add(list1);
          mainlist.add(list2);

          System.out.println(mainlist);

    }
}
