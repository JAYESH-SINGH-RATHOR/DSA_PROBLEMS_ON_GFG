class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int e : arr) {
            map.put(e, map.getOrDefault(e, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new 
        ArrayList<>(map.entrySet());

        // Frequency descending, aur agar freq same ho to value descending
        list.sort((a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue();
            }
            return b.getKey() - a.getKey();
        });

        for (int i = 0; i < k && i < list.size(); i++) {
            res.add(list.get(i).getKey());
        }

        return res;
    }
}