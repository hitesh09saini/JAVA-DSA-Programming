public class Ylinkedlist {
   static class Node {
        int data;
        Node next;

          Node(int d) {

            data = d;
            next = null;
        }

    }
 
    public Node getIntersectionPoint(Node h1, Node h2) {
        while (h2 != null) {
            Node temp = h1;
            while (temp != null) {
                if (temp == h2) {
                    return h2;
                }
                temp = temp.next;
            }
            h2 = h2.next;
        }

        return null;
    }


    public static void main(String[] args) {
        Ylinkedlist li = new Ylinkedlist();
         Node h1 ,h2;

       h1 = new Node(10);
       h2 = new Node(3);

       Node newNode = new Node(6);
       h2.next = newNode;

       newNode = new Node(9);

       h2.next.next = newNode;

       newNode = new Node(15);
       h1.next = newNode;
       h2.next.next.next = newNode;


       newNode = new Node(30);
       h1.next.next = newNode;

       h1.next.next.next = null;

       Node ip = li.getIntersectionPoint(h1, h2);

       System.out.println(ip.data);
    
        
        
    }

}
