package ArrayList;

import java.util.ArrayList;

public class threeArrlist {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> mai = new ArrayList<>();

    ArrayList<Integer> li = new ArrayList<>();
    ArrayList<Integer> li1 = new ArrayList<>();
    ArrayList<Integer> li2 = new ArrayList<>();
    
    for(int i =0; i<3;i++){
        li.add(i*1);
        li1.add(i*2);
        li2.add(i*4);
    }
    ArrayList<ArrayList<Integer>> sec  = new ArrayList<>();

    
     sec.add(li);
     sec.add(li2);
     sec.add(li1);

     mai.add(sec);

     ArrayList<ArrayList<Integer>> sec1  = new ArrayList<>();

    
     sec1.add(li);
     sec1.add(li2);
     sec1.add(li1);

     mai.add(sec1);


     System.out.println(mai);

     
    }
}


