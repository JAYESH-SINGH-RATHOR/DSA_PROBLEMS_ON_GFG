class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int count = 1;
        int maxcount = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] - arr[i - 1] == 1){
                count++;
            }else{
                count = 1;
            }
            maxcount = Math.max(maxcount , count);
        }
        return maxcount;
    }
}