class Solution {
   
    
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