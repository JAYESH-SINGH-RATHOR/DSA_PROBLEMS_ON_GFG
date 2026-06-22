class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        int maxcount = 1;
        for(int i = 1; i < n; i++){
            int diff = 0;
            diff = arr[i] - arr[i - 1];
            if(diff == 1){
                count++;
                maxcount = Math.max(maxcount , count);
            }else if(diff > 1){
                count = 1;
            }
        }
        return maxcount;
    }
}