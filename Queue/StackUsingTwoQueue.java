package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueue {
    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // peek
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    value = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(value);
                }
            } else {
                while (!q2.isEmpty()) {
                    value = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(value);
                }

            }
            return value;
        }

        // pop

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int value = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    value = q1.remove();
                    q2.add(value);
                }
            } else {
                while (!q2.isEmpty()) {
                    value = q2.remove();
                    q1.add(value);
                }

            }
            return value;
        }

    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
      

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
