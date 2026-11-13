// class Solution {
//     public boolean isProduct(int[] arr, long target) {
//         // code here
//         int n = arr.length;
//         for(int i = 0; i < n; i++){
//             for(int j = i + 1; j < n; j++){
//                 if(arr[i] * arr[j] == target){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


// optimzed ways 

class Solution {
    public boolean isProduct(int[] arr, long target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
           long mul = (long)arr[left] * arr[right];
           if(mul == target){
               return true;
           }
           else if(mul > target){
               right--;
           }else{
               left++;
           }
        }
        return false;
    }
}