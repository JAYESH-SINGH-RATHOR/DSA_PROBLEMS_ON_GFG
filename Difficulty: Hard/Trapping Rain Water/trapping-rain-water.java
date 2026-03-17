class Solution {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        int rightmax[] = new int[n];
        rightmax[n  - 1] = arr[n - 1];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(leftmax[i - 1] , arr[i]);
        }
        for(int i = n - 2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i + 1] , arr[i]);
        }
        int trappedwater = 0;
        for(int j = 0; j < n; j++){
            int water = Math.min(leftmax[j] , rightmax[j]);
            trappedwater += water - arr[j];
        }
        return trappedwater;
    }
}
