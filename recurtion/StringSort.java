package recurtion;

public class StringSort {
    public static void main(String[] args) {
     String arr[] = {"sun","earth","mars","mercury"};
       
        sort(arr,0,arr.length);

    }

    public static void sort(String st[],int s,int e) {
      // base case
      if(s==st.length){
        return;
      }

     int mid =   s+(e-s)/2;

      // recurtion
      sort(st, s, mid);

      sort(st, mid+1 ,e);

      marge(null, null, st, mid);

    }

    public static void marge(String s1,String s2,String arr[], int j) {
        

        for(int i =0;i< Math.min(s1.length(), s2.length());i++){
            if(s1.charAt(i)<s2.charAt(i)){
                 arr[j]=s1;
               break;
            }else if(s1.charAt(i)>s2.charAt(i)){
                arr[j] = s2;
                break;
            }else{

                if(s1.length()<=s2.length()){
                   arr[j] = s1;
                }else{
                   arr[j] = s2;
                }
                break;
            }
            
       }

    }
}
