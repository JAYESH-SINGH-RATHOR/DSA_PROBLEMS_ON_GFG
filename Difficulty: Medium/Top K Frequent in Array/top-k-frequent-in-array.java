class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        // Code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i] , 0);
            }
            int freq = map.get(arr[i]);
            map.put(arr[i] ,freq + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if(map.get(a).equals(map.get(b))){
                return Integer.compare(a, b);
            }
            return Integer.compare(map.get(a), map.get(b));
        });

        for(int e : map.keySet()){
            pq.add(e);
            while(pq.size() > k){
                pq.remove();
            }
        }
        while(!pq.isEmpty()){
            res.add(pq.remove());
        }
        Collections.reverse(res);
        return res;
    }
}
