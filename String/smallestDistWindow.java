import java.util.ArrayList;

import java.util.HashSet;

public class smallestDistWindow {
    public static void main(String[] args) {
        String s= "aaab";

        
        System.out.println(find(s));
    }

    private static int find(String str) {
   
        // Your code goes here
        int n=str.length();
        int min=n;
        // count the total unique words in letter
        boolean c[]=new boolean[256];
        int t=0;
        for(int i=0;i<n;i++){
            if(c[str.charAt(i)]==false) 
            t++;
            c[str.charAt(i)]=true;
        }
        // store count of letters 
        int ch[]=new int[256];
        // use two pointers
        int j=1;
        int i=0;
        // temp count of unique words in slide window
        int count=1;
        ch[str.charAt(0)]++;
        while(i<=j && j<str.length())
        {
            if(count<t)
            {
                if(ch[str.charAt(j)]==0) count++;
                ch[str.charAt(j)]++;
                j++;
                
            }
            else if(count==t)
            {
                min=Math.min(min,j-i);
                if(ch[str.charAt(i)]==1) count--;
                ch[str.charAt(i)]--;
                i++;
            }
        }
        while(count==t)
            {
                min=Math.min(min,j-i);
                 if(ch[str.charAt(i)]==1) count--;
                ch[str.charAt(i)]--;
                i++;
            }
           
            return min;
    
}
}
