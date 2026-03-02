class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
            q.add(ch);
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
            q.remove();
        }
        }
        if(q.isEmpty()){
            return '$';
        }
        return q.peek();
    }
}
