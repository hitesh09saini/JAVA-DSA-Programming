package binarySearchTree;

import java.util.*;

public class topview {

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

            TopView(root);
        }

        static class Info {
            int hd;
            Node node;

            public Info(Node node, int h) {
                this.node = node;
                this.hd = h;
            }

        }

        private static void TopView(Node root) {

            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;

            q.add(new Info(root, 0));
            q.add(null);

            while (!q.isEmpty()) {
                Info cur = q.remove();
                if (cur == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                }

                else {
                    if (!map.containsKey(cur.hd)) {
                        map.put(cur.hd, cur.node);
                    }

                    if (cur.node.left != null) {
                        q.add(new Info(cur.node.left, cur.hd - 1));
                        min = Math.min(min, cur.hd - 1);
                    }

                    if (cur.node.right != null) {
                        q.add(new Info(cur.node.right, cur.hd + 1));
                        max = Math.max(max, cur.hd + 1);
                    }
                }

            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();

        }
    }
}
