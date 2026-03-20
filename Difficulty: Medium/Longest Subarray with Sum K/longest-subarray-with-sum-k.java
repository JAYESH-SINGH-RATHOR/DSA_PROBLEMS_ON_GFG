// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
       int n = arr.length;
       
       // bruteforce appraoched 
       
    //   int maxlen = 0;
    //   for(int i = 0; i < n; i++){
    //       int sum = 0;
    //       for(int j = i; j < n; j++){
    //           sum += arr[j];
    //           if(sum == k){
    //               maxlen = Math.max(maxlen , j - i + 1);
    //           }
    //       }
    //   }
    //   return maxlen;
    
            // optimized appraoch
            HashMap<Integer , Integer > map = new HashMap<>();
            int sum = 0;
            int maxlen = 0;
            for(int i = 0; i < n; i++){
                sum += arr[i];
                if(sum == k){
                    maxlen = i + 1;
                }
                if(map.containsKey(sum - k)){
                    int len = i - map.get(sum - k);
                    maxlen = Math.max(maxlen , len);
                }
                if(!map.containsKey(sum)){
                    map.put(sum , i);
                }
            }
            return maxlen;
    }
}
