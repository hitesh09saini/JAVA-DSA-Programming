package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeA {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int inx = -1;

        public static Node buildTRee(int nodes[]) {

            inx++;
            if (nodes[inx] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[inx]);
            newnode.left = buildTRee(nodes);
            newnode.right = buildTRee(nodes);

            return newnode;
        }

        public static void preorder(Node root) {
            if (root == null) {

                return;
            }
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void postorder(Node root) {
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level order traversal

        public static void levelOrderTraversal(Node root) {

            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {

                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {

                    System.out.print(curNode.data + " ");

                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }

                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }

            }

        }

        // height of a tree

        public static int hight(Node root) {

            if (root == null)
                return 0;
            return Math.max(hight(root.left), hight(root.right)) + 1;
        }

        public static int countNode(Node root) {
            if (root == null)
                return 0;
            return countNode(root.left) + countNode(root.right) + 1;
        }

        public static int SumOfNodes(Node root) {
            if (root == null)return 0; 

            return SumOfNodes(root.left) + SumOfNodes(root.right)+root.data;
        }

    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTRee(node);

        tree.levelOrderTraversal(root);


        System.out.println("Hight of tree  " + tree.hight(root));

        System.out.println("Sum of Node " + tree.SumOfNodes(root));

        System.out.println("Number of Node " + tree.countNode(root));

    }
}
