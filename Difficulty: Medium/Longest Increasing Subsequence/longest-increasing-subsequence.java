class Solution {
    static int lis(int arr[]) {
        // code here
        // int n = arr.length;
        
        // HashSet<Integer> set = new HashSet<>();
        //  for(int i = 0; i < n; i++){
        //      set.add(arr[i]);
        //  }
         
        //  int m = set.size();
        //  int nums[] = new int[m];
        //  int k = 0;
        //  for(int i : set){
        //      nums[k++] = i;
        //  }
        //  Arrays.sort(nums);
         
        //  int dp[][] = new int[n + 1][m + 1];
        //  for(int i = 1; i <= n; i++){
        //      for(int j = 1; j<= m; j++){
        //          if(arr[i - 1] == nums[j - 1]){
        //              dp[i][j] = 1 + dp[i - 1][j - 1];
        //          }else{
        //              dp[i][j] = Math.max(dp[i - 1][j] , dp[i][j - 1]);
        //          }
        //      }
        //  }
        //  return dp[n][m];
        return lis2(arr);
         }
        static int lis2(int arr[]){
             int n = arr.length;
             int dp[] = new int[n];
             int max = 1;
             Arrays.fill(dp , 1);
             
             for(int i = 1; i < n; i++){
                 for(int j = 0; j < i; j++){
                     if(arr[i] > arr[j]){
                         dp[i] = Math.max(dp[i] , dp[j] + 1);
                     }
                 }
                 max = Math.max(dp[i] , max);
             }
             return max;
         }
}