import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(6);
        s.push(5);
        s.push(1);
        s.push(3);

        reverse(s);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
          }
    }

    

    private static void reverse(Stack<Integer> s) {
       if(s.isEmpty()){
       return;
       }

       int top = s.pop();
     
       reverse(s);
       PushBottom(s, top);


    }
   private static void PushBottom(Stack<Integer> s, int data) {

        // base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        PushBottom(s, data);
        s.push(top);
    }
}
