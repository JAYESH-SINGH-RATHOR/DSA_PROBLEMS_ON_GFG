class Solution {
    public void nearlySorted(int[] arr, int k) {
        // code here
        // method 1
        // Arrays.sort(arr);
        
        // method2
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int e : arr){
            pq.add(e);
            if(pq.size() > k){
                arr[idx++] = pq.remove();
            }
        }
        while(!pq.isEmpty()){
            arr[idx++] = pq.remove();
        }
    }
}
