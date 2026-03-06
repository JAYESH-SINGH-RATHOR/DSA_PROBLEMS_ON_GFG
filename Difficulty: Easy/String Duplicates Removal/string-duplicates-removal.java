// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
       HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                res.append(ch);
            }
        }

        return res.toString();
    }
}