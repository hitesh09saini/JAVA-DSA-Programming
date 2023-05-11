package recurtion;

public class removeDuplicate {
    public static void main(String[] args) {
        boolean map[] = new boolean[25];
        String str = "hitehssah";
        remove(str, map, new StringBuilder(), 0);
    }

    public static void remove(String st, boolean map[], StringBuilder s, int inx) {
        // base
        if (inx == st.length()) {
            System.out.println(s);
            return;
        }

        // kaam
        
        if (map[st.charAt(inx) - 'a']) {
            remove(st, map, s, inx + 1);
        }
        else
        {
            map[st.charAt(inx)-'a'] = true;
            remove(st, map, s.append(st.charAt(inx)), inx+1);
        }
    }
}
