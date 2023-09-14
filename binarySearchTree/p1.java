package binarySearchTree;

import java.util.ArrayList;

public class p1 {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

 
    public static void main(String[] args) {
        Node p1 = new Node(1);
        p1.left = new Node(2);
        p1.right = new Node(3);
       
       
        System.out.println(orders(p1));

        // System.out.println(countLeaves(p1));


    }

    public static int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        
        if (root.left == null && root.right == null) {
            return 1; // Leaf node
        }
    
        int leftCount = countLeaves(root.left);
        int rightCount = countLeaves(root.right);
    
        return leftCount + rightCount;
    }
    

    public static ArrayList<Integer> orders(Node root){

        ArrayList<Integer> a = helperInOrder(root,new ArrayList<>());
        return a;
    }

    public static ArrayList<Integer> helperInOrder(Node root,ArrayList<Integer> arr){

        if(root == null)return arr;
        
        helperInOrder(root.left, arr);
        arr.add(root.data);
        helperInOrder(root.right, arr);
        return arr;
    }

     public static ArrayList<Integer> helperPreOrder(Node root,ArrayList<Integer> arr){

        if(root == null)return arr;
        arr.add(root.data);
        helperPreOrder(root.left, arr);
        
        helperPreOrder(root.right, arr);

        return arr;
    }

    public static ArrayList<Integer> helperPostOrder(Node root,ArrayList<Integer> arr){

        if(root == null)return arr;
        
        helperPostOrder(root.left, arr);
        
        helperPostOrder(root.right, arr);
        arr.add(root.data);
        return arr;
    }
}
