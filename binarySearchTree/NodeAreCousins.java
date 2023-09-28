package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class NodeAreCousins {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    static class INFO {
        Node parent;
        int level;

        INFO(Node p, int l) {
            this.parent = p;
            this.level = l;
        }
    }

    private static INFO info1;
    private static INFO info2;

    private static void Info(Node root, int a, int b, int level, Node parent) {
        if (root == null || (info1 != null && info2 != null)) {
            return;
        }

        if (root.data == a) {
            info1 = new INFO(parent, level);
        }

        if (root.data == b) {
            info2 = new INFO(parent, level);
        }

        Info(root.left, a, b, level + 1, root);
        Info(root.right, a, b, level + 1, root);
    }

    private static boolean areCousins(Node root, int a, int b) {
        info1 = null;
        info2 = null;
        Info(root, a, b, 0, null);

        if (info1 == null || info2 == null || info1.level != info2.level || info1.parent == info2.parent) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5);

        System.out.println(areCousins(root, 2, 3)); // Should print true
    }
}
