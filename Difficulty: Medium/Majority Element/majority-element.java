class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n =  arr.length;
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                candidate = arr[i];
            }
            if(arr[i] == candidate){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == candidate){
                count++;
            }
        }
        if(count > n / 2){
            return candidate;
        }else{
            return -1;
        }
    }
}