public class rotations {
    
    public static void main(String[] args) {
        String s1= "forgeeks";
        String s2 = "forgeeks";

         System.out.println(check(s1,s2));

    }

    public static boolean check(String s1, String s2) {
        if(s1.length()==s2.length())return false;
        int inx = s1.indexOf(s2.charAt(0));
        int l =s1.length()-s1.indexOf(s2.charAt(0)); 
        int  e = inx;
        // for(int i=0;i<l;i++,e++){
        //     if(s1.charAt(e+i)!=s2.charAt(i)){
        //         return false;
        //     }
           
        // }

        // for(int i=0;i<inx;i++){
        //     if(s1.charAt(i)!=s2.charAt(l)){
        //        return false;
        //     }
        //     l++;
        // }
        System.out.println(l+"hbjk");
        return true;
    }



    

    // private static boolean check(String s1, String s2) {
     
    //     if(sort(s1).compareToIgnoreCase(sort(s2))==0)return true;

    //     return false;
    // }

    // public static String sort(String s) {
    //     char a[] = s.toCharArray();
    //     Arrays.sort(a);
        
    //    return new String(a);
    // }
}
