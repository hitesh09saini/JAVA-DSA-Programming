package binarySearchTree;

public class mergeTree {
    
    static class Node {
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
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

         Node root2 = new Node(1);
          root2.left = new Node(2);
         root2.right = new Node(3);
         root2.left.left = new Node(4);
         root2.left.right = new Node(5);
         root2.right.left = new Node(6);

    
        print(MergeTrees(root,root2));
    }

    private static Node MergeTrees(Node t1, Node t2) {

        if (t1 == null)
             return t2;
         if (t2 == null)
             return t1;
             
         t1.data += t2.data;
         t1.left = MergeTrees(t1.left, t2.left);
         t1.right = MergeTrees(t1.right, t2.right);
         return t1;
    }

    public static void print(Node root){
        if(root == null)return ;

        
        System.out.print(root.data+" ");

        print(root.left);
        print(root.right);
    }

}
