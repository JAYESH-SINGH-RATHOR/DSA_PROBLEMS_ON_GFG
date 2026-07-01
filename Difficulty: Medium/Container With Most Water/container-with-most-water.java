class Solution {
    public int maxWater(int arr[]) {
        // Code Here
         if (arr == null || arr.length < 2) {
            return 0;
        }
        int left = 0;
        int right = arr.length - 1;
        int maxwater = Integer.MIN_VALUE;
        while(left < right){
            int height = Math.min(arr[left] , arr[right]);
            int width = right - left;
            int water = height * width;
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