public class findLengthOf_str {
  public static void main(String[] args) {
    String str = "abcab";
    StringBuilder sb = new StringBuilder(str);
      length(sb ,0);
     
  }

  public static void length(StringBuilder str,int i) {
    if(str.isEmpty()){
        System.out.println(i);
        return;
    }

    str.deleteCharAt(0); 

    length(str,i+1);
    
  }  
}
