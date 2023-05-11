public class maxProdSub {
    

    public static void main(String[] args) {
        int arr[] = {4,-2,3,2};
        Arroch1(arr);
      
    }


    // Brute force solution


    public static void Bruteforce(int []arr) {
        int Product  = Integer.MIN_VALUE;
        for(int  i =0 ;i <arr.length;i++){
               int max = 1;

            for(int  j =i ; j<arr.length ; j++){
                 
                max *= arr[j];
        
                Product  = Math.max(max, Product);


            }
        }
        System.out.println(Product);
    }


    // second approch  O(n)

    public static void Arroch1(int arr[]) {
        
        int ans = 0;
        int ma  = arr[0];
        int mi = arr[0];

        for(int  i =1; i<arr.length ; i++){

            if(arr[i]< 0){
                
                int t =ma;
                ma = mi;
                mi = t;
            }

            ma = Math.max(arr[i], ma*arr[i]);
            mi = Math.min(arr[i], mi*arr[i]);

            ans = Math.max(ma, ans);
        }
        System.out.println(ans);
    }


    // Approch  2  O(n)


}
