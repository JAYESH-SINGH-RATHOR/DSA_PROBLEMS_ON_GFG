class Solution {
    // ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        
        // bruteforce appraoch is
        
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int n = arr.length;
    //     for( int i = 0; i <= n - k; i++){
    //     HashSet<Integer>set  = new HashSet<>();
    //       for(int j = i; j < i + k; j++){
    //           set.add(arr[j]);
    //       }
    //       list.add(set.size());
    //     }
    //     return list;
    
    // }
    // }
    
     ArrayList<Integer> countDistinct(int arr[], int k) {
       int n = arr.length;
       ArrayList<Integer> res = new ArrayList<>();
       HashMap<Integer , Integer > map = new HashMap<>();
       
       for(int i = 0; i < k; i++){
           if(!map.containsKey(arr[i])){
               map.put(arr[i] , 0);
           }
           int freq = map.get(arr[i]);
           map.put(arr[i] , freq + 1);
       }
           res.add(map.size());
       for(int i = k; i < n; i++){
           int window = arr[i - k];
           map.put(window , map.get(window) - 1);
           if(map.get(window) == 0){
               map.remove(window);
           }
           map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
           res.add(map.size());
       }
       return res;
    }
}