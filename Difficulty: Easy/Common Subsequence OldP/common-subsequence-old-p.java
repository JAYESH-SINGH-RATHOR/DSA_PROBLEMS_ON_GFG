// User function template for Java
class Solution {
    static int commonSubseq(String S1, String S2) {
        // code here
        int n =S1.length();
        int m = S2.length();
        int dp[][] = new int[n + 1][m + 1];
        if(n == 0 || m == 0){
            return 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(S1.charAt(i - 1) == S2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else{
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m] > 0 ? 1 : 0;
    }
}