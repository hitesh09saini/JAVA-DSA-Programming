package Tries;

import java.util.Arrays;

public class prifixProbleam {
    static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            Arrays.fill(childern, null);
            freq =1;
        }

    }
    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int inx = word.charAt(i) - 'a';
            if (curr.childern[inx] == null) {
                curr.childern[inx] = new Node();
            } else {
                curr.childern[inx].freq++;
            }
            curr = curr.childern[inx];
        }

        curr.eow = true;
    }

   
    public static void UniqePrefix(Node root,String ans) {
         if(root == null)return;
         if(root.freq == 1){
            System.out.println(ans);
            return;
         }
        for (int i = 0; i < root.childern.length; i++) {
          
            if(root.childern[i] !=null){
                UniqePrefix(root.childern[i], ans+(char)(i+'a'));
            }
        }

       
    }

    public static void main(String[] args) {
        String words[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
       root.freq =-1;

      UniqePrefix(root , "");

    }
}
