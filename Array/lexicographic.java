public class lexicographic {
    public static void check(String s[]) {
        String largest = s[0];
        for(int i =0;i<s.length;i++){
            if(largest.compareToIgnoreCase(s[i])>0){
                largest = s[i];
            }
        }
        System.out.println(largest);

    }
    public static void main(String[] args) {
        String s[]= {"apple","mango","banana"};
        check(s);
    }
}
