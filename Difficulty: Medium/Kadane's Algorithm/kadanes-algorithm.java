class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
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
