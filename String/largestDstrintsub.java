import java.util.HashSet;

public class largestDstrintsub {
    public static void main(String[] args) {
        String s ="aaa";
        System.out.println(find(s));
    }

    private static int find(String s) {

        HashSet<Character> h = new HashSet<>();
        int max =0;
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(h.contains(s.charAt(i))){
                
             max = Math.max(max,sb.length());
             h.removeAll(h);
             sb.delete(0,sb.length());

             h.add(s.charAt(i));
             sb.append(s.charAt(i));    

            }else{
             sb.append(s.charAt(i));
             h.add(s.charAt(i));

            }
        }

     
      
        return max;
    }
}
