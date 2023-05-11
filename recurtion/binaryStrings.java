package recurtion;
// paytem
public class binaryStrings {
    public static void main(String[] args) {
       binaryPrint(3, 0, "");
    }

    public static void binaryPrint(int n,int lastplace ,String str ) {
        if(n == 0){
            System.out.println(str);
            return;
         }

        // kaam


        // if(lastplace==0){

        //    // sit 0 on chair
        //    binaryPrint(n-1, 0,str+"0" );
        //    // 
        //    binaryPrint(n-1, 1, str+"1");
        // }else{
        //     binaryPrint(n-1, 0, str+"0");
        // }


            binaryPrint(n-1, 0, str+"0");
        if(lastplace==0){
            binaryPrint(n-1, 1, str+"1");
        }

    }
}
