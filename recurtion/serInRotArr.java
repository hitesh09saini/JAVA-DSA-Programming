package recurtion;

public class serInRotArr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1 };
        int t = 9;

        System.out.println(findTarget(arr, t, 0, arr.length));
    }

    public static int findTarget(int[] arr, int t, int s, int e) {
        int m = (s+e)/2;
        int inx =0;
       
         if(arr[0]==t){
            return 0;
         }
        else if (arr[0] > t) { // check less then

          inx=   index(arr, t, m+1, e-1);// for right

        } else if (arr[0] <= t) {

          inx=   index(arr, t, s, m);  // for left

        }

        return inx;
    }

    public static int index(int[] arr, int t, int s, int e) {

        if (s > e) {

            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == t) {
            return m;
        }

        else if (arr[m] > t) {
            index(arr, t, s, m - 1);

        } else {
            index(arr, t, m + 1, e);

        }

        return -1;
    }

}
