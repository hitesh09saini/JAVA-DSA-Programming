package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
       d.addFirst(2);
       System.out.println(d.peek());
    }
}
