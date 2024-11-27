class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyDay = 0;
        for(int sellDay=0;sellDay<prices.length ;sellDay++){
            int profit = prices[sellDay] - prices[buyDay];
            maxProfit = Math.max(profit,maxProfit);

            if(profit<=0) buyDay = sellDay; 
        }
        return maxProfit;

    }
}