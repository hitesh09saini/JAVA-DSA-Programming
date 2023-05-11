public class stringbulider {
    public static void main(String[] args) {
        // Float i = 5f;
        // String s = i.toString();
        // System.out.println(s);

        StringBuilder sb = new StringBuilder();
        for(char ch ='a';ch<='z';ch++){
            sb.append(ch);
           
        }
        System.out.println(sb);
    }
}
