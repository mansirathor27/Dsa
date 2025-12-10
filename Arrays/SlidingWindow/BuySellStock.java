package Arrays.SlidingWindow;

public class BuySellStock {
    public int maxProfit(int[] prices){
        int maxProfit = 0;
        int left =0;
        for(int right = 1; right< prices.length; right++){
            if(prices[right]>prices[left]){
                int diff = prices[right]-  prices[left];
                maxProfit = Math.max(maxProfit, diff);
            }else{
                left = right;
            }
        }
        return maxProfit;
    }
}
