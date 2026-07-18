class Solution {
    String removeDuplicates(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
