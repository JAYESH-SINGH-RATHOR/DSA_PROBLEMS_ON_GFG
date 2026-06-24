class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // Your code here
        int n = arr.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int e : arr){
            pq.add(e);
            if(pq.size() > k){
                pq.remove();
            }
        }
        return pq.peek();
    }
}