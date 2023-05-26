import javax.sound.sampled.SourceDataLine;

public class altPosiandNeg {
    public static void main(String[] args) {
        int Arr[] = {-5 ,-2, 5, 2, 4, 7, 1, 8, 0, -8};
        set(Arr,Arr.length);
        Print(Arr);
    }

    private static void set(int[] a, int n) {
        int f=0,s=0;
        for(int i =0 ;i<a.length;i++){
            if(a[i]<0)f++;
            else s++;
         }
         

        int na[] = new int[f];
        int po[]= new int[s];
        // aux Array
        
        for(int i =0,j=0 ,k=0;i<a.length;i++){
           if(a[i]<0){
            na[j]= a[i];
            j++;
           }
           else{
            po[k] = a[i]; 
            k++;
           }
        }
        
        int mi = Math.min(f, s);
        for(int i =0,j=0,k=0;i<mi*2;i++){

            if(i%2==0){
                a[i]= po[j];
                j++;
            }else{
                a[i]=na[k];
                k++;
            }
        }
        if(f>s){
         for(int i=mi*2,j=mi;i<n;i++){
            a[i] = na[j];
            j++;
         }


        }else{
            for(int i=mi*2,j=mi;i<n;i++){
                a[i] = po[j];
                j++;
             }
        }
        
     
    }


    public static void Print (int arr[]) {
       for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
       }
     }
}
