public class numOccrance {
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key =2;
        findOccrance(arr,0,key);
    }

    public static void findOccrance(int[] arr,int n ,int key) {
       // base case
       if(arr.length==n){
           return;
       }

       // condition
       if(arr[n]==key){
          System.out.print(n+" ");
       }


       // recursion

       findOccrance(arr, n+1, key);

    }

    
}
