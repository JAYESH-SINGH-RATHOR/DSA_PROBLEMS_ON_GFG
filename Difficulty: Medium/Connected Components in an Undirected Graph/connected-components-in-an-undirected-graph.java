class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                ArrayList<Integer> component = new ArrayList<>();
                visited[i] = true;
                q.add(i);
               while(!q.isEmpty()){
                   int curr = q.remove();
                   component.add(curr);
                   for(int e : adj.get(curr)){
                       if(!visited[e]){
                           visited[e] = true;
                           q.add(e);
                       }
                   }
               } 
               res.add(component);
            }
        }
       
        return res;
    }
}