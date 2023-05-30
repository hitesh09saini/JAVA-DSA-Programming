package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class nonRepeatingl {
    static int map[] = new int[26];

    public static void main(String[] args) {
        String s = "aabcccxb";
        repeate(s);
    }

    public static void repeate(String s) {
        Queue<Character> q = new LinkedList<>();
        
       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            map[ch - 'a']++;

            while(!q.isEmpty()&& map[q.peek()-'a']>1){
              q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }

    
    }

  
}
