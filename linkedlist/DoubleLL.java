public class DoubleLL {
    class Node {
        Node next;
        int data;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    // print
    public void Print() {
        Node temp = head;
        System.out.print("null<->");
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null\n\n");
    }

    // remove

    public int removeFirst() {
        size--;
        if (tail == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int v = head.data;
            head = tail = null;
            return v;
        }

        int v = head.data;

        head = head.next;
        head.prev = null;

        return v;
    }

    public int removeLast() {
        size--;
        if (tail == null) {
            System.out.println("DLL is empty");

            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int v = head.data;
            head = tail = null;
            return v;
        }

        int v = tail.data;
        tail = tail.prev;
        tail.next = null;

        return v;

    }

    // reverse linkedlist
    public void ReverseLL() {

        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

     

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(1);
        
        dll.Print();

        DeleteAlter();
    //    dll.Print();
       
       dll.Print();
    }

   

    public static void deleteNodd(int i){

        // Your code here	
	 int size = 1;
	 Node x = head;
	 if(i==1){
       head = head.next;
       head.prev = null;
        return;
     }
	 
	 while(x.next != null){
	 
	     if(size == i){
	       x.prev.next = x.next;
           x.next.prev = x.prev;
	      return ;
	     }
	     size++;
	     x = x.next;
	 }
     
      x.prev.next = null;
     return;
    }

    public static void DeleteAlter(){
        Node n = head;
        int s = 0;
        while(n.next != null){

            if(s/2!=0){
                n.prev.next = n.next;
                n.next.prev = n.prev;
            }
            n = n.next;
            s++;
        }

        if(s/2!=0){
            
        }
    }
}
