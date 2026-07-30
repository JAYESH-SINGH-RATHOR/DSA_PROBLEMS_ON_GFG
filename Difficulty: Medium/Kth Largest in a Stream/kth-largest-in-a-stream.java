class Solution {
    static ArrayList<Integer> kthLargest(int[] arr, int k) {
        // code here
       ArrayList<Integer> res = new ArrayList<>();
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int e : arr){
           if(pq.size() < k){
               pq.add(e);
           }else {
               if(e > pq.peek()){
               pq.remove();
               pq.add(e);
                }
           }
            if(pq.size() < k){
           res.add(-1);
       }else{
           res.add(pq.peek());
       }
       }
       
      
       return res;
    }
}