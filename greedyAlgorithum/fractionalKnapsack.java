package greedyAlgorithum;
import java.util.*;

public class fractionalKnapsack {


    public static void main(String[] args) {
        int value[]= {60,100,120};
        int weight[] ={10,20,30};
         int W =50;

       System.out.println(  Knapsack(value ,weight,W));
    }

  
    private static int Knapsack(int[] value, int[] weight, int w) {
        int ratio[]= new int[value.length];

        // ratio of value and weight
        for(int i=0;i<value.length;i++){
            ratio[i]= value[i]/weight[i];
        }

        // sort
        double activitys[][] = new double[ratio.length][2];

        for(int i=0;i<ratio.length;i++){ 
              activitys[0][0] =i;
              activitys[i][1]= (int) ratio[i];
        }
        
         // lambda  function -> shortform
        Arrays.sort(activitys, Comparator.comparingDouble(o->o[1]));

         int capacity= w;
         int finalValue = 0;

         for(int i= activitys.length-1;i>=0;i--){
            int inx =(int)activitys[i][0];

            if(capacity >= weight[i]){
                finalValue +=value[inx];
                capacity -= weight[inx];
        
            }else{
                finalValue += (activitys[i][1]*capacity);
                capacity =0;
                break;
            }


         }
        return finalValue;

    }
}
