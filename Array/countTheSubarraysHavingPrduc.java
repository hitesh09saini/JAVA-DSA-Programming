public class countTheSubarraysHavingPrduc {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int k =10;

        find2(a ,k);
    }

    private static void find(int[] a, int k) {

        int c=0;
        for(int i=0;i<a.length;i++){
            int  prod = 1;
            for(int j=i;j<a.length;j++){
                prod *= a[j];

                if(prod > k)break;

                c++;   
                
            }
        }

        System.out.println(c);
    }

    public static int find2(int a[],int k) {
        if(k<=1)return 0;
        int prod=1;
        int left =0,right =0,count =0;
        while(right<a.length){
            prod *=a[right];
            while(prod >=k){
                prod /=a[left];
                left++;
            }

            count +=(right -left +1);
            right++;
        }
        System.out.println(count);
        return count;
    }
}
