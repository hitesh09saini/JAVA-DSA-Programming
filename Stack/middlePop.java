import java.util.Stack;

public class middlePop {
    
    public static void main(String[] args) {
        Stack<Integer>s1 = new Stack<>();
        Stack<Integer>s2 = new Stack<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        


        while(s1.size() != s2.size()&&s1.size()!= s2.size()+1){
            s2.push(s1.pop());
        }
        s1.pop();
        while(!s2.isEmpty()){
           s1.push(s2.pop());
        }

    }
}
