package Tries;

import java.util.Arrays;

public class wordBreakProblem {
    static class Node {
        Node childern[] = new Node[26];
        boolean eow = false;

        Node() {
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

    
    public static boolean search(String key) {  
        Node curr = root;
         for(int i=0;i<key.length();i++){
            int inx = key.charAt(i)-'a';
            if(curr.childern[inx] == null){
               return false;
            }
          curr =curr.childern[inx];
          
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key) {
        if(key.length() == 0)return true;
        for(int i=1;i<=key.length();i++){
            // substring(beg inx, last inx)
           if(search(key.substring(0, i)) && wordBreak(key.substring(i)))
            return true; 
        }
        return false;
    }

    public static void main(String[] args) {
        String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };
        String key = "ilikesam";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(wordBreak(key));
    }
}
