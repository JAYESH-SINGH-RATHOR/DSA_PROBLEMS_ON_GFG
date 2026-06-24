class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        while(pq.size() > k){
            pq.remove();
        }
        return pq.peek();
    }
}
