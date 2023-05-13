public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] ar = {"flower","flow","flight"};
        System.out.println(longestPrefix(ar));
    }

    public static String longestPrefix(String ar[]) {
        String result = ar[0];

        for(int i = 0;i< ar.length;i++){
         
           result =  common(result,ar[i]);

        }
       return result;
    }

    public static String common(String st1 ,String st2) {
        
        int n = Math.min(st1.length(), st2.length());
      
        StringBuilder sb = new StringBuilder();
     
        // comparition
        for(int i=0;i<n;i++){
         
            if(st1.charAt(i)==st2.charAt(i)){
                sb.append(st1.charAt(i));
            }else{
                break;
            }

        }
   
        return sb.toString();  // StringBuilder to String
    }
}
