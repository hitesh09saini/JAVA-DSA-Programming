
public class Smallestwindowcon {
    
    public static void main(String[] args) {
        String str = "1210";
     
        System.out.println(check(str));
    }

    public static int check(String str) {
       int zero =-1,one=-1,two =-1;
       int mini,maxi,ans = Integer.MAX_VALUE;
       for(int i =0;i<str.length();i++){
        if(str.charAt(i)=='0')zero =i;
        if(str.charAt(i)=='1')one =i;
        if(str.charAt(i)=='2')two =i;

        if(zero !=-1 && one !=-1 &&two !=-1){
         mini= Math.min(one, Math.min(zero, two));
         maxi= Math.max(one, Math.max(zero, two));
         ans = Math.min(ans, (maxi -mini+1));
        }

       }

       if(ans != Integer.MAX_VALUE){
        return ans;
       }
       
       return -1;
    }

 
}
