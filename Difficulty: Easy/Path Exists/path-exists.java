class Solution {
    public boolean checkPath(ArrayList<ArrayList<Integer>> adj, int src, int dest) {
        // Code here
        int n = adj.size();
        boolean visited[] = new boolean[n];
        visited[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(curr == dest){
                return true;
            }
            for(int e : adj.get(curr)){
                if(!visited[e]){
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
        return false;
    }
}
