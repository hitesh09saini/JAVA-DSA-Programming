public class waterContainer {
    public static void main(String[] args) {
        int a[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
       
        int max = 0;
        for (int i = 0; i < a.length; i++) {

            int s = 0;
            int e = a.length - 1;

            while (a[i] > a[s])
                s++;
            while (a[i] > a[e])
                e--;

            int result = a[i] * (e - s);

            if (max < result) {
                max = result;
            }

        }
        System.out.println("Max Area of container is : "+max);

    }

   
}
