public class Wildcardstringmatching {
    public static void main(String[] args) {
        String wild = "geek*s?", pattern = "geeks";

        StringBuilder str = new StringBuilder(wild);

        for (int i = 0; i < wild.length(); i++) {

            if (wild.charAt(i) == '?') {
                if(pattern.length()-1>i){
                    str.setCharAt(i, pattern.charAt(i));
                }else{
                    str.deleteCharAt(i);
                    
                }
               
            }

            if (wild.charAt(i) == '*') {
                if (i == wild.length() - 1) {
                    str.deleteCharAt(i);
                    str.append(pattern.substring(i));
                } else {
                    StringBuilder sb = new StringBuilder("");
                    int s = i, e = pattern.length() - 1;
                   
                    char ch = wild.charAt(i + 1);
                    while (s < e) {
                        if (pattern.charAt(s) == ch) {
                            break;
                        }
                        sb.append(pattern.charAt(s));
                        s++;
                    }
                   StringBuilder stre = new StringBuilder();
                 
                    stre.append(str.substring(0, i+1));
                    stre.append(sb);
                    stre.append(str.substring(i+1));
                    stre.deleteCharAt(i);
                    str = new StringBuilder();
                    str = stre;
                }
            }
        }
           System.out.println(wild);
           System.out.println(str);
           System.out.println(pattern);
        if (pattern.compareTo(str.toString()) == 0) {
            System.out.println("right");
        }
    }
}
