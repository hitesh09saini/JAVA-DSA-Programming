public class shortestpath {
    public static void SHORTPATH(String a) {
         int x =0,y=0;
         for(int i =0; i<a.length();i++){
            char dir = a.charAt(i);
            // south 
            if(dir =='S'){
               y--;
            }
            if(dir =='N'){
               y++;
            }
            if(dir == 'E'){
              x++;
            }
            if(dir =='W'){
                x--;
            }
            
         }
         int x2 = x*x,y2=y*y;
        System.out.println(Math.sqrt(x2+y2));
    }
    public static void main(String[] args) {
        String path ="WNEENESENNN";
        SHORTPATH(path);
    }
}
