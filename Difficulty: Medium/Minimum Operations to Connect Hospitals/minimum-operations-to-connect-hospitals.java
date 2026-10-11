class Solution {
    public int minConnect(int V, int[][] edges) {
        // code here
        if(edges.length < V - 1){
            return -1;
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
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
                visited[i] = true;
                count++;
                q.add(i);
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int e : adj.get(curr)){
                        if(!visited[e]){
                            visited[e] = true;
                            q.add(e);
                        }
                    }
                }
            }
        }
        return count - 1;
    }
}
