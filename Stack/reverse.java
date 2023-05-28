import java.util.Stack;

public class reverse {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String n = "abc";

       for(int i =0;i<n.length();i++){
           s.push(n.charAt(i));
       }
     
      System.out.println( reverse(s ,new StringBuilder()));

    }

    private static String reverse(Stack<Character> s ,StringBuilder sb) {
        if(s.isEmpty())return "";
        
       sb.append(s.pop());
       reverse(s, sb);

       return sb.toString();
    }
}
