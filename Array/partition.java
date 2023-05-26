public class partition {
    public static void main(String[] args) {
        int A[] = {87,78 ,16 ,94};
        int a = 36,b=72;
        set(A,a ,b);
        Print(A);
    
    }

    private static void set(int[] a, int s ,int e) {
       int n = a.length;
       int A[] = new int[n];
       int j=0;
        for(int i=0;i<n;i++){
            if(a[i]<s)A[j++] = a[i];      
        }

        for(int i=0;i<n;i++){
            if(a[i]>=s&&a[i]<=e) A[j++] = a[i];    
        }

        for(int i=0;i<n;i++){
            if(a[i]>e)A[j++] = a[i];
           
        }
  
        
    
         for(int i=0;i<n;i++){
            a[i]=A[i];
          }
    }

    public static void Print(int a[]) {
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
        }
    }
}
