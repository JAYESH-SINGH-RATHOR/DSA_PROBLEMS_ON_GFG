class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        boolean visited[] = new boolean[V];
        List<Integer>adj [] = new ArrayList[V];
        
        for(int i = 0; i < V; i++){
              adj[i] = new ArrayList<>();
        }
        
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
               if(cycledetectionutil(adj, i, -1, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean cycledetectionutil(List<Integer> adj [], int curr 
    , int parent , boolean visited[]){
        visited[curr] = true;
        for(int e : adj[curr]){
            if(!visited[e]){
                if(cycledetectionutil(adj , e , curr , visited)){
                    return true;
                }
            }
            else if(e != parent){
                return true;
            }
        }
        return false;
    }
}