class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int left = 0;
        int right = arr.length - 1;
        int maxwater = Integer.MIN_VALUE;
        while(left <= right){
            int ht = Math.min(arr[left] , arr[right]);
            int wt = right - left;
            int water = ht * wt;
            maxwater = Math.max(maxwater , water);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
    }
}