package binarySearchTree;

public class depthOfBinary {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);

        // System.out.println(depath(root));
        System.out.println(distance(1, 3));

    }

    private static int depath(Node root) {

        if (root == null)
            return 0;

        int l = depath(root.left);
        int r = depath(root.right);

        return Math.max(l, r) + 1;
    }

    public static int distance(int x, int y) {
        if (x == y)
            return 0;

        int m = x;
        int n = y;
        int count = 0;

        while (m != n) {

            if (m > n) {
                m = m / 2;
            } else {
                n = n / 2;
            }

            count++;

        }

        return count;
    }

}
