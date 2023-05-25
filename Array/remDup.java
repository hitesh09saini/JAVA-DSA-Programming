import java.util.ArrayList;

public class remDup {
    
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,3,3,3,4,4,5,5,9};
        int n =remove_duplicate(arr, arr.length);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

   
   public static  int remove_duplicate1(int A[],int N){
        // code here
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int j=0;
        for(int i=0;i<N;i++){
          if(!ans.contains(A[i])){
              ans.add(A[i]);
              A[j]=A[i];
              j++;
        
        }
        }
     return j+1;  
    }


    
      public static  int remove_duplicate(int A[],int N){      
          
          int j=0;
            for(int i=0;i<N;i++){
                if(A[i]!=A[j]){
                   
                    j++;
                    A[j]=A[i];
                   
                }
            }
            
            
            
            return j+1;
        }

}
