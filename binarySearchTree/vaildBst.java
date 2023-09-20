package binarySearchTree;

public class vaildBst {
    static class Node{
        int data;
        Node left, right;

        Node(int d ){
            this.data = d;
            left = right = null;
        }
    }
    
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        System.out.println(isBST(root,null,null));

    }


    public static boolean isBST(Node root,Node min, Node max){

        if(root == null){
            return true;
        }

        if(min != null && root.data <=min.data ){
            return false;
        }

        else if(max != null && root.data >= max.data){
            return false;
        }


        return isBST(root.left, min, root) && isBST(root.right, root, max);

    }
}
