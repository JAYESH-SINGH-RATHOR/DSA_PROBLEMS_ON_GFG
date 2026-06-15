class Solution {
    public int maxProfit(int[] prices) {
        // Code here
     int n = prices.length;
     int buyp = Integer.MAX_VALUE;
     int profit = 0;
     for(int i = 0; i < n; i++){
         buyp = Math.min(buyp , prices[i]);
         profit = Math.max(profit , prices[i] - buyp);
     }
     return profit;
    }
}