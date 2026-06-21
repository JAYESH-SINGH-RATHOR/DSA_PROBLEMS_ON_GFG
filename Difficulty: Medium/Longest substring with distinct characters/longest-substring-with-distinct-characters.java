class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
       int left = 0;
       int max = 0;
       HashSet<Character> set = new HashSet<>();
       for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           while(set.contains(ch)){
               set.remove(s.charAt(left));
               left++;
           }
           set.add(s.charAt(i));
           max = Math.max(max , i - left + 1);
       }
       return max;
    }
}