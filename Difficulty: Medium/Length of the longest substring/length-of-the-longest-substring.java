// User function Template for Java

class Solution {
    int longestUniqueSubstring(String s) {
        // code here
       HashSet<Character> set = new HashSet<>();
       int left = 0 , right = 0;
       int maxlen = 0;
       while(right < s.length()){
           char ch = s.charAt(right);
           if(!set.contains(ch)){
               set.add(ch);
               right++;
           }else{
               int len = right - left;
               maxlen = Math.max(maxlen , len);
               while(s.charAt(left) != s.charAt(right)){
                   set.remove(s.charAt(left));
                   left++;
               }
               left++;
               right++;
           }
           int len = right - left;
           maxlen = Math.max(maxlen , len);
       }
           return maxlen;
    }
}