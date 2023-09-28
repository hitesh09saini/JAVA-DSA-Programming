package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class deletionInBinaryTree {

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

        System.out.println("Original Tree:");
        print(root);
        System.out.println();
        int keyToDelete = 2;
        root = deleteLastNodeAndReplaceWithData(root, keyToDelete);

        System.out.println("Tree after removing last node and replacing data with " + keyToDelete + ":");
        print(root);
    }

    private static void print(Node root) {
        if (root == null)
            return;

            System.out.print(root.data+" ");
         
        print(root.left);
       
        print(root.right);
    }

    private static Node deleteLastNodeAndReplaceWithData(Node root, int key) {
        Node temp = root;
        Queue<Node> q = new LinkedList<>();
		q.add(temp);

		Node toDelete  = null;
		Node lastpearent = null;
		Node toReplace = null;

		while(!q.isEmpty()) {
			int size = q.size();
			Node curr = null;

			for(int i=0;i<size;i++) {
				curr = q.remove();
				if(curr.data == key) {
					toReplace = curr;
				}
				if(curr.left != null) {
				    lastpearent = curr;
					q.add(curr.left);
				}
				if(curr.right != null){
				    lastpearent = curr;
				    q.add(curr.right);
				}
				
			}


			if(q.size() == 0)
				toDelete = curr;
		}
		
		if(toReplace !=  null){
		    toReplace.data = toDelete.data;
            
		    if(lastpearent.left == toDelete){
		        lastpearent.left = null;
		    }else{
		        lastpearent.right = null;
		    }
		}
		return root;
    }
}
