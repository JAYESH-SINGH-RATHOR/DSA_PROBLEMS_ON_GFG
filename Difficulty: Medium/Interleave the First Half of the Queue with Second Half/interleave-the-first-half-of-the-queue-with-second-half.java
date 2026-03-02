class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> firstHalf = new LinkedList<>();
       int n = q.size();
       
       if(n % 2 != 0){
           return;
       }
        for(int i = 0; i < n / 2; i++ ){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        
    }
}
