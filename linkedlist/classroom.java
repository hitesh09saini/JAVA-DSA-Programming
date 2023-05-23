import java.util.LinkedList;

public class classroom {
    
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(6);
        ll.addFirst(9);
        ll.addFirst(8);

        System.out.println(ll);

        // remove

        ll.removeFirst();

        System.out.println(ll);

        
    }


}
