package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class largestValueEachLevel {

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

        // System.out.println(print(root));
        System.out.println(isPerfect(root));

    }

    private static boolean isPerfect(Node root) {
        if (root == null) return true;

        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> li = new ArrayList<>();
        int level = 0;
        
        q.add(root);
        q.add(null);
        
        while (!q.isEmpty()) {
        
            Node cur = q.remove();
        
            if (cur == null) {
                level++;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                li.add(cur.data);
        
                if (cur.left != null) {
                    q.add(cur.left);
                }
        
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        
        int size = 1;
        
        while (level != 1) {
            size = size*2+1;
            level--;
        }
        
        System.out.println(li.size() + "  " + size);
        
        return li.size() == size;
        
    }



    private static ArrayList<Integer> print(Node root) {

        ArrayList<Integer> li = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();

        if (root == null)
            return li;

        q.add(root);
        q.add(null);
         int max = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
           

            Node cur = q.remove();

            if (cur == null) {
                li.add(max);
                max = Integer.MIN_VALUE;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {

                max = Math.max(max, cur.data);

                if (cur.left != null) {
                    q.add(cur.left);
                }

                if (cur.right != null) {
                    q.add(cur.right);
                }

            }

        }

        return li;
    }



    
}
