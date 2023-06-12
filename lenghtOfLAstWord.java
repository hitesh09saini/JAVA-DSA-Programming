public class lenghtOfLAstWord {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(find(s));
    }

    private static int find(String s) {
       int l=0;
       s = s.trim();
        for(int i=s.length()-1;i>=0;i--){
             
            if(!((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))&& l>0){
                System.out.println(s.charAt(i));
                return l;
            }
             System.out.println(s.charAt(i));
            l++;
            
        }

        return l;
    }
}
