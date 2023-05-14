public class addTwovalue {
      public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calculate(l1,l2,0);
       }
   
       public static ListNode calculate(ListNode l1, ListNode l2, int carry)
          {
           if(l1==null&&l2==null&&carry==0) return null; 
           if(l1==null&&l2==null&&carry!=0) return new ListNode(1); 
   
         int temp=(l1==null? 0: l1.val)+ (l2==null? 0: l2.val)+ carry; 
           System.out.print(temp+" ");
           ListNode result=new ListNode(temp%10); 
           result.next=calculate(l1==null? null: l1.next, l2==null? null: l2.next, temp/10); 
           return result;
        }
        public static void main(String[] args) {
            ListNode l1 = new ListNode();
            l1.val = 2;
            l1.val = 4;
            l1.val = 3;
            l1.next =null;

            ListNode l2 = new ListNode();
            l2.val = 2;
            l2.val = 4;
            l2.val = 3;
            l2.next =null;

            addTwoNumbers(l1,  l2);
            
             
            
           
        }

      
}

 class ListNode{
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
