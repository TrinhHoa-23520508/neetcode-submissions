class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minBuy = prices[0];
        for(int i = 1; i<prices.length; i++){

            int sell = prices[i];
            maxProfit = Math.max(maxProfit, sell-minBuy);
            minBuy = Math.min(minBuy, sell);

        }

        return maxProfit;
        
    }
}
