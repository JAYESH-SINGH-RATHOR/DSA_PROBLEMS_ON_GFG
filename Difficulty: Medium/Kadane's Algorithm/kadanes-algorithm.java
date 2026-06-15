class Solution {
    // int maxSubarraySum(int[] arr) {
    //     // Code here
    //     int n = arr.length;
    //     int maxsum = Integer.MIN_VALUE;
    //     for(int i  = 0; i < n; i++){
    //         int sum = 0;
    //         for(int j = i; j < n; j++){
    //             sum += arr[j];
    //             maxsum = Math.max(maxsum , sum);
    //         }
    //     }
    //     return maxsum;
    // }
    
    // secound appraoch
    
    int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            sum = Math.max(arr[i] , sum + arr[i]);
            maxsum = Math.max(maxsum , sum);
        }
        return maxsum;
    }
}
