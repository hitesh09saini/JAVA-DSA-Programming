package Tries;

import java.util.Arrays;

public class longestordWithAllPrfix {
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

    public static  String ans ="";

    public static void longestWord(Node root, StringBuilder temp ) {
       
        if(root == null)return;

        for(int i=0;i<26;i++){
            if(root.childern[i] != null && root.childern[i].eow == true){
                char ch = (char)(i+'a');
                temp.append(ch);

                if(temp.length() > ans.length()){
                     ans = temp.toString();
                }
                longestWord(root.childern[i], temp);

                temp.deleteCharAt(temp.length()-1);
            }
        }


    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl","ap","apply","apple" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        
      
       longestWord(root, new StringBuilder());
        System.out.println(ans);
    }
}
