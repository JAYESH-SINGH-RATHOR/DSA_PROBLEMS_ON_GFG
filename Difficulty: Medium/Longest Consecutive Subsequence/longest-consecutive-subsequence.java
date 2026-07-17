class Solution {
    public int longestConsecutive(int[] arr) {
        // code here
        Arrays.sort(arr);
        int curr = 1;
        int max = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i - 1]){
                continue;
            }
            if(arr[i] - arr[i - 1] == 1){
                curr++;
            }else{
                curr = 1;
            }
            max = Math.max(max , curr);
        }
        return max;
    }
}