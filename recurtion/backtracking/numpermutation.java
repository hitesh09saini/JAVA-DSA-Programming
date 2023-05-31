package recurtion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class numpermutation {
    public static void main(String[] args) {
        int givArr[]={1,2,3};
       

      System.out.println(permute(givArr));
         
    }
   
        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>>res= new ArrayList<>();
             boolean[] visited = new boolean[nums.length];
             List<Integer> curr = new ArrayList<>();
             backtrack(res,nums,curr,visited);
            return res;
        }
        
         static void backtrack(List<List<Integer>> res,int[] nums, List<Integer> curr, boolean[] visited){
                    if(curr.size()==nums.length){
                     res.add(new ArrayList<>(curr));
                     
                        return;
                    }
                  
                   
                    for(int i=0;i<nums.length;i++){
                        if(!visited[i]){
                        curr.add(nums[i]);
                        visited[i] = true;
                        backtrack(res,nums, curr,visited);
                        curr.remove(curr.size()-1);
                        visited[i] = false;
                        }
                    } 
        }
    

}
