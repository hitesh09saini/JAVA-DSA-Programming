package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SpiralLevelOrder {

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

        System.out.println(SprialOrder(root));

    }

    private static ArrayList<Integer> SprialOrder(Node root) {
        ArrayList<Integer> li = new ArrayList<>();

        if (root == null)
            return li;
        int count = 1;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {

            Node c = q.remove();

            if (c == null) {

                if (q.isEmpty()) {
                    break;
                } else {
                    count++;
                    q.add(null);
                }

            } else {

                if (count % 2 != 0) {
                    s.push(c.data);

                } else {

                    while (!s.isEmpty()) {
                        li.add(s.pop());
                    }

                    li.add(c.data);
                }

                if (c.left != null) {
                    q.add(c.left);
                }

                if (c.right != null) {
                    q.add(c.right);
                }

            }
        }

        while (!s.isEmpty()) {
            li.add(s.pop());
        }

        return li;

    }
}
