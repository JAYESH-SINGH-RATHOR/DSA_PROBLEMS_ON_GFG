class Solution {
    public int nthFibonacci(int n) {
        // code here
        
        // memorization method
        int dp[] = new int[n + 1];
        Arrays.fill(dp , -1);
       return fib(n , dp);
    }
    int fib(int n , int dp[]){
        if(n == 0 || n == 1){
            return dp[n] = n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = fib(n - 1 , dp) + fib(n - 2 , dp);
        return dp[n];
    }
}