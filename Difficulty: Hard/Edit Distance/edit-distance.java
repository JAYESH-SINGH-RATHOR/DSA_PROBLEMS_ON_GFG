class Solution {
    public int editDistance(String s1, String s2) {
        // Code here
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                if(i == 0){
                    dp[i][j] = j;
                }else if(j == 0){
                    dp[i][j] = i;
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                int add = dp[i][j - 1] + 1;
                int rom = dp[i - 1][j] + 1;
                int rep = dp[i - 1][j - 1] + 1;
                dp[i][j] = Math.min(add , Math.min(rep , rom));
                }
                
            }
        }
        return dp[n][m];
    }
}