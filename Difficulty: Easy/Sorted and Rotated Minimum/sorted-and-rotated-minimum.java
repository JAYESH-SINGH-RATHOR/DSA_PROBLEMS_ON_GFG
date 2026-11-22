// class Solution {
//     public int findMin(int[] arr) {
//     int min = Integer.MAX_VALUE;
//         // code here
//         for(int i = 0; i < arr.length; i++){
//             min = Math.min(min , arr[i]);
//         }    
//         return min;
//     }
// }



// using binary search

class Solution {
    public int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left);
            if(arr[mid] >= arr[left]){
                min = Math.min(min , arr[left]);
                left = mid + 1;
            }else{
                min = Math.min(min , arr[mid]);
                right = mid - 1;
            }
        }
        return min;
    }
    
}