class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // code here
        Stack<Integer> stt  = new Stack<>();
        // System.out.print(st);
        if(st.isEmpty()){
            st.push(x);
        }
       else{
           while(!st.isEmpty()){
        int del = st.pop();
        stt.push(del);
           }
         st.push(x);
       while(!stt.isEmpty()){
           st.push(stt.pop());
       }
       }
        return st;
    }
}