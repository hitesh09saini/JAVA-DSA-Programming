package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeA {
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int inx = -1;
        public static Node buildTRee(int nodes[]) {
            
            inx++;
            if(nodes[inx] == -1){
                return null;
            }

            Node newnode =  new Node(nodes[inx]);
            newnode.left = buildTRee(nodes);
            newnode.right = buildTRee(nodes);

            return newnode;
        }

        public static void preorder(Node root) {
              if(root == null){

                return;
              }
              System.out.println(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root) {
            if(root ==null)return;       
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
        public static void postorder(Node root) {
             if(root ==null )return;
             postorder(root.left);
             postorder(root.right);
             System.out.print(root.data+" ");
        }

        public static void levelOrderTraversal(Node root) {
            if(root == null ){
               return ;
            }
              Queue<Node> q = new LinkedList<>();

              q.add(root);
              q.add(null);
        
              while(!q.isEmpty()){
                Node curNode = q.remove();
                if(curNode ==null ){
                    System.out.println();
                    if(q.isEmpty()){
                     break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.println(curNode.data+" ");
                }

              }

        }
        
    } 


    

    
    public static void main(String[] args) {
        int node[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTRee(node);

        tree.inorder(root);   
        
        tree.preorder(root);

        tree.postorder(root);
        
    }
}
