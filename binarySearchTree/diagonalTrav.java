package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class diagonalTrav {
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

       System.out.println( diagonal(root));

    }
   

    public static ArrayList<Integer> diagonal(Node root)
      {
           Queue<Node> q = new LinkedList<>();
           ArrayList<Integer> res = new ArrayList<>();
           
           q.add(root);
           while(!q.isEmpty()) {
               Node cur = q.remove();
               
               Node temp = cur;
               while(temp != null) {
                   if(temp.left != null) q.add(temp.left);
                   res.add(temp.data);
                   temp = temp.right;
               }
               
           }
           
           return res;
      }
}
