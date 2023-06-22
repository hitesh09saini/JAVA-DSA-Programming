public class minimumDays {
    public static void main(String[] args) {
        String s ="tttt";
        int n = 4;
        int a[]={2,1,3,0};

       System.out.println(form(s, n, a));
    }

    private static int  form(String s, int n, int[] a) {
        int count =0;
        
        char []arr = s.toCharArray();

        for(int i=0;i<n-1;i++){

            while(arr[i+1]==arr[i]&&arr[i]!='?'){
                  arr[a[count++]]='?';

            }
        }

        return count;
    }
}
