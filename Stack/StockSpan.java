import java.util.Stack;

public class StockSpan {
    
    public static void main(String[] args) {
        int Stock[] = {100 ,80 ,60 ,70 ,60 ,85 ,100};
        int span[] = new int[Stock.length];
        stockSpan(Stock ,span);

        for(int i =0;i<span.length ;i++){
            System.out.println(span[i]+" ");
        }
    }

    public static void stockSpan(int[] stock, int[] span) {
         Stack<Integer> s = new Stack<>();
         span[0] =1;
         s.push(0);

         for(int i=1; i<span.length;i++){
            int curr = stock[i];
            while(!s.isEmpty()&& curr >stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;

            }else{
                int prev = s.peek();
                span[i] = i-prev;
            }
            s.push(i);
         }
    }
}
