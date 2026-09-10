// class Solution {
//     static int nthFibonacci(int n) {
//         // code here
//         if(n == 0){
//             return 0;
//         }
//         if(n < 3){
//             return 1;
//         }
//         return nthFibonacci(n - 1) + nthFibonacci(n - 2);
//     }
// }

class Solution {
    static int nthFibonacci(int n) {
    int dp[] = new int[n + 1];
    if(n == 0){
        return 0;
    }
    if(n == 1){
        return 1;
    }
    dp[0] = 0;
    dp[1] = 1;
    for(int i = 2; i <= n; i++){
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
    }
}