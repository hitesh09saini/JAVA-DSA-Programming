public class MinNumberofFlips {
    public static void main(String[] args) {
        String s = "001";
        flipsNumber(s,s.length());
    }

    private static void flipsNumber(String s, int n) {
        char pr = s.charAt(n-1);
        int c1=0,c2=0;
        for(int i=n-2;i>=0;i--){
           
            if(pr == s.charAt(i)){
                pr = pr=='1'?'0':'1';
                c1++;
            }else{
                pr = s.charAt(i);
            }
        }
         pr = s.charAt(0);
        for(int i=1;i<n;i++){
           
            if(pr == s.charAt(i)){
                pr = pr=='1'?'0':'1';
                c2++;
            }else{
                pr = s.charAt(i);
            }
        }
        System.out.println(Math.min(c1, c2));
    }
}
