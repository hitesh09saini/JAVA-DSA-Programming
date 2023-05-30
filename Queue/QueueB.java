package Queue;


// Queue by linkedlist

public class QueueB {
    static class Node{
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    static class Queue{
         static Node head =null;
         static Node tail =null;

        public static boolean isEmpty() {
            return head==null&&tail==null;
        }

        public static void add(int data) {
            Node ne = new Node(data);
            if(head==null){
                head = tail = ne;
                return;
            }
            tail.next = ne;
            tail = ne;
        }
      
        public static int remove() {
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            int front = head.data;

            if(tail == head){
                tail = head= null;
            }else{
            head = head.next;
            }
            return front;
          
        }

        public static int peek() {
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(9);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
