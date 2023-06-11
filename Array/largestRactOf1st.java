import java.util.Arrays;

public class largestRactOf1st {
    public static void main(String[] args) {
        boolean a[][] ={
        {false,true,false,true,false},
        {false,true,true,true,true},
        {true,true,true,false,true},
        {true,true,true,true,true}};

        System.out.println(a.length);
        System.out.println(LargestArea(a,a.length,a[0].length));
    }

    public static int LargestArea(boolean[][] a, int r, int c) {
           
        int ar[]= new int[c];

        for(int i=0;i<r;i++){

            for(int j=0;j<c;j++){
                 if(a[i][j]){
                    ar[j]+=1;
                 }else{
                    ar[j]=0;
                 }

            }
        }

        Arrays.sort(ar);

        int Area[]= new int[c];
        
        for(int j=0;j<c;j++){
            Area[j]= ar[j]*(c-j);
        }

        Arrays.sort(Area);

    
        return Area[c-1];

        
    }
}
