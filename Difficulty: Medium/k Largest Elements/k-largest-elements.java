class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int e : arr){
            pq.add(e);
            while(pq.size() > k){
                pq.remove();
            }
        }
        // System.out.print(pq);
        while(!pq.isEmpty()){
            res.add(pq.remove());
        }
        Collections.reverse(res);
        return res;
    }
}
