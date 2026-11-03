
class Solution {
    public void swapKth(List<Integer> arr, int k) {
        // code here
        int n = arr.size();
        int leftIndex = k - 1; 
        int rightIndex = n - k;
        int firstEle = arr.get(leftIndex);
        int lastEle = arr.get(rightIndex);
        arr.set(leftIndex, lastEle);
        arr.set(rightIndex, firstEle);
    }
}
