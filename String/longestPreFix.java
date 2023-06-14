public class longestPreFix {
    
    public static void main(String[] args) {
        String s[] ={"geeksforgeeks","geeks","geek","geezer"};

        System.out.println(prefix(s));
    }

    public static String prefix(String[]s) {
      String prefix = s[0];
      for(int i=1;i<s.length;i++){
        
        while(s[i].indexOf(prefix) !=0){

            prefix = prefix.substring(0,prefix.length()-1);
      
            if(prefix.isEmpty()){
                return "-1";
            }
        }
      }

        return prefix;
    }

 public String lcp(String arr[])
    {
        // Write your code here
         String prefix = arr[0];
         int n = arr.length;
         
        for (int i = 1; i < n; i++) {

            int min = Math.min(prefix.length(), arr[i].length());

            int index = 0;

            while (index < min && prefix.charAt(index) == arr[i].charAt(index)) {

                index++;

            }

            prefix = prefix.substring(0, index);

        }

        return prefix.length() == 0 ? "-1" : prefix;

        
    }
}
