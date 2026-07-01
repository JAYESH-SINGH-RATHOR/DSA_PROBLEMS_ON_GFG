class Solution {
    // boolean twoSum(int arr[], int target) {
    //     // code here
    //     int left = 0;
    //   for(int i = 1; i < arr.length; i++){
    //       if(arr[i] + arr[left] == target){
    //           return true;
    //       }
    //       left++;
    //   }
    //   return false;
    // }
    
    boolean twoSum(int arr[] , int target){
        HashSet<Integer> set = new HashSet<>();
        for(int val : arr){
            int ele = target - val;
            if(set.contains(ele)){
                return true;
            }
            set.add(val);
        }
        return false;
    }
}