class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < k; i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        for(int i = k; i < n; i++){
            int ws = arr[i - k];
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            set.remove(ws);
        }
        return false;
    }
}