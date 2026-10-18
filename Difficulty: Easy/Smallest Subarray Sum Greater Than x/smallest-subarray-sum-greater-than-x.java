class Solution {
    public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int len = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            while(sum > x){
                len = Math.min(len , i - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }
}
