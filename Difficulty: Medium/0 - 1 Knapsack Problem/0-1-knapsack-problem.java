class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        
        // using memoizations
        int n = val.length;
        int dp[][] = new int[val.length + 1][W + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                dp[i][j] = -1;
            }
        }
        return solvemem(W , val , wt , dp , n);
        // using recursion
        
        // int n = val.length;
        // return solve(W , val , wt , n);
    }
    // int solve(int W , int val[] , int wt[] , int n){
    //     if(n == 0 || W == 0){
    //         return 0;
    //     }
    //     if(wt[n - 1] <= W){
    //       int include = val[n - 1] + solve(W - wt[n - 1], val, wt, n - 1);
    //       int exclude = solve(W, val, wt, n - 1);
    //         return Math.max(include, exclude);

    //     }
    //     return solve(W, val, wt, n - 1);
    // }
    
    static int solvemem(int W , int val[] , int wt[] , int dp[][] , int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        
        if(wt[n - 1] <= W){
            int include = val[n - 1] + solvemem(W - wt[n - 1] , val , wt , dp , n - 1);
            int exclude = solvemem(W , val , wt , dp , n - 1 );
             dp[n][W] = Math.max(include , exclude);
            return dp[n][W];
        }
        dp[n][W] = solvemem(W , val , wt , dp , n - 1);
        return dp[n][W];
    }
}
