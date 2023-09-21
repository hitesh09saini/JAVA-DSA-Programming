package binarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Sbiling {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.right.right = new Node(3);

        System.out.println(DontHaveSbilings(root));

    }

    private static ArrayList<Integer> DontHaveSbilings(Node root) {

        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node cur = q.remove();

            if (cur.left == null && cur.right != null) {
                list.add(cur.right.data);
            } else if (cur.left != null && cur.right == null) {
                list.add(cur.left.data);
            }

            if (cur.left != null)
                q.add(cur.left);
            if (cur.right != null)
                q.add(cur.right);

        }

        if (list.size() == 0) {
            list.add(-1);
        } else {
            Collections.sort(list);
        }

        return list;
    }

}
