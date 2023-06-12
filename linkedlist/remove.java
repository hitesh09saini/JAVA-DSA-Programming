public class remove {
   public static class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

     public static boolean isEmpty() {
         return head==null;
     }

     public static void add(int data) {
     Node newNode = new Node(data);
   
     if (head == null) {
         head = tail = newNode;
         return;
     }
       newNode.next = head; 
       head = newNode;
     }

        public static int removeFirst() {

            int value = head.data;
            if(isEmpty()){
                System.out.println("Linklist is empty");
                return -1;
            }
            head  = head.next;

           return value;
            
        }

        public void PrintLL() {
            Node temp = head;
            if (temp == null) {
                System.out.println(temp);
                return;
            }
    
            while (temp != null) {
    
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp + "\n");
    
        }


    public static void main(String[] args) {
        Node li = new Node(5);
         li.next = new Node(4);


         System.out.println(li);
          
          
         

       
    
    }
   
}
