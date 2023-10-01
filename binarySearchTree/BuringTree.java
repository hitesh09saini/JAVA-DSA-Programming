package binarySearchTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BuringTree {
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
 
        System.out.println(minTime(root, 5));
    }

    private static int minTime(Node root, int k) {

        int ans =0;
        HashMap<Node,Node> m = new HashMap<>();

        Node t = createParentMap(root, k, m);

        burnTree(root,m);

        return ans;
    }

    private static void burnTree(Node root, HashMap<Node, Node> m) {

        HashMap<Node, Boolean> map = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        map.put(root, true);
        int ans =0;
        

        while(!q.isEmpty()){

            int size = q.size();

            for(int i=0;i<size;i++){

                Node f = q.remove();
                
                if(f.left!= null && !map.get(f.left)){
                    q.add(f.left);
                    map.put(f, true);
                }

                

            }

        }


    }

    private static Node createParentMap(Node root, int k, HashMap<Node, Node> m) {

        Node res = null;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        m.put(root, null);

        while(!q.isEmpty()){
            Node f = q.remove();

            if(f.data == k){
                res = f;
            }

            if(f.left != null){
                m.put(f.left, f);
                q.add(f.left);
            }

            if(f.right != null){
                m.put(f.right, f);
                q.add(f.right);
            }
            
        }

        return res;
    }
}
