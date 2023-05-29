public class transpose {
    public static void main(String[] args) {
        long a[]={4,0,2,1,3};
        int n =a.length;
        long b[]=new long[n];
        
        for(int i =0;i<n;i++){
            

            b[i] =a[(int)a[i]] ;
           
        }
        for(int i=0;i<n;i++)
        {
          System.out.print(b[i]+" ");
        }
    }
}
