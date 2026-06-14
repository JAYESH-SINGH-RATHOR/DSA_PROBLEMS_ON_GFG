class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int e : a) {
            if (map.containsKey(e)) {
                int freq = map.get(e);
                map.put(e, freq + 1);
            } else {
                map.put(e, 1);
            }
        }

        for (int e : b) {
            if (!map.containsKey(e) || map.get(e) == 0) {
                return false;
            }

            int freq = map.get(e);
            map.put(e, freq - 1);
        }

        return true;
    }
}