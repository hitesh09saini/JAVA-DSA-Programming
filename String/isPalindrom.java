public class isPalindrom {
  public static void main(String[] args) {
    String s = "";
    StringBuilder st = new StringBuilder(s.substring(0, s.length()));

    if(s.compareTo(st.reverse().toString())==0){
        count++;
    }else{
        System.out.println("not");
    }
  }  
}
