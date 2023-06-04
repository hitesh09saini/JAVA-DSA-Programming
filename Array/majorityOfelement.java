import java.util.Arrays;

public class majorityOfelement {
    public static void main(String[] args) {
        
        int a[]= {3};

         System.out.println(find2(a, a.length));
    }

    public static int find2(int[]a,int n) {
        int so=1;
        int value = a[0];
        for(int i=1;i<n;i++){

            if(value==a[i]){so++;value = a[i];}
            else{ so--;}
            if(so==0){value = a[i];so=1;}
            
        }
       
        so=0;

        for(int x:a)if(x==value)so++;
        System.out.println(so);
        return so>n/2?value:-1;

    }
   

    public static int find(int[] a, int n) {   // O(nlogn)
        Arrays.sort(a);
        int co = 1;
        int max =0;
        int value =-1;
        for(int i=0;i<n-1;i++){
            
            if(a[i]==a[i+1]){
                
               co++;
               
            }  else{

                co=1;
            } 
          

         
          if(max< co){
            max= co;
            value =a[i];
          }
        }
        
     
        return max<n/2?-1:value;

}
       
       
}

