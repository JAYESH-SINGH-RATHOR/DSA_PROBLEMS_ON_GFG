class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        
        int n = s1.length();
        int m = s2.length();
        
        HashMap<Character , Integer > map = new HashMap<>();
        
        for(char e : s1.toCharArray()){
            if(map.containsKey(e)){
            int freq = map.get(e);
                map.put(e , freq + 1);
            }else{
            map.put(e , 1);
            }
        }
        
        for(char e : s2.toCharArray()){
            if(!map.containsKey(e)){
                return false;
            }
            int freq = map.get(e);
            map.put(e , freq - 1);
            if(map.get(e) == 0){
                map.remove(e);
            }
        }
        return map.isEmpty();
    }
}