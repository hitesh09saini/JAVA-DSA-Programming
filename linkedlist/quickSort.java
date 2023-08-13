public class quickSort {
    public static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
    }

    public static void Printll(Node head){
        if(head==null){System.out.println("Linked list is empty ");return;}
        Node st = head;
        while(st != null){
            System.out.print("{"+st.data+"}-->");
            st = st.next;
        }System.out.print("null");
        System.out.println();
    }
   
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(3);
        head.next.next.next = new Node(8);
        Printll(head);
        head = quickSor(head);
        head = insertionSort(head);
        Printll(head);
    }


    private static Node insertionSort(Node head) {
        
        return null;
    }

    private static Node quickSor(Node head) {
        if(head == null || head.next == null)return head;
        Node start = head;
        Node end = head;

        while(end.next != null){
            end = end.next;
        }

        QuickSortImplementation(start,end);
        return head;
    }


    private static void QuickSortImplementation(Node start, Node end) {
        if(start == end || start==null || start == end.next )return;
        Node prev = pivotElement(start ,end);

        QuickSortImplementation(start, prev);

        if(prev == start){
            QuickSortImplementation(prev.next, end);
        }else if(prev.next!= null){
            QuickSortImplementation(prev.next.next, end);
        }


    }


    private static Node pivotElement(Node start, Node end) {
        if(start==end || start==null || start==end.next) return start;
        int pivot = end.data;
        Node prev = start;
        Node tmp = start;

        while(start != end){
            if(start.data <pivot){
                swap(tmp , start);
                prev = tmp;
                tmp = tmp.next;
            }

            start = start.next;

            
        }
        swap(tmp ,end);

        return prev;
    }


    private static void swap(Node tmp, Node start) {
        int data = tmp.data;
        tmp.data = start.data;
        start.data = data;
    }
}
