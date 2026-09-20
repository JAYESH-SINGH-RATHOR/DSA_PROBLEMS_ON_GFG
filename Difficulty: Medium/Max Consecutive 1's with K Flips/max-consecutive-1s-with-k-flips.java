class Solution {
    public int maxOnes(int arr[], int k) {
        // code here
       int operations =0;
       int left = 0;
       int max = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == 0){
               operations++;
           }
           while(operations > k){
               if(arr[left] == 0){
                   operations--;
               }
               left++;
           }
           max = Math.max(i - left + 1 , max);
       }
       return max;
    }
}