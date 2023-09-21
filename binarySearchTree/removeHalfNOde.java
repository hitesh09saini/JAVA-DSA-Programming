package binarySearchTree;

public class removeHalfNOde {
    
    static class Node{
        int data;
        Node left, right;

        Node(int d){
           this.data=d;
           left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.right.right = new Node(3);

        System.out.println(Remove(root));
    }

    private static Node Remove(Node root) {

        if(root == null) return root;
        
        Node leftNode = Remove(root.left);
        Node rightNode = Remove(root.right);
        
        if(leftNode == null && rightNode == null) {
            return root;
        } else if(leftNode == null) {
    
            return rightNode;
        } else if(rightNode == null) {
            
            return leftNode;
        } else {
            root.left = leftNode;
            root.right = rightNode;
            return root;
        }

    }
}
