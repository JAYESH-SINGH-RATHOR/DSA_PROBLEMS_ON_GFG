class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
      int n = arr.length;
      int count = 0;
      for(int i = 0; i < n; i++){
          if(arr[i] != 0){
              arr[count++] = arr[i];
          }
          
      }
      while(count < arr.length){
          arr[count++] = 0;
      }
    }
    
    // appraoch 2 
    
    //  void pushZerosToEnd(int[] arr) {
    //      int n = arr.length;
    //      int count = 0;
    //      for(int i = 0; i < n; i++){
    //          if(arr[i] != 0){
    //              int temp = arr[i];
    //              arr[i] = arr[count];
    //              arr[count] = temp;
    //          }
    //          count++;
    //      }
    //  }
}