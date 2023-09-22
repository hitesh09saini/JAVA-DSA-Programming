package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;


public class MaxNodeLevel {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.left.right.left = new Node(5);
        root.right.right = new Node(8);

        System.out.println(Level(root));
    }

    private static int Level(Node root) {
        if (root == null) {
            return 0;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        int maxLevel = 0;
        int currentLevel = 0;
        int maxNodeCount = 0;
        
        while (!queue.isEmpty()) {
            int nodeCount = queue.size();
            
            if (nodeCount > maxNodeCount) {
                maxNodeCount = nodeCount;
                maxLevel = currentLevel;
            }
            
            for (int i = 0; i < nodeCount; i++) {
                Node node = queue.poll();
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            currentLevel++;
        }
        

        return maxLevel;
    }

}
