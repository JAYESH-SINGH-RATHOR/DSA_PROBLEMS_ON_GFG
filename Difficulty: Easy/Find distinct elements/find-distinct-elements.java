// User function Template for Java
class Solution {
    static int distinct(int arr[]) {
        // code here
       HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
}