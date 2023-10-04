import java.util.HashMap;

import hashing.hashmap;

public class buildTree {

    public static class Node {
        int data;
        Node left, right;

        Node(int d) {

            this.data = d;
            left = right = null;

        }

        public static void main(String[] args) {

            int arr[] = { 1, 2, -1, -1, 3, -1, 4, -1, -1 };
            // print(root);
            // Node root = createTree(arr);
            int in[] = { 1, 6, 8, 7 };
            int pre[] = { 1, 6, 7, 8 };
            Node root = createByInorderAndPre(in, pre, pre.length);
            print(root);

        }

        private static Node createByInorderAndPre(int[] in, int[] pre, int n) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < in.length; i++) {
               map.put(in[i], i);
            } 
            return solve(in, pre, 0, 0, n - 1, n,map);

        }

        private static Node solve(int[] in, int[] pre, int i, int j, int k, int n, HashMap<Integer, Integer> map ){
           
            if (i >= n || j > k)
                return null;

            int ele = pre[i++];
            Node newNode = new Node(ele);
            newNode.left = solve(in, pre, i, j, map.get(ele)-1, n,map);
            newNode.right = solve(in, pre, i,map.get(ele)+1, k, n,map);

            return newNode;

        }

        public static int i = -1;

        private static Node createTree(int[] arr) {
            i++;
            if (arr[i] == -1)
                return null;

            Node newNode = new Node(arr[i]);
            newNode.left = createTree(arr);
            newNode.right = createTree(arr);

            return newNode;
        }

      
        private static void print(Node root) {

            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            print(root.left);
            print(root.right);

        }
    }
}
