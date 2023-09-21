package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class gcd {
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
 

        System.out.println(maxGCD(root));
    }

    private static int maxGCD(Node root) {
        int ans=0, mx=Integer.MIN_VALUE;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node n = q.poll();
            if(n.left!=null && n.right!=null){
                int k=gcd(n.left.data, n.right.data);
                if(k>=mx){
                    mx=k;
                    ans=n.data;
                }
            }
            if(n.left!=null) q.add(n.left);
            if(n.right!=null) q.add(n.right);
        }
        return ans; 
    }
    
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
    

}
