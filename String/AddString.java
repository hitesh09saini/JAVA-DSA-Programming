import java.util.Stack;

public class AddString {
    public static void main(String[] args) {
        String s = "1000";
        String s2 ="9";
        
       System.out.println( add(s,s2));
    }

    public static String add(String s, String s2) {
       int i = s.length()-1,j =s2.length()-1;
       Stack<String> st = new Stack<>();
       int carry =0,t;
       char v1,v2;
       String ns="";
       int ch = 0;
      
       while(i>=0 || j>=0){
     
           v1 =(i>=0)?s.charAt(i):'0';
           v2 =(j>=0)?s2.charAt(j):'0';
          
            t = v1+v2+carry;

           if((t-106)>=0){
             carry =1;    
             ch = (t-96)%10;
           }else{
             carry =0;
             ch = t-96;
           }
          String c =  ch+"";
          
           st.push(c);
        i--;
        j--;
       }
      if(carry!=0){
        st.push(carry+"");
      }

       while(!st.isEmpty()){
         ns += st.pop();
       }

       return ns;
    }
}
