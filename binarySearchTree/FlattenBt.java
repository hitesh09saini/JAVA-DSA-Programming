package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class FlattenBt {
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

        root = solve(root);
        print(root);
    }

    public static void print(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");

        print(root.left);
        print(root.right);
    }

    private static Node solve(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left != null) {
            Node temp = root.left;

            while (temp.right != null) {
                temp = temp.right;
            }

            temp.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        solve(root.right);
        return root;

    }
}
