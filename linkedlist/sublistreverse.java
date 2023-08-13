import java.util.ArrayList;

public class sublistreverse {
    static class Node{
        Node next;
        int data;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    public static void main(String[] args) {
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.next = new Node(3);
      head.next.next.next = new Node(4);
      head.next.next.next.next = new Node(5);

      Printll(head);

    //    head =  set(head ,1,4);
      
   
        // Printll(head);
    }
    //  1->2->3->4->5->null
    private static Node set(Node head,int m,int n) {
       
        Node curr=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(curr!=null){
            arr.add(curr.data);
            curr=curr.next;
            
        }
        int i=m-1,j=n-1;
        while(i<j){
            int tem=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,tem);
            i++;
            j--;
        }
        curr=head;
        for(int k=0;k<arr.size();k++){
            curr.data=arr.get(k);
            curr=curr.next;
        }
        return head;


    }
    public static Node reverse(Node head) {
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
        return head;
    }
    private static void Printll(Node head) {
        Node h = head;
        while(h!=null){
            System.out.print("{"+h.data+"}-->");
            h = h.next;
        }System.out.print("null");
        System.out.println();
    }
}
