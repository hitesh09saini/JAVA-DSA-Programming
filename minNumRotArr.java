public class minNumRotArr {

    public static void main(String[] args) {
        int rotateArr[] = { 3,4,5,1,2 };

        // int mid = rotateArr.length / 2;
        // int min = rotateArr[mid];
        // if (rotateArr.length > 2) {
        //     if (min > rotateArr[mid + 1]) {
        //         for (int i = mid + 1; i < rotateArr.length; i++) {

        //             if (min > rotateArr[i]) {
        //                 min = rotateArr[i];
        //             }
        //         }

        //     } else if (min < rotateArr[mid + 1]) {
        //         for (int i = mid - 1; i >= 0; i--) {
        //             if (min > rotateArr[i]) {
        //                 min = rotateArr[i];
        //             }
        //         }
        //     }
        // } else {
        //     if (min > rotateArr[0]) {
        //         min = rotateArr[0];
        //     }
        //     if(rotateArr.length==1){
        //         min = rotateArr[0];
        //     }

        // }

        // int min = rotateArr[0];
        // for(int i =1 ;i<rotateArr.length;i++){
        //     if(min>rotateArr[i]){
        //         min = rotateArr[i];
        //     }
        // }


      
       
        int st = 0,en =rotateArr.length-1;
        int ans = 0;

       while(st<en) {
         int mid  = ( st+en)/2;
  
          if(rotateArr[en]>rotateArr[mid] ){
            en = mid;
         

           }else{           
             st= mid+1;

           }
   
         }
        System.out.println(rotateArr[en]);
    }
}
