class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentProfit = 0;

        for(int i = 0; i<prices.length-1; i++){

            int j = i+1;
            currentProfit = 0;
            while(j<prices.length){

                if(prices[j]<=prices[i]){
                    j++;
                    continue;
                }

                if((prices[j]-prices[i]>currentProfit)) currentProfit = prices[j]-prices[i];
                j++;
            }

            if(currentProfit>maxProfit) maxProfit = currentProfit;
        }

        return maxProfit;
    }
}
