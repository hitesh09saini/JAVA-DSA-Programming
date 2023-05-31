
public class maxContainer {
    public static void main(String[] args) {
        int hight[]= {1,5,4,3};
        int n = hight.length;
         int i = 0;
         int j = n-1;
         int max = 0;
         int left[]=new int[n];
         int right[]= new int[n];
         // left 
        for(int a=0;a<n;a++){

           if(max<hight[a]){
             max=hight[a];
           }
           left[a]=max;
        }
        // right
         max = n-1;
        for(int a=0;a<n;a++){

            if(max<hight[a]){
                max=hight[a];
              }
              right[a]=max;
        }

       // find area

       int area=0 ;max=0;
    for( i =0;i<n;i++){
           

        while(hight[i]<hight[j]){
          
            if(left[i]<right[j]){
               area = left[i]*j;
               i++;
            }else{
              area= right[j]*(j-i);
              j--;
            }
            System.out.println(area);
            if(area>max){
                max= area;
            }
        }
    }
        System.out.println(max);
    }
}
