public class StackA {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {

            if (isEmpty())
                return -1;
            int top = head.data;

            head = head.next;
          
            return top;
        }

        public static int peek() {
            return head.data;
        }
    }

    public static void main(String[] args) {
           Stack s = new Stack();
           s.push(5);
           s.push(6);
           s.push(9);
           s.push(9);

           while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
           }
    }
}
