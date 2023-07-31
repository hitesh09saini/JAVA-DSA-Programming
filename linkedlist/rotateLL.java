import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rotateLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
           this.data = data;
           this.next = null;
        }
    }

    


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        // printll(head);
        // head =  rotateLINkedlist(head);
        // printll(head);
         printll(head);
        //  head = rotateLL(head,1);
        //  printll(head);
        // head = sort(head);
        // printll(head);
         
        printll(rearrange(head));
    }
    public static Node sort(Node head){
        ArrayList<Integer> al  = new ArrayList<>();
        Node t = head; 
        while(t != null){
            al.add(t.data);
            t = t.next;
        }

        Collections.sort( al);
      
        System.out.println(al);
        t = head.next;
        for(int i=0;i<al.size();i++){
            t = new Node(al.get(i));
            t = t.next;
        }
        printll(t);
        return head;
    }

    public static Node rotateLL(Node head,int k){
        Node t = head;
        int c=1;
        while(t !=null && k>c){
            t = t.next;
            c++;
        }

        Node kthNode = t;
        while(t.next !=null){
            t  = t.next;
        }
    
        t.next= head;
        head =kthNode.next;
        kthNode.next = null;

       return head;
    }

    public static void printll(Node head){
        Node print = head;
        while(print!=null){
            System.out.print("["+print.data+"]-->");
            print = print.next;
        }System.out.print("null");
        System.out.println();
    }

    public static Node rearrange(Node head){
        Node t = head,t2 = head,re = new Node(-1),n= re;
      
        while(t != null)
        {
            if(t.data%2!=0){
              n.next = t;
              n = n.next;
            }
             t = t.next;
        }

        System.out.println(t2.next.data);
         
        while(t2 != null)
        {
            if(t2.data%2==0){
              n.next = t2;
              n = re.next;
            }
             t2 = t2.next;
        }

        return re.next;

    }
    public static Node rotateLINkedlist(Node head){

        Node f = head, s = head,p=null,head2=null;
        int c= 0;
        while(s!= null){
            c++;
            s = s.next;
            
        }

        s= head;
        while(f!=null &&f.next!=null){
            f = f.next.next;
            p=s;
            s = s.next;
        }

        if(c%2==0){
           
             head2 = p.next;
             p.next =null;

        }else{
            head2 = s.next;
            s.next =null;
          
          
        }

        Node t = head2;
        while(t.next!=null){
            t = t.next;
        }
      
        t.next = head;
       return  head = head2;

    }
}
