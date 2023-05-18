public class countSubstrings {
    public static void main(String[] args) {
        String st = "aba";
      
        // broutForceCount(st);
       Count(st,"", 0, 0, 0);
    }


    // by recursion
    public static void Count(String st,String sb, int j, int count, int i) {
          

            if(j == st.length()&& i<=st.length()){
               
                i= i+1;
                j=i;
                sb= "";
            }

            // base case

            if (i == st.length()){
               System.out.println(count);
                return;
            }
           sb += st.charAt(j);

            if (sb.charAt(0) == sb.charAt(sb.length()-1))count++; 

            Count(st,sb,  j+1, count, i);
         
       
         
    }


    // brout force
    public static void broutForceCount(String st) {
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            String str = "";
            str += st.charAt(i);
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                count++;
            }

            for (int j = i + 1; j < st.length(); j++) {
                str += st.charAt(j);
                if (str.charAt(0) == str.charAt(str.length() - 1)) {
                    count++;
                }

            }

        }
        System.out.println(count);

    }

}
