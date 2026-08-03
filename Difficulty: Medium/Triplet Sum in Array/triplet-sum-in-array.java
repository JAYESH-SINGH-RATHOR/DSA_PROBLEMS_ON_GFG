class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n - 2; i++){
            int left = i + 1; int right = n - 1;
            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target){
                    while(left < right && arr[left] == arr[left + 1]){
                        left++;
                    }
                    while(left < right && arr[right] == arr[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                    return true;
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return false;
    }
}
