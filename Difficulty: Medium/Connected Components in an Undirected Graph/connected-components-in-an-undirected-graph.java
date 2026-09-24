class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, 
    int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                 ArrayList<Integer> component = new ArrayList<>();
                dfsutil(i , adj , visited , component);
                res.add(component);
            }
        }
        return res;
    }
    void dfsutil(int curr , ArrayList<ArrayList<Integer>> adj  ,
    boolean visited[] ,ArrayList<Integer> component ){
        visited[curr] = true;
        component.add(curr);
        for(int e : adj.get(curr)){
            if(!visited[e]){
                dfsutil(e , adj , visited , component);
            }
        }
    }
}