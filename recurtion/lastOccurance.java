package recurtion;

public class lastOccurance {

    // Approch 1 
    public static int findApproch1(int a[],int k,int i) {
        if(i<0)return-1;
        
        if(a[i]==k)return i;
        
     
        return findApproch1(a, k, i-1);
    }
    
    // Approch 2
    public static int findApproch2(int a[],int k,int i) {
        if(i==a.length)return-1;
        
        int isFound = findApproch2(a, k, i+1);
        
        if(a[i]==k && isFound==-1)return i;
       
        return isFound;
    
    }

   


    public static void main(String[] args) {
        int arr[]= {8,3,6,9,5,10,2,5,3};
        int key =5;
        int n = arr.length-1;
       System.out.println(findApproch2(arr, key, 0));
       
    }
}
