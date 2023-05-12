package recurtion;

public class margeSort {
    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int s = 0, e = arr.length - 1;
        margeSort(arr, s, e);
        Print(arr);
    }

    public static void margeSort(int a[], int s, int e) {
        // base case
        if (s >= e)return;

        // find mid
        int mid = s + (e - s) / 2;
        // left
        margeSort(a, s, mid);
        //right
        margeSort(a, mid + 1, e);
        // marge
        marge(a, s, e, mid);
    }

    public static void marge(int a[], int s, int e, int m) {
        int temp[] = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;
        // marge all element in temp

        while (i <= m && j <= e) {

            if (a[i] < a[j]) 
                temp[k++] = a[i++];
                
             else 
                temp[k++] = a[j++];
               
        }

        // j < e

        while (j <= e)
            temp[k++] = a[j++];
        
        // i < m
        while (i <= m)
            temp[k++] = a[i++];
        

       // copy 
        for( k=0,i=s ;k<temp.length;k++,i++)
             a[i]=temp[k];
            
        

    }

    public static void Print(int a[]) {
      for(int i =0;i<a.length;i++)
        System.out.print(a[i]+" ");
      
    }

}
