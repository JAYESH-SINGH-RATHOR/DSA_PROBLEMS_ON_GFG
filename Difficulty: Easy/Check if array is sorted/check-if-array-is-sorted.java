class Solution {
    public boolean isSorted(int[] arr) {
        // code here
       int n = arr.length;
    //   for(int i = 0; i < n; i++){
    //       for(int j = i + 1; j < n; j++){
    //           if(arr[i] > arr[j]){
    //               return false;
    //           }
    //       }
    //   }
    //   return true;
    
       for(int i = 1; i < arr.length; i++){
           if(arr[i] < arr[i - 1]){
               return false;
           }
       }
       return true;
    }
}