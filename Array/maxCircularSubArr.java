public class maxCircularSubArr {
    public static void main(String[] args) {
        int ar[] ={8,-8,9,-9,10,-11,12};
       System.out.println(maxSubArr(ar));
    }

    public static int maxSubArr(int[] ar) {
       if(ar.length ==0)return 0;
       int x = kadane(ar);
       int total =0;
       for(int i=0;i<ar.length;i++){
            total +=ar[i];
            ar[i] *= -1;
            
       }
       int z = kadane(ar);
       if(total+z == 0)return x;

       return Math.max(x , total+z);
     
    }

     public static int kadane(int ar[]) {
        int ms  = ar[0];
        int cs = ar[0];
        for(int i=1;i<ar.length;i++){

            cs += ar[i];

            if(cs < ar[i]){
                cs = ar[i];
            }

            ms = Math.max(cs, ms);
        }
        return ms;
     }
}
