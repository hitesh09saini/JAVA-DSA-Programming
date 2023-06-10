import java.util.HashMap;

public class sortArr {
    public static void main(String[] args) {
       int a[] ={1,1,2};
        System.out.println(removeDuplicates(a));
    }
    public static int removeDuplicates(int[] nums) {
        
        HashMap<Integer,Integer> m = new HashMap<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!m.containsValue(nums[j])){

                m.put(j, nums[i]);
                j++;
                
            }
        }
        for(int i=0;i<m.size();i++){
            nums[i] = m.get(i);
        }

        return m.size();
    }
}
