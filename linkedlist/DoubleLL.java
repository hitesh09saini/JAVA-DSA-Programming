public class DoubleLL {
     class Node{
        Node next;
         int data;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next =null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return ;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
   
   // print
   public  void Print() {
    Node temp = head;
   
    while(temp != null){
        System.out.print(temp.data+"<->");
        temp = temp.next;
    }System.out.print("null");
   }
   
    // remove

      
   

   

    
    public static void main(String[] args) {
        DoubleLL dll =new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(6);
        dll.addFirst(8);

        dll.Print();

    }
}
