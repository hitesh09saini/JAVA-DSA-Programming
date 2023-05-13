public class printAllDup {
    public static void main(String[] args) {
        String st = "hitesh";
        char ch = 'h';
        count(st, ch);
    }

    public static void count(String st ,char ch) {
        int count=0;
        for(int i= 0;i<st.length();i++){
            if(st.charAt(i)==ch)count++;
        }
        System.out.println(ch+", "+count);
    }
}
