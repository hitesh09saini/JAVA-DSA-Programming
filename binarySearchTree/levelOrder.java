package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrder {

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

        System.out.println(levelOrderTr(root));
    }

    private static ArrayList<Integer> levelOrderTr(Node root) {
        ArrayList<Integer> li = new ArrayList<>();
        
        if (root == null)
            return li;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){

            Node cur = q.remove();
            
            if(cur == null){
                 System.out.println();
                if(q.isEmpty()){
                   break;
                }else{
                    q.add(null);
                }
            }else{
                li.add(cur.data);
                System.out.print(cur.data+" ");

                if(cur.left!=null){
                   q.add(cur.left);
                }

                 if(cur.right!=null){
                   q.add(cur.right);
                }

            }
        }

        return li;
    }
}
