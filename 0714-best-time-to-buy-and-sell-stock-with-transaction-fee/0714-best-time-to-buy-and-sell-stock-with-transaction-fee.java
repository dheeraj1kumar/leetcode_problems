class Solution {
    public int maxProfit(int[] prices, int fee) {
           int profit = 0;
      int effBuyPrice = prices[0];
      for(int i = 1; i < prices.length; i ++) {
          profit = Math.max(profit, prices[i] - effBuyPrice - fee);
          effBuyPrice = Math.min(effBuyPrice, prices[i] - profit);
      }
      return profit;  
    }
}