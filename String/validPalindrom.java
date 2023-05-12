public class validPalindrom {
    public static void main(String[] args) {
        String str ="Race car";
       
        System.out.println(palindrom1(str));
    }

     // first approch
    public static boolean palindrom1(String s) {
        String str = s.toLowerCase();
        StringBuilder st = new StringBuilder();
       

        for(int i =0;i<str.length();i++){

            if((48<=str.charAt(i) && str.charAt(i)<=57) || (65<=str.charAt(i) && str.charAt(i)<=90) || (97<=str.charAt(i) && str.charAt(i)<=122)){
              
               st.append(str.charAt(i));
            }
          
        }

        StringBuilder neStr = new StringBuilder();

        for(int i =st.length()-1;i>=0;i--){
            neStr.append(st.charAt(i)) ;
        }

        System.out.println(">>"+neStr);

        if(neStr.compareTo(st)==0){
            return true;
        }

        return false;

    }


     // second approch
    public static boolean palindrom2(String s) {
       int i = 0, j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                ++i;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {\
                --j;
            } else if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else {
                ++i;
                --j;
            }
        }
        return true;
    }
   

}
