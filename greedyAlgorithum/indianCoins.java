package greedyAlgorithum;

import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void main(String[] args) {
        Integer coins[]= {1,2,5,10,20,50,100,500,2000};
        int value = 121;
        Arrays.sort(coins ,Comparator.reverseOrder());
        IndianCoins(coins ,value);
    }

    private static void IndianCoins(Integer[] coins, int value) {
        
        int total = 0;
      

            for(int i= 0;i<coins.length;i++){
                   
                if(value >= coins[i]){
                    while(coins[i]<= value){
                        total++;
                        value -= coins[i];
                        System.out.print(coins[i]+" ");
        
                    }
                }
            }
          
        System.out.println("\n\n"+total+" "+value);
    }
}
