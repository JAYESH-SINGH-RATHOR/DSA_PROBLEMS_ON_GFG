class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
         Arrays.sort(arr);
         int val = 0;
         for(int i = 0; i < arr.length; i++){
             if(i == k - 1){
                 val = arr[i];
             }
         }
         return val;
         
         // secound things 
         
        //  return arr[k - 1];
    }
}
