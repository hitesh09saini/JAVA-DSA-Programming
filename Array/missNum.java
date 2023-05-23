import java.util.Arrays;

public class missNum {
    public static void main(String[] args) {
        
        int a[]={1,5,3,2};
        int n = 4;
        
        System.out.println(missingNumber(a, n));
    }


    public static int missingNumber(int a[], int n)
    {    Arrays.sort(a);
         // Your code goes here
         for(int i=1,j=0;j<a.length ;i++,j++){
  
            if(a[j]!=i)return i;
    
         }
         return n;
    }


    // one approch

    // easy approch 
    // total sum of n numbers - sum current array numbers

    public static int missingNumber1(int A[], int N)
    {   
        int nu=N*(N+1)/2;
        int sum=0;
        for(int i=0;i<N;i++){
            sum +=A[i];
        }
          return nu-sum;
    }
        

}
