public class reorderList {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data =data;
            this.next = null;
        }
    }

    public static void print(Node head){
        while(head != null){
            System.out.print("{"+head.data+"}-->");

            head = head.next;

        }System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        print(head);
      
        reverse(head);
        print(head);
    }
    public static Node reverseBetween(Node head, int m ,int n){
        
    }
    public static void reverse(Node head) {
        Node prev = null;
        Node curr =  head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

     

}