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
}
