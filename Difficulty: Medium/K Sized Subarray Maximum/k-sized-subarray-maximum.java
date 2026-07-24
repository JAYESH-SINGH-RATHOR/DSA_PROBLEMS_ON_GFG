class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
         ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]   // Max Heap based on value
        );

        for (int i = 0; i < arr.length; i++) {

            pq.add(new int[]{arr[i], i});

            // Remove elements outside current window
            while (!pq.isEmpty() && pq.peek()[1] <= i - k) {
                pq.remove();
            }

            if (i >= k - 1) {
                res.add(pq.peek()[0]);
            }
        }

        return res;
    }
}