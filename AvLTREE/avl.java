package AvLTREE;

public class avl {
    
    static class Node{
        int data,height;
        Node left,right;

        Node(int data){
            this.data = data;
            height =1;

        }
    }

    public static Node root;

    public static int hight(Node root) {
        if(root == null)return 0;

        return root.height;
    }


    static int max(int a,int b){
        return (a>b)? a:b;
    }

    
}
