import java.util.ArrayList;
import java.util.Arrays;

public class sortArrayAccordtoOther {
    public static void main(String[] args) {
        int A1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int A2[] = {2, 1, 8, 3};

       int ans[]= set(A1 ,A2 ,A1.length ,A2.length);

        // for(int i=0;i<ans.length;i++){
        //     System.out.print(ans[i]+", ");
        // }System.out.println();
    }

    private static int[] set(int[] A1, int[] A2, int N, int M) {

        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                if(A1[j]==A2[i]){
                    a.add(A2[i]);
                    
                    A1[j]=-1;
                }
            }
        }  
 
        Arrays.sort(A1);

        for(int i=0;i<N;i++){
            if(A1[i]>-1){
                System.out.println(A1[i]);
                a.add(A1[i]);
            }
        }


        int ans[]=new int[a.size()];

        for(int k=0;k<a.size();k++){
            ans[k]=a.get(k);
        }
        return ans;
    }

}