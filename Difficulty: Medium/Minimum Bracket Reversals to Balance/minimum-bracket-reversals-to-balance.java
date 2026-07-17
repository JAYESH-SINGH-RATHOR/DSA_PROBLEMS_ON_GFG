class Solution {
    public int countMinReversals(String s) {
        // code here
        if(s.length() % 2 != 0){
            return -1;
        }
        int openbracket = 0;
        int close = 0;
        Stack<Character> st =new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{'){
                st.push(ch);
            }else{
                if(!st.isEmpty() && st.peek() == '{'){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
         while(!st.isEmpty()){
                if(st.pop() == '{'){
                    openbracket++;
                }else{
                    close++;
                }
            }
        return (openbracket + 1) / 2 + (close + 1) / 2;
    }
}