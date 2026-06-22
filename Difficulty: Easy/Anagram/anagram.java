class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0 ; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 0);
            }
            map.put(ch , map.put(ch , 0) + 1);
        }
        for(int i = 0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            int freq = map.get(ch);
            map.put(ch , freq - 1);
            if(map.get(ch) < 0){
                return false;
            }
        }
        return true;
    }
}