// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        // Your code here
        int dp[] = new int[n];
         Arrays.fill(dp , -1);
           for(int i = 0; i < n; i++){
            dp[i] = sol(i, dp);
        }
         return dp;
    }
   static int sol(int n , int dp[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = sol(n - 1 , dp) + sol(n - 2 , dp);
        return dp[n];
    }
}