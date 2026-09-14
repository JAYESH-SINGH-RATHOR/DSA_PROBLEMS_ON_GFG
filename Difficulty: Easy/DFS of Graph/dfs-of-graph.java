class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        boolean visited[] = new boolean[adj.size()];
        dfsutil(adj, 0, visited, res);
        return res;
    }
    void dfsutil(ArrayList<ArrayList<Integer>> adj , int curr 
    , boolean visited[] , ArrayList<Integer> res){
        visited[curr] = true;
        res.add(curr);
        for(int e : adj.get(curr)){
            if(!visited[e]){
               dfsutil(adj , e , visited , res);
            }
        }
    }
}