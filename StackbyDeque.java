import java.util.Deque;
import java.util.LinkedList;
public class StackbyDeque {
    static class Stack{
     static  Deque<Integer> d = new LinkedList<>();

       public static boolean isEmpty() {
          return d.isEmpty();
       }

        public static void push(int data) {
            d.addFirst(data);
        }

        public static int peek() {
            return d.peek();
        }

        public static int pop() {
            return d.remove();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(6);


        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        
    }
}
