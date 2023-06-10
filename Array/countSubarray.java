public class countSubarray {
    public static void main(String[] args) {
        int a[] = {2, 3, 5, 8};
        long L = 4, R = 13;
        System.out.println(NumSubArr(a, a.length, L, R));

    }

    public static long NumberOFSub(int[] a, int n, long L, long R) {
        long sum = 0;
        int f = 0, s = 0;
        long count = 0;

        while (f < n) {

            if (s < n && sum <=R ) {
             sum += a[s];
             if(L<=sum && sum <=R)count++;   
             s++;
            }
            else{ 
              f++; 
              s = f;
              sum = 0;
            }
        }

        return count;
    }

    // Approch 2 optimized O(n)

    public static long NumSubArr(int[] A, int N, long L, long R) {
        int i=0,j=0;
        long sum=0;
        long count=0;
        for(i=0;i<N;i++)
        {
            sum+=A[i];
            while(sum>L-1)
            {
                sum-=A[j];
                j++;
            }
            count+=(i-j+1);
        }

        j=0;i=0;
        long count2=0;
        sum=0;
        for(i=0;i<N;i++)
        {
            sum+=A[i];
            while(sum>R)
            {
                sum-=A[j];
                j++;
            }
            count2+=(i-j+1);
        }

        if(count2>=count)
        {
            return count2-count;
        }
        
        return count-count2;
    }
}
