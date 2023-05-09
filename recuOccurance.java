public class recuOccurance {
    public static int firstOccurance(int na[],int k,int i) {
        if(na[i]==k) return i;
       
        if(i==na.length-1)return -1;
  
        return firstOccurance(na, k, i+1);
    }
    
    public static void main(String[] args) {
        int arr[]= {8,3,6,9,10,2,3};
        int key = 5;
        System.out.println(firstOccurance(arr, key,0));
    }
}
