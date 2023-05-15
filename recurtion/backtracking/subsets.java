package recurtion.backtracking;

public class subsets {  
// if input String "abc" { a b c ab ac bc abc  }  2^n  n= string.length()
    public static void main(String[] args) {
        String str = "abc";
        subSet(str," ",0);
    }
    public static void subSet(String st, String ans, int inx) {
      // base case
        if(st.length()==inx){
            System.out.println(ans);
            return;
        }
 
      // yes choice
       subSet(st, ans+st.charAt(inx), inx+1);
       // no  choice
       subSet(st, ans, inx+1);
       

    }
}
