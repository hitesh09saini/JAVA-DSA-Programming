package binarySearchTree;

public class p3 {

    static class Node {

        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            right = left = null;
        }

    }

    public static void main(String[] args) {
        Node r = new Node(1);
        r.left = new Node(2);
        r.right = new Node(3);
       
        Node r1 = new Node(1);
        r1.left = new Node(2);
        r1.right = new Node(3);

        // System.out.println(Hight(r));

        // System.out.println(isBalanced(r));

        System.out.println(isIdentical(r, r1));



    }


    

    private static boolean isIdentical(Node root1, Node root2) {

        if(root1==null&&root2==null)return true;
	    
        if((root1==null&&root2!=null)|| (root1!=null&&root2==null))return false;
        
        if(root1.data!=root2.data)return false;
        
        return isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right);
    }

    private static int Hight(Node r) {

        if (r == null)
            return 0;

        if (r.left == null && r.left == null) {
            return 0;
        }

        int leftHight = Hight(r.left);
        int rightHight = Hight(r.right);

        return Math.max(leftHight, rightHight) + 1;
    }

    public static boolean isBalanced(Node root) {
        if(root == null)return true;

        int r=  Hight(root.right);
        int l = Hight(root.left);

        if(Math.abs(r-l)>1){
            return false;
        }

       return  (true&&isBalanced(root.right)&&isBalanced(root.left));
     
    }

}
