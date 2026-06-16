class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n = arr.length;
        int idx = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] <= x){
                idx = i;
            }
        }
        return idx;
    }
}
