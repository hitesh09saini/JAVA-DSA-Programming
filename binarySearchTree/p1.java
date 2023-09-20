package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        
        p1.right = new Node(3);

        // orders(p1);

        // levelOrder(p1);
        // System.out.println(rightView(p1));

        // System.out.println(countLeaves(p1));
        System.out.println(height(p1));

    }

    public static int height(Node node) {
        return helperHeight(node);
    }
    
    public static int helperHeight(Node root) {
        if (root == null) {
            return 0; 
        }
       
        int leftHeight = helperHeight(root.left);
        int rightHeight = helperHeight(root.right);
    
        // The height of the current node is the maximum of left and right subtree heights, plus 1.
        return Math.max(leftHeight, rightHeight) + 1;
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

    public static ArrayList<Integer> orders(Node root) {
        System.out.println(helper(root));
        ArrayList<Integer> a = helperInOrder(root, new ArrayList<>());
        return a;
    }

    static int sum = 0;

    public static int helper(Node r) {

        if (r == null)
            return 0;
        sum += r.data;
        System.out.println(r.data);
        helper(r.left);
        helper(r.right);
        return sum;

    }

    public static ArrayList<Integer> helperInOrder(Node root, ArrayList<Integer> arr) {

        if (root == null)
            return arr;

        helperInOrder(root.left, arr);
        arr.add(root.data);
        helperInOrder(root.right, arr);
        return arr;
    }

    public static ArrayList<Integer> helperPreOrder(Node root, ArrayList<Integer> arr) {

        if (root == null)
            return arr;
        arr.add(root.data);
        helperPreOrder(root.left, arr);

        helperPreOrder(root.right, arr);

        return arr;
    }

    public static ArrayList<Integer> helperPostOrder(Node root, ArrayList<Integer> arr) {

        if (root == null)
            return arr;

        helperPostOrder(root.left, arr);

        helperPostOrder(root.right, arr);
        arr.add(root.data);
        return arr;

    }

    public static ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        helperRightView(root, result, 0);
        return result;
    }

    public static void helperRightView(Node root, ArrayList<Integer> result, int level) {
        if (root == null)
            return;

        // If the result list doesn't have an element at the current level, add the
        // current node
        if (level == result.size()) {
            result.add(root.data);
        }

        // Traverse the right subtree first to get the right view
        helperRightView(root.right, result, level + 1);
        helperRightView(root.left, result, level + 1);
    }

    public static void levelOrder(Node root) {

        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

        }

    }
}
