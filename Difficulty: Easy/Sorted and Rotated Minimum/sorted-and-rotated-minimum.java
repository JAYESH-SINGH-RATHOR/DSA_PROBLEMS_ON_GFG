class Solution {
    public int findMin(int[] arr) {
    int min = Integer.MAX_VALUE;
        // code here
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min , arr[i]);
        }    
        return min;
    }
}
