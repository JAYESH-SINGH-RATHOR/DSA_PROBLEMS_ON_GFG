class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int totalsum = 0;
       for(int sum : arr){
           totalsum += sum;
       }
       int leftsum = 0;
        for(int i = 0; i < n; i++){
            totalsum = totalsum - arr[i];
            if(totalsum == leftsum){
                return i;
            }
            leftsum += arr[i];
        }
        return -1;
    }
}
