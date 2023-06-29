public class redixSort {
    public static void main(String[] args) {
        int arr[] = {1, 9, 345, 2};
        radixSort(arr,arr.length);
    }

  
    static void radixSort(int arr[], int n) 

    { 

        // code here 

        int max=0;

        for(int i=0;i<n;i++){

            if(arr[i]>max){

                max=arr[i];

            }

        }

        for(int exp=1;max/exp>0;exp*=10){

            countSort(arr,n,exp,max);

        }

    }

    

    static void countSort(int arr[],int n,int exp,int max){

        int[] count=new int[1000000];

        int[] out=new int[n];

        

        for(int i=0;i<1000000;i++){

            count[i]=0;

        }

        for(int i=0;i<n;i++){

            count[(arr[i]/exp)%10]++;

        }

        for(int i=1;i<1000000;i++){

            count[i]=count[i-1]+count[i];

        }

        for(int i=n-1;i>=0;i--){

            out[count[(arr[i]/exp)%10]-1]=arr[i];

            count[(arr[i]/exp)%10]--;

        }

        for(int i=0;i<n;i++){

            arr[i]=out[i];

        }
    }
}
