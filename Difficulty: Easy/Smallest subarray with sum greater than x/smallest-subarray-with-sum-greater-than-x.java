class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int sum = 0;
        int windowsize = Integer.MAX_VALUE;
        int n = arr.length;
        int left = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            while(sum > x){
                windowsize = Math.min(windowsize , i - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return windowsize == Integer.MAX_VALUE ? 0 : windowsize;
    }
}
