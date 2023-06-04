public class wateringofPlants {
    public static void main(String[] args) {
        int plants[]={2,2,3,3};

        int capacity =5;
        System.out.println(TotalSteps(plants ,capacity));
    }

    public static int TotalSteps(int[] plants, int capacity) {
        int c = capacity;
        int steps =0;
        for(int  i=0;i<plants.length;){

            if(capacity >= plants[i]){
               steps++;
               capacity -= plants[i];
               i++;
            }else{

                steps+= 2*i;
                capacity = c;
            }    
        }
        return steps;
    }
}
