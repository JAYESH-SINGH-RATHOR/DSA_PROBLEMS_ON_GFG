class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        // int lh = 0;
        // int rh = arr.length - 1;
        // while(lh <= rh){
        //     int mid = lh + (rh - lh) / 2;
        //     if(arr[mid] == k){
        //         return mid;
        //     }else if(arr[mid] < k){
        //         lh = mid + 1;
        //     }else{
        //         rh = mid - 1;
        //     }
        // }
        // return -1;
        int n  = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }
}