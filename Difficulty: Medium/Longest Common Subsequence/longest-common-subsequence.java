class Solution {
    static int lcs(String s1, String s2) {
        // code here
       int n = s1.length();
       int m = s2.length();
       if(n == 0 || m == 0){
           return 0;
       }
       int dp[][] = new int[n + 1][m + 1];
       
       for(int i = 1; i <= n; i++){
           for(int j = 1; j <= m; j++){
               if(s1.charAt(i - 1) == s2.charAt(j - 1)){
                   dp[i][j] = 1 + dp[i - 1][j - 1];
               }else{
                   dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
               }
           }
       }
       return dp[n][m];
    }
}


    // using stack but not for all the testcase its not good 
    
    //  Stack<Character> st = new Stack<>();
    //     int n = s1.length();
    //     int m = s2.length();
    //     if(n  == 0 || m == 0){
    //         return 0;
    //     }
        
    //     for(int i = 0; i < n; i++){
    //         st.push(s1.charAt(i));
    //     }
    //     int count = 0;
    //     for(int i = 0; i < m; i++){
    //         Stack<Character> temp = new Stack<>();
    //         while(!st.isEmpty()){
    //             char ch = st.pop();
    //             if(s2.charAt(i) == ch){
    //                 count++;
    //                 break;
    //             }
    //             temp.push(ch);
    //         }
            
    //         while(!temp.isEmpty()){
    //             st.push(temp.pop());
    //         }
    //     }
    //     return count;