class Solution {
    int countConnected(int V, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer> e : edges){
            int u = e.get(0);
            int v = e.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[] = new boolean[V];
        int count = 0;
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                dfsUtil(i , adj , visited);
                count++;
            }
        }
        return count;
    }
    void dfsUtil(int curr ,  ArrayList<ArrayList<Integer>> adj ,
    boolean visited[]){
        visited[curr] = true;
        for(int e : adj.get(curr)){
            if(!visited[e]){
                dfsUtil(e , adj , visited);
            }
        }
    }
}