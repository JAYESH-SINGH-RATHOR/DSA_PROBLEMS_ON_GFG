// class Solution {
//     public int maxProfit(int[] prices) {
//         // Code here
//         int buyp = Integer.MAX_VALUE;
//         int profit = 0;
//         for(int i = 0; i < prices.length; i++){
//             buyp = Math.min(buyp , prices[i]);
//             profit = Math.max(profit , prices[i] - buyp);
//         }
//         return profit;
//     }
// }

// method (02) -> using dynamic programming // 

class Solution {
    public int maxProfit(int[] prices) { 
        int n = prices.length;
        int dp[] = new int[n];
        dp[0] = 0;
        int buyprice = prices[0];
        for(int i = 1; i < n; i++){
            buyprice = Math.min(buyprice , prices[i]);
            dp[i] = Math.max(dp[i - 1] , prices[i] - buyprice);
        }
        return dp[n - 1];
    }
}