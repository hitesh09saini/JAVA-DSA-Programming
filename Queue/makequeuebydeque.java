package Queue;

import java.util.*;
public class makequeuebydeque {
    static class Queue{
       static Deque<Integer> d = new LinkedList<>();

       public static boolean isEmpty() {
        return d.isEmpty();
       }

        public static void add(int data) {
            d.addLast(data);
        }
        
        public static int peek() {
            return d.peekFirst();
        }

        public static int remove() {
            return d.removeFirst();
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue();

        q.add(2);
        q.add(5);
        q.add(9);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
