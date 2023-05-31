package greedyAlgorithum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class sortActivitySection {
  
    public static void main(String[] args) {
        int st[]={1,3,0,5,8,5};
        int en[]={2,4,6,7,9,9};

        int activitys[][] = new int[st.length][3];

        for(int i=0;i<st.length;i++){ 
              activitys[0][0] =0;
              activitys[i][0]= st[i];
              activitys[i][2]= en[i];

        }

        // lambda  function -> shortform
        Arrays.sort(activitys,Comparator.comparingDouble(o -> o[2]));

        int mxAct =0;

        ArrayList<Integer> a = new ArrayList<>();

        mxAct =1;
        a.add(activitys[0][0]);
        int lastEnd= activitys[0][2];

        for(int i =1;i<en.length;i++){
            if(activitys[i][2]>=lastEnd){
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
