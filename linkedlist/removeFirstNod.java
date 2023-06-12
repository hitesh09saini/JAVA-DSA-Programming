public class removeFirstNod {
    public static class Node{
        int data;
        Node next;

        Node(int data){
          this.data = data ;
          this.next = null;
        }

       
     }

    
    public static void main(String[] args) {
        Node li = new Node(5);
        li.next = new Node(4);
        li.next.next = new Node(3);
        li.next.next.next = new Node(2);
        System.out.println(li);
    }
}
