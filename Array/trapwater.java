public class trapwater {

    public static void main(String[] args) {
        int trap[] = {1,5,4,3 };
        int left[] = new int[trap.length];
        int right[] = new int[trap.length];
        int max = 0;

        // left
        for (int i = 0; i < left.length; i++) {

            if (max <= trap[i]) {
                max = trap[i];
            }

            left[i] = max;

        }
        max = 0;
        // right
        for (int i = left.length - 1; i >= 0; i--) {

            if (max <= trap[i]) {
                max = trap[i];
            }

            right[i] = max;

        }

        // calculate
        int min = 0;
        int totalTrap = 0;
        for (int i = 0; i < trap.length; i++) {
            if (left[i] < right[i]) {
                min = left[i];

            } else if (left[i] > right[i]) {
                min = right[i];
            } else {
                min = left[i];
            }

            totalTrap += min - trap[i];

        }

        System.out.println(totalTrap);

    }
}
