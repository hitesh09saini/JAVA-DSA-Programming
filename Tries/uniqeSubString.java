package Tries;

import java.util.Arrays;

public class uniqeSubString {
     static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;
       
        public Node() {
            Arrays.fill(childern, null);
          
        }

    }
    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int inx = word.charAt(i) - 'a';
            if (curr.childern[inx] == null) {
                curr.childern[inx] = new Node();
            } 
            curr = curr.childern[inx];
        }

        curr.eow = true;
    }

    public static boolean searchPrefix(String key) {  
        Node curr = root;
         for(int i=0;i<key.length();i++){
            int inx = key.charAt(i)-'a';
            if(curr.childern[inx] == null){
               return false;
            }
          curr =curr.childern[inx];
          
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
