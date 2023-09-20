package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class countLevel {
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

        System.out.println(CountLevel(root));

    }

    private static int CountLevel(Node root) {
        if(root == null)return 0;

        Queue<Node> q = new LinkedList<>();
        int count = 1;

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {

            Node cur = q.remove();

            if (cur == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    count++;
                    q.add(null);
                }

            } else {

                if (cur.left != null) {
                    q.add(cur.left);
                }

                if (cur.right != null) {
                    q.add(cur.right);
                }

            }

        }

        return count;
    }
}
