package recurtion.backtracking;

public class permutationStr {
    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
    public static void findPermutation(String st , String news ) {
        // base case
        if(st.length() == 0){
           
            System.out.println(news );
           
            return;
        }

        // recursion
       for(int i =0;i < st.length();i++){
        char curr = st.charAt(i);
        // abcde = ab+bc
        String newstr = st.substring( 0,i)+st.substring(i+1);
        findPermutation(newstr, news+curr);

       }



    }
}
