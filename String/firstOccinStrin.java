public class firstOccinStrin {
    public static void main(String[] args) {
        String a1 = "sadbutsad";
        String a2 = "but";

        System.out.println(firstOcc(a1, a2));
    }

    public static int firstOcc(String a1, String a2) {
        int s =0;
        int e = a1.length();
        int e1 = a2.length();

        if(a1.length()<a2.length())return -1; //condition

        while(s<e-e1+1){

           if(a1.substring(s, s+e1).compareTo(a2)==0)return s;

          s++;
         
        }

        return -1;
    }
}
