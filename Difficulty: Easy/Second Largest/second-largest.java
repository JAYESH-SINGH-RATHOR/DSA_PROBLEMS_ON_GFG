class Solution {
    public int getSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > first) {
                sec = first;
                first = arr[i];
            }
            else if(arr[i] > sec && arr[i] != first) {
                sec = arr[i];
            }
        }

        return (sec == Integer.MIN_VALUE) ? -1 : sec;
    }
}