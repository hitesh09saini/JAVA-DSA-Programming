package binarySearchTree;

public class subtree {
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
        root.right.left= new Node(6);
        root.right.right= new Node(7);

        Node r1 = new Node(2);
        r1.left = new Node(4);
        r1.right = new Node(5);
        

        System.out.println(isExists(root, r1));
    }

    private static boolean isExists(Node root, Node r1) {
        if(root == null)return false;

        if(root.data == r1.data){
            return match(root,r1);
        }
        
        return isExists(root.left, r1) || isExists(root.right, r1);
    }

    private static boolean match(Node root, Node r1) {
         if(root == null && r1 == null)return true;
         else if(root == null || r1 == null ||root.data != r1.data)return false;


        return match(root.left, r1.left)&&match(root.right,r1.right);
    }
    
    
}
