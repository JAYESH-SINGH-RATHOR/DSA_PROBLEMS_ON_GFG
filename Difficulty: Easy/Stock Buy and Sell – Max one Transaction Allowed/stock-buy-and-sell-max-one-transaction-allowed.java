class Solution {
    public int maxProfit(int[] prices) {
        // Code here
      int n = prices.length;
      int profit = 0;
      int minprice = Integer.MAX_VALUE;
      for(int i = 0; i < n; i++){
          minprice = Math.min(minprice , prices[i]);
          int maxprofit =  prices[i]  - minprice;
          profit = Math.max(profit , maxprofit);
      }
     return profit;
    }
}