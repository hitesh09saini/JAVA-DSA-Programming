package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collector;

public class priorityQueus {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());

        p.add(3);
        p.add(8);
        p.add(4);
        p.add(1);

        System.out.println(p.peek());
    }
}
