public class givenSumPair {
    public static void main(String[] args) {
        int arr[]={11,15,6,8,9,10};
        int key = 16;
        boolean b = false;
        for(int  i= 0;i<arr.length;i++){
            for(int j =i+1; j <arr.length;j++){
                int ans = arr[i]+arr[j];
                if(ans==key){
                   b=true;
                   break;
                }
                
                
            }
        }
        System.out.println(b);
    }
}
