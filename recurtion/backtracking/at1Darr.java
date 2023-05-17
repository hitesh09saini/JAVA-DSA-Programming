package recurtion.backtracking;

public class at1Darr {
    public static void main(String[] args) {
        int arr[]= new int [5];
        retur(arr,0);
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void retur(int []arr,int inx) {
         if(inx==arr.length)return;
         arr[inx]=inx+1;
         retur(arr, inx+1);
         arr[inx] = arr[inx]-2; // backtrackig
         

    }
}
