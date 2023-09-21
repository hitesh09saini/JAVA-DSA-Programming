package binarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class oddLevel {

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

        System.out.println(PrintOddLevel(root));

    }

    private static ArrayList<Integer> PrintOddLevel(Node root) {
       ArrayList<Integer> li = new ArrayList<>();
       if(root == null)return li;

       Queue<Node> q = new LinkedList<>();

       q.add(root);
       q.add(null);
       int level=1;

       while(!q.isEmpty()){

        Node cur = q.remove();

        if(cur == null){
            if(q.isEmpty()){
               break;
            }else{
                level++;
                q.add(null);
            }
        }else{

           if(level%2!=0){
             li.add(cur.data);
           }

           if(cur.left !=null){
             q.add(cur.left);
           }
            if(cur.right !=null){
             q.add(cur.right);
           }

        }


       }

        return li;
    }
    
}
