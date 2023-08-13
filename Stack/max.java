public class max {
    public static void main(String[] args) {
        int a1[] = {4,7},a2[] ={10},a3[] = {1,2,3};
        System.out.println(maxEqualSum(a1.length,a2.length,a3.length,a1,a2,a3));
    }
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        
       int min =0;
       int t1 =0,t2 =0,t3 =0;
       for(int i =0;i<N1;i++){
         t1+=S1[i];
       }
       for(int i =0;i<N2;i++){
         t2+=S2[i];
       }
       for(int i =0;i<N3;i++){
         t3+=S3[i];
       }
       
       min = Math.min(t1, Math.min(t2,t3));
       
       int i=0,j=0,k=0;
       while(true){
           if(min<t1){
              t1 = t1-S1[i];
              i++;
           }else if(min>t1){
               min = t1;
           }
           
           if(min<t2){
              t2 = t2-S2[j];
              j++;
           }else if(min>t1){
               min = t1;
           }
           
           if(min<t3){
               t3 = t3-S3[k];
               k++;
           }else if(min>t1){
               min = t1;
           }
           
           if(t1 == t2 && t2 == t3)return t1;
       }
    }
}
