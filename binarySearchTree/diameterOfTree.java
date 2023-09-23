package binarySearchTree;

public class diameterOfTree {
    
    static class Node{
        int data;
        Node left, right;
        
        Node(int d){
            this.data = d;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right= new Node(5);
        root.left.right.right= new Node(6);
        root.left.right.right.right= new Node(7);

        System.out.println(diameter1(root).diameter);
    }

    private static int diameter(Node root) {

        if(root == null)return 0;

        int lh = height(root.left);
        int ld = diameter(root.left);
        int rh = height(root.right);
        int rd = diameter(root.right);


        return Math.max(lh+rh+1, Math.max(ld,rd));
    }

    public static int height(Node root){

        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right))+1;
        
    }


    static class Info{
        int height;
        int diameter;

       public Info(int h, int d){
            this.height = h;
            this.diameter = d;
        }
    }

    public static Info diameter1(Node root){
        if(root == null)return new Info(0,0);
        
         Info leftInfo = diameter1(root.left);
         Info rightInfo = diameter1(root.right);

         int diam = Math.max(leftInfo.height+rightInfo.height+1, Math.max(leftInfo.diameter, leftInfo.diameter));
         int ht = Math.max(leftInfo.height,rightInfo.height)+1;

         return new Info(ht, diam);
    }

}
