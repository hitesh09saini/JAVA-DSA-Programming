public class profit {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        int  profit= 0;
        int ans = 0;


        for(int i = 0;i < prices.length; i++){
             
           
            for(int j =i+1;j < prices.length;j++){
                  
                  if(prices[i] < prices[j]){

                      ans = prices[j]-prices[i];
                   
                  }
                   profit = Math.max(profit,ans);
                  
            }  
        }System.out.println(profit);
    }
}

