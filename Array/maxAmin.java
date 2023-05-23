public class maxAmin {
    
    public static void main(String[] args) {
        long arr[] = {3, 2, 56, 10000, 167,1};

        long n = arr.length;

       
        pair p = find(arr, n);
     
        System.out.println(p.first + " "+p.second);

    
    }

   


 

   static pair find(long a[] , long n ) {
        
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(int i =0;i<n;i++){
            if(a[i]>max){
                max = a[i];
            }

            if(a[i]<min){
              min = a[i];
            }
        }
      
       return new pair(min, max);
     
    }
    
}

class pair{
  long second ,first;
    public pair(long first ,long second) {
        
        this.first = first;
        this.second = second;
    }
   

}