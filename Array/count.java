public class count {
    public static void main(String[] args) {
        int a[]={2,3,2,4,25,667,2,3,5};
        System.out.println( majorityElement( a));
       
    }

    public static int majorityElement( int[] A) {
        int arr[]= new int[A.length];
        
        for(int i =0;i<A.length;i++){
            
            int cout =0;
            for(int j =0;j<A.length;j++){
                if(A[i]==A[j]){
                   cout++; 
                }
                
            }
            arr[i]=cout;
            
        }
        
        int max =arr[0]; int inx =0;
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                inx = i;
            }
        }
        
       return A[inx];
    }
}
