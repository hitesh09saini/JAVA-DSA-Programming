public class binarySorting {
    public static void main(String[] args) {
        int Arr[] ={1,0,0,1,1,1,1,0};
        int n = Arr.length;
        sort(Arr , n);
    }

    static void sort(int[] a ,int n) {
        int c =0;
        for(int i=0;i<n;i++){
          if(a[i]==0){
            c++;
          }
        }

        for(int i=0;i<c;i++){
            a[i] =0;
        }
        for(int i=c;i<n;i++){
            a[i]=1;
        }

        for(int i=0;i<n;i++){
           System.out.print(a[i]);
        }
    }
}
