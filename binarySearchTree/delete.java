package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class delete {

    static class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(11);
        root.right = new Node(9);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
      
         print(root);
        System.out.println();
        
        print(delete(root,11));

    }

    public static void print(Node root){
        if(root == null)return ;

        print(root.left);
        
        System.out.print(root.data+" ");
         
        print(root.right);
    }

    private static Node delete(Node root, int key) {

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
