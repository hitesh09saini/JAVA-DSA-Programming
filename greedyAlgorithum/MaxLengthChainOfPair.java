package greedyAlgorithum;
import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPair {       // O(nlogn)
 
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};

        findLongestChain(pairs);
    }

    private static void findLongestChain(int[][] pairs) {
          
        int mxAct =0;

       

        Arrays.sort( pairs, Comparator.comparingInt(o->o[1]));
        mxAct =1;
        
        int lastEnd= pairs[0][1];

        for(int i =1;i<pairs.length;i++){
            if(pairs[i][0]>=lastEnd){
                mxAct++;
            
                lastEnd = pairs[i][1];
            }
        }

        System.out.println("Max Chain Length = "+mxAct);

    }

        
}



