package binarySearchTree;

import java.util.Stack;

public class BounderyTraversal {

    public static class Node{
        int data;
        Node left, right;

        Node(int d){
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
        root.right.right = new Node(6);

       

    }
}
