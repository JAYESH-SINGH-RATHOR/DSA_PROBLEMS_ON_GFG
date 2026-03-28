class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        
        // using only recursion 
        // int n = val.length;
        // return knapsackrec(W , val , wt , n);
        
        return knapsackTab(W , val , wt);
        
    }
    // int knapsackrec(int W , int val[] , int wt[] , int n){
    //     if(n == 0 || W == 0){
    //         return 0;
    //     }
    //     int pick = 0;
    //     if(wt[n - 1] <= W){
    //     pick = val[n - 1] + knapsackrec(W - wt[n - 1] , val , wt , n - 1 );
    //     }
    //     int notpick = knapsackrec(W , val , wt , n - 1);
    //     return Math.max(pick , notpick);
    // }
    
    // using tabulation method
    
    static int knapsackTab(int W , int val[] , int wt[] ){
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for(int i = 1; i <= n; i++){
            for(int j  = 1; j <= W; j++){
               int pick = 0;
               if(wt[i - 1] <= j){
                   pick = val[i - 1] + dp[i - 1] [j - wt[i - 1]];
               }
               int notpick = dp[i - 1][j];
               dp[i][j] = Math.max(pick , notpick);
            }
        }
            return dp[n][W];
    }
}
