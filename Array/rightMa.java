public class rightMa {
    public static void main(String[] args) {
        int a[] = {16, 17, 4, 3, 5, 2};

        rightMax(a);
        Print(a);
    }
    public static void rightMax(int a[]) {

       

        for(int i = 0;i<a.length;i++){
            int max = -1;
            for(int j = i+1;j<a.length;j++){
                if(max<a[j]){
                    max = a[j];
                }
            }
            a[i] = max;
        }
    }


   public void nextGreatest(int arr[], int n) {
            // code here
            int finalarr[]=new int [n];

            int largest =arr[n-1];
            for(int i=n-2;i>=0;i--){
                int current=arr[i];
                arr[i]=largest;
                if(current>largest)
                
                largest=current;
            }
            arr[n-1]=-1;
        }
    
    public static void Print(int arr[]) {
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
