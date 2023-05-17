package recurtion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class nextpermutation {
    public static void main(String[] args) {
        int givArr[]={1,2,3};

        nextpermutation(givArr, 0);
    }
    public static void nextpermutation(int arr[], int N ) {
        
       List<Integer> list  = new ArrayList<>();
        // base case 
        if(arr.length-1==n){
            Print(list);
            return ;
        }

        // recurtion
        for(int i = 0;i<arr.length;i++){
            int value = arr[i];
            list.remove(i);
            int newarr[] = convert(list, list.size());
            nextpermutation(newarr, n+value);   // calling function
            
        }

    }

    public static int[] convert(List<Integer> li, int n) {
        int arr[]=new int[n];
        for(int i =0;i<li.size();i++){
           arr[i] = li.get(i);
        }
        return arr;
        
    }

    public static void Print(List<Integer> li) {
        for(int i =0;i<li.size();i++){
            System.out.print(li.get(i)+" ");
        }
        
    }
}
