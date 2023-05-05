public class Queue {
    
   static class queue{
        static int ar[];
        static int size;
        static int  rear;

        queue(int n ){
            ar = new int[n];
            size = n;
            rear =-1;
        }
        public static boolean isEmpty() {
            return rear == -1;
        }

        // add 
        public static void add(int data) {
            if(rear == size-1){
                System.out.println("queue is full");
                return;
            }

            rear = rear+1;
            ar[rear]=data;
        }

        // peek 
        public static int peek() {
            if(isEmpty()){
               System.out.println(" Queue is Empty");
               return -1;
            }
            return ar[0];
        }

        // remove
        public static int remove() {
            if(isEmpty()){
                System.out.println(" Queue is Empty");
                return -1;
             }
            
             int front = ar[0];
             for(int i = 0;i<rear;i++){
                ar[i]= ar[i+1];
             }
             rear --;

             return front;

        }

        

   }


   // time comlextity O(n) in remove 
   public static void main(String[] args) {
      queue q =new queue(5);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);

      while(!q.isEmpty()){

        System.out.println(q.remove());
      }
   }

}
