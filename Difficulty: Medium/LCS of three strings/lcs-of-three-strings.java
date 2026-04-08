class Solution {
    int lcsOf3(String s1, String s2, String s3) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int o = s3.length();
        int dp[][][] = new int[n + 1][m + 1][ o + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= m; j++){
                for(int k = 0; k <= o; k++){
                    if(i == 0 || j == 0 || k == 0){
                        dp[i][j][k] = 0;
                    }
                    else if(s1.charAt(i - 1) == s2.charAt(j - 1) && s1.charAt(i - 1)
                    == s3.charAt(k - 1)){
                        dp[i][j][k] = 1 + dp[i - 1][j - 1][k - 1];
                    }else{
dp[i][j][k] = Math.max(Math.max(dp[i - 1][j][k] , dp[i][j - 1][k]) , dp[i][j][k - 1]);
                    }
                }
            }
        }
        return dp[n][m][o];
    }
}