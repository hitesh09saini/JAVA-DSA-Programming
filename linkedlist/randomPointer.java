public class randomPointer {
    static class Node{
        int data;
        Node next;
        Node arb;

        Node(int data){
            this.data = data;
            this.next = arb = null;

        }



    }

    public static void main(String[] args) {
        Node head  = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

    

    }

  
}
