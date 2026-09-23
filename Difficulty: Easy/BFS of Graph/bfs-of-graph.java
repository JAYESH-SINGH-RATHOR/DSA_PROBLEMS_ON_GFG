class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean visited[] = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            res.add(curr);
            for(int e : adj.get(curr)){
                if(!visited[e]){
                    visited[e] = true;
                    q.add(e);
                }
            }
        }
        return res;
        }
    
}