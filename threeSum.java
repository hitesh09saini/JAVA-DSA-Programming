import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class threeSum {
    
    public static void main(String[] args) {
        int a[]= {-1,0,1,-1,2,4};
        List<List<Integer>> list = new ArrayList<>();
    

        for(int i =0 ; i<a.length-2;i++){
            for(int j=i+1;j<a.length-1;j++){
                for(int k=j+1;k<a.length;k++){

                    if(a[i]+a[j]+a[k]==0){
                      List<Integer> inList = new ArrayList<>();
                      inList.add(a[i]);
                      inList.add(a[j]);
                      inList.add(a[k]);
                      
                     Collections.sort(inList);
                     list.add(inList);
                    


                    }
                }
            }
        }
     
        List<List<Integer>> newList = list.stream().distinct().collect(Collectors.toList());
        
          System.out.println(newList);
    }
}
