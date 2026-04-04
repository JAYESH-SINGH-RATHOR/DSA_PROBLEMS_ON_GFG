class Solution {
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' 
            || c == '['){
                st.push(c);
            }
            else if(c == ')' || c == '}' || c == ']'){
                if(st.isEmpty()){
                    return false;
                }
                char ch = st.peek();
                if ((c == ')' && ch != '(') || 
                        (c == '}' && ch != '{') || 
                        (c == ']' && ch != '[')) {
                        return false;
                    }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
