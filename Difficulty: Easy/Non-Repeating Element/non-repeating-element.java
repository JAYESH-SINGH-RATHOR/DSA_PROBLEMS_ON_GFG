class Solution {
    public int firstNonRepeating(int[] arr) {
        // code here
       Map<Integer , Integer>map = new HashMap<>();
       for(int e : arr){
           if(!map.containsKey(e)){
               map.put(e ,1 );
           }
           else{
               int freq = map.get(e);
           map.put(e , freq + 1);
           }
       }
      for (int key : arr) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return 0;
    }
}
