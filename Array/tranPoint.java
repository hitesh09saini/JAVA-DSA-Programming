public class tranPoint {

    public static void main(String[] args) {
        
        int arr[] = { 0,0,0,0,1};

        System.out.println(find(arr, arr.length));
    }

    private static int find(int[] arr, int n) {
        int low=0,high=n-1,ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==1){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]==0){
                low=mid+1;
            }
        }
        return ans;
    }

}
