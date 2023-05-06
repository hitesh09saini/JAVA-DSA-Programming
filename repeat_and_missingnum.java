import java.util.Arrays;

public class repeat_and_missingnum {

    public static void main(String[] args) {
        int arr[] = {1,5,2,1,3,4,8,7};
        Arrays.sort(arr);
        
        int newArr[] = new int[2];
        
        Approch2(arr, newArr);

        System.out.print("[");
        for (int i = 0; i < 2; i++) {
            System.out.print(" " + newArr[i] + " ");
        }
        System.out.print("]");
    }


    // Approch 1 ;   time Comlextity O(nlogn);

    public static int[] Approch1(int arr[] , int newArr[]) {
       
        int orignalSum = 0;
        int GivenArrsum = 0;
        int repeatEle = 0;

       
        for (int i = 0; i < arr.length - 1; i++) {
            orignalSum+=i+1;
            
            if (arr[i] == arr[i + 1]) {
                repeatEle = arr[i];
            } 

            GivenArrsum += arr[i];

        } orignalSum +=arr.length;
          GivenArrsum += arr[arr.length-1];

        
        

        int findMissEle = (orignalSum) - (GivenArrsum-repeatEle);
       
        
       
        newArr[0]=repeatEle;
        newArr[1]=findMissEle;

        return  newArr;
    }


    // Approch 2  time Comlextity O(n);

    public static int[] Approch2(int arr[] ,int newArr[]) {
       
        int repeatEle = 0;
        int MissEle =0;
        int tempArr[]= new int[arr.length];
        int b =0;
        for(int  i =0 ;i < arr.length ; i++){
           if(b!=arr[i]){
           tempArr[arr[i]-1]=-1;
           b = arr[i];
           }else{
             repeatEle = arr[i];
             
           }
          System.out.print(tempArr[i]+" ");
        }
        

        newArr[0]=repeatEle;
        newArr[1]=MissEle;

        return  newArr;
    }


    // Approch3


    public static int[] Approch3(int arr[] ,int newArr[]) {
        
        int repeatEle = 0;
        int findMissEle =0;




        newArr[0]=repeatEle;
        newArr[1]=findMissEle;

        return  newArr;
    }



    // Approch4  // brute force  time complextity O(n)

    public static int[] Approch4(int arr [], int newArr[]) {
        int repeatEle = 0;
        int MissEle =0;
        
        for(int i =0; i<arr.length;i++){
            int count =0;
            
              
                if((i+1)!=arr[i]){
                    MissEle = i+1;
                }
               

      
        }

        newArr[0]=repeatEle;
        newArr[1]=MissEle;

        return  newArr;
    }

}