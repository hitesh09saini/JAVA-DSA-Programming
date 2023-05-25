public class sort012S {
    public static void main(String[] args) {
        int a[] = {2 ,0, 2, 0, 0, 1 ,2, 2, 2, 1, 1,0 };
        sort012(a);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    } 

    public static void sort012(int[] a) {
         
        int c1= 0,c2=0,c3=0;

       for(int i=0;i<a.length;i++){
        if(a[i]==0)c1++;
        if(a[i]==1)c2++;
        if(a[i]==2)c3++;
        }
       System.out.println(c1+" "+c2+" "+c3);

       for(int i=0;i<a.length;i++){
        if(i<c1){
          a[i]=0;
        }
        if(i>=c1&&i<c2+c1){
            a[i]=1;
        }

        if(i>=c2+c1&&i<c3+c2+c1){
            a[i]=2;
        }
        }

      
    }
}
