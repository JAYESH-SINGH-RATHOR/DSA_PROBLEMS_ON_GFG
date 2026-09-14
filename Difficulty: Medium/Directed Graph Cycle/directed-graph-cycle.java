class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean[V];
        boolean stack[] = new boolean[V];
       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

             for(int i = 0; i < V; i++) {
                 adj.add(new ArrayList<>());
             }
             
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < adj.size(); i++){
            if(!visited[i]){
            if( dfsUtilCycleDetection(adj , i , visited , stack)){
                return true;
                }
            }
        }
        return false;
    }
    boolean dfsUtilCycleDetection( ArrayList<ArrayList<Integer>> adj
    , int curr , boolean visited[] , boolean stack[]){
        visited[curr] = true;
        stack[curr] = true;
        for(int e : adj.get(curr)){
            if(stack[e]){
                return true;
            }
           if(!visited[e]){
                  if(dfsUtilCycleDetection(adj, e, visited, stack)){
                      return true;
                  }
              }
        }
             stack[curr] =false; 
        return false;
}
}