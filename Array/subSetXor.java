import java.util.ArrayList;

public class subSetXor {

static int max =0;
  public static void main(String[] args) {
    int arr[]= {9,8,5};
    ArrayList<Integer> li = new ArrayList<>();
   System.out.println(find(arr ,0 ,li));
  }

 
  public static int  find(int a[],int i, ArrayList<Integer>list ) {
    if(i==a.length){
        // System.out.println(list);
    xor(list);
    return 0;
    } 
        
        list.add(a[i]);
         find(a, i+1,list);
         list.remove(list.size()-1);
         find(a, i+1, list);

     

    return max;
  }


  public static void xor(ArrayList<Integer>list ) { 
       
          int value = 0;
          for(int i=0;i<list.size();i++){
            value ^=list.get(i);
          }
        max = Math.max(value, max);
     
  }

}
