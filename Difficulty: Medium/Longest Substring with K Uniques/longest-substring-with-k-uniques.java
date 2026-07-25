class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int left = 0;
        int max = -1;
        int n = s.length();
        HashMap<Character , Integer > map = new HashMap<>();
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch , 0);
            }
            int freq = map.get(ch);
            map.put(ch , freq + 1);
            while(map.size() > k){
                char leftch = s.charAt(left);
                if(!map.containsKey(leftch)){
                    map.put(ch , 0);
                }
                map.put(leftch , map.get(leftch) - 1);
                if(map.get(leftch) == 0){
                    map.remove(leftch);
                }
                left++;
            }
            if(map.size() == k){
                max = Math.max(max , i - left + 1);
            }
        }
        return max;
    }
}