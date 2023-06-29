public class FloorinaSortedArray {
    public static void main(String[] args) {
        int a[]= {1,2,8,10,11,12,19};
        System.out.println(search(a,19));
    }

    private static int search(int[] a,int k) {
     int m ,s=0,e = a.length-1;
       
        while(s<=e){
            m = s+(e-s)/2;

            if(a[m]>k){
             e = m-1;
            }else if(a[m]<k){
             s = m+1;
            }else{
                return m;
            }

        }
        
        if(e < 0)return -1;

        return e;
        
    }
}
