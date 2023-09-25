package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class inorder {

    public static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int d) {
            this.data = d;
            left = right = null;
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // System.out.println(inorderT(root));
        // System.out.println(preorderT(root));
        System.out.println(postorderT(root));
    }

    private static List<Integer> inorderT(TreeNode root) {

        List<Integer> li = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !s.isEmpty()) {

            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            li.add(curr.data);
            curr = curr.right;
        }

        return li;
    }

    private static List<Integer> preorderT(TreeNode root) {

        List<Integer> li = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !s.isEmpty()) {

          
            while (curr != null) {
                li.add(curr.data);
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();

            curr = curr.right;
        }

        return li;
    }

    private static List<Integer> postorderT(TreeNode root) {

        List<Integer> li = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !s.isEmpty()) {

            while (curr != null) {
                s.push(curr);
                curr = curr.left;
                
            }

            li.add(curr.data);
            curr = s.pop();
            
            curr = curr.right;
            
        }

        return li;
    }
}
