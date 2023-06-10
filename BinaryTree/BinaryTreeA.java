package BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeA {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int inx = -1;

        public static Node buildTRee(int nodes[]) {

            inx++;
            if (nodes[inx] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[inx]);
            newnode.left = buildTRee(nodes);
            newnode.right = buildTRee(nodes);

            return newnode;
        }

    }
        public static void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }

        public static void preorder(Node root) {
            if (root == null) {
    
                return;
            }
            System.out.println(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }


        public static void postorder(Node root) {
            if (root == null)
                return;
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // level order traversal

        public static void levelOrderTraversal(Node root) {

            if (root == null) {

                return;
            }
            Queue<Node> q = new LinkedList<>();

            q.add(root);

            q.add(null);

            while (!q.isEmpty()) {

                Node curNode = q.remove();
                if (curNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {

                    System.out.print(curNode.data + " ");

                    if (curNode.left != null) {
                        q.add(curNode.left);
                    }

                    if (curNode.right != null) {
                        q.add(curNode.right);
                    }
                }

            }

        }

        // height of a tree

        public static int height(Node root) {

            if (root == null)
                return 0;
            return Math.max(height(root.left), height(root.right)) + 1;
        }

        public static int countNode(Node root) {
            if (root == null)
                return 0;
            return countNode(root.left) + countNode(root.right) + 1;
        }

        public static int SumOfNodes(Node root) {
            if (root == null)
                return 0;

            return SumOfNodes(root.left) + SumOfNodes(root.right) + root.data;
        }

        // Approch 1

        // TREE DIAMETER O(n^2)

        public static int lengthOfTree(Node root) {
            if (root == null)
                return 0;

            int leftDiam = lengthOfTree(root.left);
            int lefth = height(root.left);
            int rigthDiam = lengthOfTree(root.right);
            int right = height(root.right);

            int selfDiam = lefth + right + 1;

            return Math.max(Math.max(leftDiam, rigthDiam), selfDiam);

        }

        static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        /// Approch 2

        public static Info lengthOfTree2(Node root) {

            if (root == null)
                return new Info(0, 0);

            Info leftInfo = lengthOfTree2(root.left);
            Info rightInfo = lengthOfTree2(root.right);

            int dia = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(dia, ht);

        }

    

    public static boolean subtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        return subtree(root.left, subroot) || subtree(root.right, subroot);

    }

    public static boolean isIdentical(Node node, Node subroot) {
        if (node == null && subroot == null)
            return true;
        else if (node == null || subroot == null || node.data != subroot.data)
            return false;

        if (!isIdentical(node.left, subroot.left))
            return false;
        if (!isIdentical(node.right, subroot.right))
            return false;

        return true;
    }

    static class info {
        Node node;
        int hd;

        public info(Node node, int hd) {
            this.node = node;
            this.hd = hd;

        }
    }

    public static void topView(Node root) {
        // level order TRAVERSAL
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;

        q.add(new info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            info curr = q.remove();

            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {

                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {

                    q.add(new info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {

                    q.add(new info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + "  ");
        }

    }

    public static void KthLevelOfTree(Node root, int level, int k) {
        if (root == null)
            return;

        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }

        KthLevelOfTree(root.left, level + 1, k);
        KthLevelOfTree(root.right, level + 1, k);
    }

    public static Node lca(Node root, int n1, int n2) {

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getpath(root, n1, path1);
        getpath(root, n2, path2);

        // last common ancestor

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {

            if (path1.get(i) != path2.get(i)) {
                break;
            }

        }

        Node lca = path1.get(i - 1);
        return lca;
    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null)
            return false;
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundleft = getpath(root.left, n, path);
        boolean foundright = getpath(root.right, n, path);

        if (foundleft || foundright)
            return true;

        path.remove(path.size() - 1);

        return false;
    }

    public static Node lca2(Node root, int n1, int n2) {

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftl = lca2(root.left, n1, n2);
        Node rightl = lca2(root.right, n1, n2);

        // left =valid but right = null

        if (leftl == null) {
            return rightl;
        }

        if (rightl == null) {
            return leftl;
        }

        return root;

    }

    // minimum distance Node
    public static int MinDistanceNode(Node root, int n1, int n2) {

        Node lca = lca2(root, n1, n2);

        int dist1 = lcaDist(lca, n1);

        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;

    }

    public static int lcaDist(Node root, int n) {
        if (root == null)
            return -1;

        if (root.data == n)
            return 0;

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1)
            return -1;
        else if (leftDist == -1)
            return rightDist + 1;
        else
            return leftDist + 1;

    }

    // kth ancestor of node
    public static int kthAncestor(Node root, int n, int k) {
        if (root == null)
            return -1;

        if (root.data == n)

            return 0;

        int leftdist = kthAncestor(root.left, n, k);

        int rightdist = kthAncestor(root.right, n, k);

        if (leftdist == -1 && rightdist == -1)
            return -1;

        int max = Math.max(leftdist, rightdist);

        if (max + 1 == k) {
            System.out.println(root.data);
        }

        return max + 1;
    }


    //  transform to sum Tree

    public static int  TransfromToSumTree(Node root ) {
        
        if(root == null )return 0;

        int leftchi =  TransfromToSumTree(root.left);
        int rightchi =  TransfromToSumTree(root.right);

      int data = root.data;
      int newleft =  root.left == null ? 0:root.left.data;
      int newright =  root.right == null ? 0:root.right.data;

      root.data = newleft+ leftchi + rightchi +newright;
      
 
     return data;
    }

    

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTRee(node);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);

        // tree.levelOrderTraversal(root);

        // System.out.println("Hight of tree " + tree.height(root));

        // System.out.println("Sum of Node " + tree.SumOfNodes(root));

        // System.out.println("Number of Node " + tree.countNode(root));

        // System.out.println("Diameter of a Tree "+tree.lengthOfTree(root));

        // System.out.println("Approch2 Diameter of a tree

        // "tree.lengthOfTree2(root).diam);

        // System.out.println(subtree(root, subroot));

        // topView(root);

        // KthLevelOfTree(root, 1, 2);

        // System.out.println( lca(root, 4, 5).data);

        // System.out.println(lca2(root ,4,5).data);

        // System.out.println(MinDistanceNode(root, 4, 6));

        // kthAncestor(root, 5, 1);
  

        TransfromToSumTree(root);

        levelOrderTraversal(root);

    }

}