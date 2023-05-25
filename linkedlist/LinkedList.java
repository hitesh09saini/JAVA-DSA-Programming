import recurtion.margeSort;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first O(1)

    public void addFirst(int data) {
        // step 1 create node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 nextNode next = head

        newNode.next = head; // link

        // step 3 head - newNode
        head = newNode;
    }

    // add last O(1)

    public void addlast(int data) {
        // step 1 create node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step 2 tail next - newnode

        tail.next = newNode;

        // shift newnode as tail
        tail = newNode;

    }

    // print LL O(n)

    public void PrintLL() {
        Node temp = head;
        if (temp == null) {
            System.out.println(temp);
            return;
        }

        while (temp != null) {

            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp + "\n");

    }

    // add between O(n)

    public void addBetween(int inx, int data) {
        if (inx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < inx - 1) {

            temp = temp.next;
            i++;

        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    // remove

    public static void removeNth(int n) {
        if (n == size) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

        return;

    }

    public static int removeFirst() {
        int val = head.data;
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {

            head = tail = null;
            size = 0;
            return val;
        }

        head = head.next;
        size--;
        return val;

    }

    public static int removeLast() {

        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev i =size -2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;

        return val;
    }

    // search O(n)

    public static int search(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return i;
            temp = temp.next;
            i++;
        }

        return -1;
    }

    // recursive search

    public int helper(Node head, int key) {
        if (head == null)
            return -1;

        if (head.data == key) {
            return 0;
        }

        int inx = helper(head.next, key);
        if (inx == -1) {
            return -1;
        }

        return inx + 1;

    }

    public int searchKey(int key) {
        return helper(head, key);
    }

    // reverse linkedlist
    public static void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // find middle

    private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    /// check palindrome

    public static boolean checkPalindrome() {
        if (head == null || head.next == null)
            return true;
        // find mid
        Node mid = findMid(head);

        // reverse 2nd half
        Node prev = null;
        Node curr = mid;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                flag = true;
                break;

            }
        }
        // not exist

        if (flag == false) {
            return;
        }

        // find meeting point

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // break cycle point

        prev.next = null;

    }

    public  Node mergeSort(Node head) {

        if (head == null || head.next == null)
            return head;

        // find mid

        Node mid = getMid(head);
        // left & right
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    private  Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    private  Node merge(Node newLeft, Node newRight) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (newLeft != null && newRight != null) {

            if (newLeft.data <= newRight.data) {
                temp.next = newLeft;
                newLeft = newLeft.next;

                temp = temp.next;
            } else {
                temp.next = newRight;
                newRight = newRight.next;

                temp = temp.next;
            }
        }

        while (newLeft != null) {
            temp.next = newLeft;
            newLeft = newLeft.next;

            temp = temp.next;
        }

        while (newRight != null) {
            temp.next = newRight;
            newRight = newRight.next;

            temp = temp.next;

        }
        return mergeLL.next;
    }

    public static void main(String[] args) {
       LinkedList l = new LinkedList();

       l.addFirst(1);
       l.addFirst(2);
       l.addFirst(3);
       l.addFirst(4);
       l.addFirst(5);
      

       l.PrintLL();
       l.head = l.mergeSort(head);
       l.PrintLL();
    }

}