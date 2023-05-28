import java.util.ArrayList;

public class StackB {
    static class Stack {
        public static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;

        }

        // push
        public static void push(int e) {
            list.add(e);
        }

        // pop
        public static int pop() {

            if(isEmpty())return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
            Stack s = new Stack();
            s.push(5);
            s.push(6);
            s.push(8);
            s.push(9);


            while(!s.isEmpty()){
                System.out.print(s.pop()+"  ");
            }
    }

}