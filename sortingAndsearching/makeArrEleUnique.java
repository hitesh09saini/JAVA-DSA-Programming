import java.util.Arrays;
import java.util.HashMap;

public class makeArrEleUnique {
    public static void main(String[] args) {
        int arr[] = {4, 5, 4, 1, 3, 7, 6, 3, 3};
        Arrays.sort(arr);
      
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
       
        System.out.println(find(arr ,arr.length));
    }

    private static long find(int[] arr, int N) {
        int count =0;
        HashMap<Integer ,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        
        for(int i=0;i<N;i++){
          if(map.containsKey(arr[i])){
            int a = map.get(arr[i]);
            a++;
            map.replace(arr[i],a);

          }else{
            map.put(arr[i], 1);
          }
        }


        for(int i=0;i<N;i++){
            if(map.get(arr[i])>1){
                int a = map.get(arr[i]);
                a--;
                map.replace(arr[i],a);

                
            }
        }
        
        return count;
    }
}
