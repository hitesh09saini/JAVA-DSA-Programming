import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class removeReverse {
    public static void main(String[] args) {
        String s ="bbbbb";
        remove(s);
    }

    private static void remove(String s) {
       
        TreeSet<Character>h = new TreeSet<>();
        Stack<Character> stc = new Stack<>();
        for(int i=0;i<s.length();i++){
            h.add(s.charAt(i));
        }
        String st ="";
        for(char m :h){
           stc.push(m); 
        }

        while(!stc.isEmpty()){
            st +=stc.pop();
        }
        System.out.println(st);

    }
}
