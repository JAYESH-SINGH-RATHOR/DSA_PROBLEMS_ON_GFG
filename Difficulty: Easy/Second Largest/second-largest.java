class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int fs = Integer.MIN_VALUE;
        int sc = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > fs){
                sc = fs;
                fs = Math.max(fs , arr[i]);
            }else if(arr[i] < fs && arr[i] > sc){
                // System.out.print("arr[i] is = " + arr[i] +
                // " sc is = " + sc);
                sc = Math.max(sc , arr[i]);
            }
        }
       return (sc == Integer.MIN_VALUE || fs == sc) ? -1 : sc;
    }
}