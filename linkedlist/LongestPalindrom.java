import greedyAlgorithum.jobSequencingProblem;

public class LongestPalindrom {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
     }
    public static void main(String[] args) {
     
        int a[] = {1,2,1,2,2,5};
        Node head = new Node(a[0]);
        Node t = head;
        for(int i=2;i<7;i++){
            t.next = new Node(i);
            t = t.next;
        }

        Print(head);
        
    
        // Print(revese(head));
        Print(rev(head));

    //    System.out.println(LongestPalindrom(head));
    }
    public static Node rev(Node head){

      Node h = head,h1 = new Node(-1) ,p = h1,pre = h;
       while(h != null && h.next != null){
        p.next = new Node(h.next.data);
       
        h.next = h.next.next;
         pre = h;
         h = h.next;
         p = p.next;
       }
      
       h1 = revese(h1.next);

       if(h!=null){
           h.next = h1;
       }else{
           pre.next = h1;
       }

        return head;
    }

    public static Node revese(Node head){
      if(head ==null || head.next == null)return head;
        Node curr = head,pre = null;
        
        while(curr!= null){
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

       head = pre;
      return head;
    }

    public static int LongestPalindrom(Node head){
        int result =0;
        Node prev= null, curr=head;
        while(curr !=null)
        {
            Node next = curr.next;
            curr.next=prev;
            result = Math.max(result,2*countCommon(prev,next)+1);
            result = Math.max(result ,2*countCommon(curr,next));
            
            prev=curr;
            curr=next;
        }
        return result;
    }

    static int countCommon(Node a , Node b)
        {
            int count=0;
          for(;a !=null && b !=null ; a = a.next,b = b.next)
          
          
              if(a.data == b.data)++count;
              else break;
          
          return count;
        }

    public static boolean check(Node h ,int j){

        return true;
    }

    public static void Print(Node head){
        Node t= head;
        while(t !=null){
         System.out.print("{"+t.data+"}-->");
          t =  t.next;
        }System.out.print("null");
        System.out.println();
    }
}
