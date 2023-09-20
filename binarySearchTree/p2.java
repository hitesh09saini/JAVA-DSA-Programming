package binarySearchTree;

public class p2 {

    public static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(SumRoot(root, ""));;

    }

    private static int SumRoot(Node root, String s) {
        if (root == null) {
            return 0;
        }
    
        s += Integer.toString(root.data);
    
        if (root.left == null && root.right == null) {
            return Integer.parseInt(s);
        }
    
        int leftSum = SumRoot(root.left, s);
        int rightSum = SumRoot(root.right, s);
    
        return leftSum + rightSum;
    }
    

}
