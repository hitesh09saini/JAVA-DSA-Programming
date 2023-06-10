package binarySearchTree;

import java.util.ArrayList;

public class bst2 {
    public static class Node{

        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

     public static Node insert(Node root,int val) {
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data >val ){
            // left subtree
          root.left =  insert(root.left, val);
        }else{
            // right subtree
           root.right =  insert(root.right, val);
        }

        return root;
    }


    public static void main(String[] args) {
       Node root= new Node(50);
       root.left = new Node(30);
       root.right =new Node(60);
       root.left.left = new Node(5);
       root.left.right = new Node(20);

       root.right.left =new Node(45);
       root.right.right = new Node(70);
       root.right.right.left = new Node(65);
       root.right.right.right =new Node(80);
    //    Inorder(root);
       Info info = largestBST(root);
       System.out.println("largest BST Size = "+maxBst);
      

    }
    
     public static void getInorder(Node root ,ArrayList<Integer> li) {

        if (root == null)
            return;

        getInorder(root.left,li);
        // System.out.print(root.data+" ");
        li.add(root.data);
        getInorder(root.right,li);
    }

    
   
    public static Node balanceBST(Node root) {
        /// inorder seq
        ArrayList<Integer> in = new ArrayList<>();
        getInorder(root, in);

        // balance seq
        root= CreateBST(in, 0, in.size()-1);

       return root;
    }

    public static Node CreateBST(ArrayList<Integer> li,int s,int e) {
      if( s>e)return null;
       
        int mid = (s+e)/2;
        Node root =new Node(li.get(mid));

        root.left = CreateBST(li, s,mid-1);
        root.right = CreateBST(li, mid+1,e);

        return root;
    }

    public static Node BalanacedBST(int a[],int s,int e) {
      if( s>e)return null;
       
        int mid = (s+e)/2;
        Node root =new Node(a[mid]);

        root.left =BalanacedBST(a, s,mid-1);
        root.right =BalanacedBST(a, mid+1,e);

        return root;
    }

    public static void Inorder(Node root ) {

        if (root == null)
            return;

       Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }
     

    // size of large Bst 

    static class Info{
        boolean isBst;
        int size;
        int min;
        int max;

        public Info(boolean b ,int s ,int m ,int mx){
        
            this.isBst = b;
            this.size = s;
            this.min = m;
            this.max = mx;
        }
    }

    public static int maxBst =0;

    public static Info largestBST(Node root){

        if(root ==   null){
            return new Info(true,0 ,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }

      Info leftIfo =  largestBST(root.left);
      
      Info rightIfo = largestBST(root.right);

      int size = leftIfo.size +rightIfo.size+1;
      int min = Math.min(root.data,Math.min(leftIfo.min, rightIfo.min));
      int max = Math.max(root.data,Math.max(leftIfo.max, rightIfo.max));

      if(root.data <= leftIfo.max || root.data>= rightIfo.min){
          return new Info(false, size, min, max);
      }

      if(leftIfo.isBst && rightIfo.isBst){
        maxBst = Math.max(maxBst ,size);
          return new Info(true, size, min, max);
      }

      return new Info(false, size, min, max);

    }

}
