class Solution {
    String firstRepChar(String s) {
        // code here
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
               return String.valueOf(ch);
            }
            else{
                map.put(ch , 1);
            }
        }
        return "-1";
    }
}