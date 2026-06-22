class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k > q.size() || k <= 0){
            return q;
        }
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < k; i++){
            // System.out.print(st);
            st.push(q.remove());
            // System.out.print(st);
        }
        while(!st.isEmpty()){
            // System.out.print(q);
            q.add(st.pop());
            // System.out.print(q);
        }
        
        for(int i = 0; i < n - k; i++){
            q.add(q.remove());
        }
        return q;
    }
}