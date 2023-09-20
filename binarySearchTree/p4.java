package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class p4 {
    static class Node {
        int data;
        Node left, right;

        Node(int d) {

            this.data = d;
            left = right = null;

        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);

            System.out.println(levelOrderTr(root));
        }

        private static ArrayList<Integer> levelOrderTr(Node root) {

            ArrayList<Integer> li = new ArrayList<>();
            if (root == null) {

                return li;
            }
            Queue<Node> q = new LinkedList<>();

            q.add(root);

            q.add(null);

            while (!q.isEmpty()) {

                Node curNode = q.remove();
                if (curNode == null) {
                    // System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {

                    // System.out.print(curNode.data + " ");
                    li.add(curNode.data);

                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }

                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }

            }
            return li;
        }

    }

}
