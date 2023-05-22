public class rotateImage {
    public static void main(String[] args) {
        int img[][] = {{1,2,3},{4,5,6},{7,8,9}};
        RotateImg(img);
    }

    public static void RotateImg(int [][]img) {
        int newim[][] = new int[img.length][img[0].length];
        
        
            for(int j=0;j<img.length;j++){
                for(int i = img.length-1;i>=0;i--){

                System.out.print(img[i][j]+" ");
              }System.out.println();
        }
        // for(int i =0;i<img.length;i++){
        //     for(int j=0;j<img.length;j++){
        //         System.out.print(newim[i][j]+" ");
        //     }System.out.println();
        // }
    }
}
