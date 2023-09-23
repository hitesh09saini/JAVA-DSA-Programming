package binarySearchTree;

public class hightOfTree {

    static class Node{
        int data;
        Node left, right;

        Node(int d){
            this.data = d;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.left.right.right= new Node(6);
        root.left.right.right.right= new Node(7);

        System.out.println(hightOfTree(root));

    }
    private static int hightOfTree(Node root) {

        if(root == null)return 0;

        return Math.max(hightOfTree(root.left),hightOfTree(root.right))+1;
    }
    
}
