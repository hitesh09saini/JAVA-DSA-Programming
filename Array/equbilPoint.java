public class equbilPoint {
    public static void main(String[] args) {
        int a[] = { 1, 3, 5, 2, 2 };
       
        System.out.println(find(a, a.length));

    }
    //good Approch 

    public static int Approch(int a[] ,int n) {
        int l=0,r=0;
        int i=0,j=n-1;
        while( i<=j)
        {
            if( l==r && i == j )
            return i+1;
            
            if( l<r )
            {
                l+=a[i];
                i++;
            }
            else
            {
                r+=a[j];
                j--;
            }
           
        }
        return  -1;
    }


    // brute force

   public static int find(int[] a, int l) {
        if (l == 1) return 0;
          int ls=0;
          int i=0;
        while( i < l) {
             
            if (ls == rs(i + 1, l, a)) {
                return i;
            }
            i++;
            ls +=a[i-1];
        }

        return -1;
    }

    public static int rs(int i, int l, int[] a) {
        int sum = 0;
        while (i < l) {
            sum += a[i];
            i++;
        }
        return sum;
    }

   

}
