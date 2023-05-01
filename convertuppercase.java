public class convertuppercase {
    public static void main(String[] args) {
        String s = "hi, i am hitesh saini";
           toeachuppercase(s);
           tofirstuppercase(s);
    }

    public static void toeachuppercase(String s) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && i < s.length() - 1) {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }System.out.println(sb.toString());

    }
    public static void tofirstuppercase(String s) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);
        for (int i = 1; i < s.length(); i++) {
          
                sb.append(s.charAt(i));
           
        }System.out.println(sb.toString());

    }

}
