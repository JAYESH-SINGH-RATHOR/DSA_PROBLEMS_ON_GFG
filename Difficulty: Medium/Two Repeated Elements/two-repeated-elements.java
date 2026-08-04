class Solution {
    public int[] twoRepeated(int[] arr) {
        // code here
        HashMap<Integer , Integer > map = new HashMap<>();
        int res[] = new int[2];
        int idx = 0;
        for(int e : arr){
            if(!map.containsKey(e)){
                map.put(e , 0);
            }
            int freq = map.get(e);
            map.put(e , freq + 1);

            if(map.get(e) > 1){
                res[idx] = e;
                idx++;
            }
            if(idx == 2){
                break;
            }
        }
        return res;
    }
}