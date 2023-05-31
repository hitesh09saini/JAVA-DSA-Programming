package greedyAlgorithum;

import java.util.ArrayList;

public class activitySection {
    
    public static void main(String[] args) {
        int st[]={1,3,0,5,8,5};
        int en[]={2,4,6,7,9,9};

        //end time basis sort
        int mxAct =0;

        ArrayList<Integer> a = new ArrayList<>();

        mxAct =1;
        a.add(0);
        int lastEnd= en[0];

        for(int i =1;i<en.length;i++){
            if(st[i]>=lastEnd){
                mxAct++;
                a.add(i);
                lastEnd = en[i];
            }
        }

        System.out.println("max activities = "+mxAct);

        for(int i=0;i<a.size();i++){
            System.out.print("A"+a.get(i)+" ");
        }
        System.out.println();
    }
}
