public class createLinkedLIst {
    public static Node head;
    public static Node tail;
    public static int size =0;


    public static class Node{
        int data;
        Node next;

        Node(int data ){
            this.data = data;
            this.next = null;
        }
    }

    public  boolean isEmpty(){
        return head == null;
    }

    //  Add In the Last
    public void AddLast(int data){
        size++;
        Node newNode = new Node(data);
        if(isEmpty()){
            
          head =  tail = newNode;
          return;
        }
        
        Node t = head;
        Node p = t;
        while(t != null ){
            p = t;
            t = t.next;
        }

       p.next = newNode;
  
    }

    // Add In the First

    public  void AddFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(isEmpty()){
          head =  tail = newNode;
          return;
        }
       
        newNode.next = head;
        head = newNode;
    }

    // Add in middle 

    public void Addnth(int inx,int data){
        size++;
        Node newNode = new Node(data);
        if(isEmpty()){
          head =  tail = newNode;
          return;
        }

        Node temp =head;
      
        for(int i=0;i<inx-1;i++){
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        

    }


    public int DeleteNth(int inx){
       
       
        if(isEmpty()){
          System.out.println("LinkedList is empty");
          return Integer.MIN_VALUE;
        }

        size--;
        Node temp =head;
      
        for(int i=0;i<inx-1;i++){
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        
       return val;
    }

    public int DeleteFirst(){
        if(isEmpty()){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        size--;
        int val = head.data;
        head = head.next;
       return val;
    }

    public int DeleteLast(){
        if(isEmpty()){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
         
        int val = tail.data;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        return val;
    }

     public void replace(int inx ,int data){
        if(isEmpty()){
            System.out.println("LinkedList is empty");
            return ;
        }

        Node temp = head;
        for(int i=0;i<inx-1;i++){
            temp = temp.next;
        }
       Node neNode = new Node(data);
       
        temp.next = temp.next.next;
        neNode.next = temp.next;
        temp.next = neNode;
        

     }
    // Print the LInklist
       public  void PrintLL(){
         if(head == null){
            System.out.println("LL is empty");
            return;
         }
         Node  temp = head;
         
        while(temp != null){
           System.out.print("["+temp.data+"]-->");
           temp = temp.next;
        }System.out.print("null");
        System.out.println();
    }


    public boolean isCircular(){
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        createLinkedLIst l = new createLinkedLIst();
        
        System.out.println(l.isEmpty());
        // l.AddFirst(8);
        l.AddFirst(7);
        l.AddFirst(6);
        l.AddFirst(5);
        l.AddFirst(3);
        l.AddFirst(2);
        l.AddFirst(1);
        
  

    //  l.PrintLL();
    //    System.out.println(l.isCircular());
       
       
        
    // //    l.DeleteFirst();

    // //    l.DeleteLast();
        
    //     // l.Addnth(2,10);
    //     // l.DeleteNth(3);

    //    l.replace(3, 60);
       l.PrintLL();
       swap();
    //    DeleteAlt();
    //    MiddleLL(4);
    //    l.insert(4);
       l.PrintLL();
    }

    private static void MiddleLL(int i) {
        Node slow = head,fast = head;
        Node p = slow;
        while(fast!=null && fast.next != null){
            p = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        Node neNode = new Node(i);

        neNode.next = slow;
        p.next = neNode;

    }

    public static void swap(){
          // code here
          Node p  = head;
          Node s = head.next;

         

          
          while(p.next.next!=null && s.next.next != null){ 
           // swaping
           int t = p.data;
           p.data = s.data;
           s.data = t;

           s = s.next.next;
           p = p.next.next;
          
          }
           int t = p.data;
           p.data = s.data;
           s.data = t;
    }

    private Node insert(int i) {
        Node x = head;
        Node newNode = new Node(i);

        // bignning
        if(head.data >i){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node pre = x;
        // middle
        
        while(x != null){

           
            // small 
             if(x.data > i){
                 newNode.next = x;
                 pre.next = newNode;
                return head;     
             }
               pre = x;
               x = x.next;
        }

        pre.next = newNode;
        return head;
    }
    
   
    
   public static void DeleteAlt(){
     Node temp=head;
        while(temp!=null && temp.next!=null)
        {
            
            temp.next=temp.next.next;
            temp=temp.next;
        }
   }
   
  
}