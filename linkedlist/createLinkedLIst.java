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
        while(fast != null || fast.next != null){
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
        
        l.AddFirst(0);
        l.AddFirst(2);
        l.AddFirst(3);
        l.AddFirst(6);
        l.AddFirst(9);
         l.AddLast(-1);

     l.PrintLL();

       
    // //    l.DeleteFirst();

    // //    l.DeleteLast();
        
    //     // l.Addnth(2,10);
    //     // l.DeleteNth(3);

    //    l.replace(3, 60);
    //    l.PrintLL();

       

    }
}