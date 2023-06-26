package sortingAndsearching;

public class findNum {
    public static void main(String[] args) {
        int a[] ={1,2,3,4,6};
      System.out.println( find(a, 6, a.length));
    }
    public static int find(int arr[],int k,int n) {
         int s =0,e = n,m=0;
        // Your code here
        
        while(s<e){
           m = (s+e)/2;
           
           if(arr[m]==k){
               return 1;
           }
           else if(arr[m]>k){
               e = m;
           }
           else{
               s = m;
           }
        }
        return -1;
    }
}
