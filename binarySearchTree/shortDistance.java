package binarySearchTree;

public class shortDistance {

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
        root.right.right = new Node(3);

       System.out.println(shortPath(root, root.right.right));

    }

    private static int shortPath(Node x, Node y) {

        return find(x,y,0);
    }

    private static int find(Node x, Node y, int i) {

        if(x==null||y==null)return -1;

        if(x==y)return i;

        find(x.left, y, i+1);
        find(x.right, y, i+1);

        return i;
    }
    
}
