class Solution {
    int single(int[] arr) {
        // code here
        if(arr.length == 1){
            return arr[0];
        }
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int e : arr){
            if(!map.containsKey(e)){
                map.put(e , 1);
            }else{
                int freq = map.get(e);
                map.put(e , freq + 1);
            }
        }
        for(int e : arr){
            if(map.get(e) == 1){
                return e;
            }
        }
        return -1;
    }
}