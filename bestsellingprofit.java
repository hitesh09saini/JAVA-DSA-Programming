public class bestsellingprofit {

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int profit = 0;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int arr[] = new int[prices.length];
        

        for (int i = arr.length - 1; i >= 0; i--) {
            if (max < prices[i]) {
                max = prices[i];
                arr[i] = max;
            } else {
                arr[i] = max;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            ans = arr[i] - prices[i];
            profit = Math.max(profit, ans);
    
        }
        System.out.println(profit);
    }
}
