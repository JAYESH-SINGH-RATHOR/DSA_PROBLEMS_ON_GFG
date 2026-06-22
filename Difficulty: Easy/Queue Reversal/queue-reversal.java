class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
    //   Stack<Integer> s = new Stack<>();
    //   while(!q.isEmpty()){
    //       s.push(q.remove());
    //   }
    //   while(!s.isEmpty()){
    //       q.add(s.pop());
    //   }
    
    // secound method 
     if (q.isEmpty()) {
            return;
        }
        int front = q.remove();
        reverseQueue(q);
        q.add(front);
    }
}