class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {
        // code here
        boolean visited[] = new boolean[V];
        List<List<Integer>>  adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int path = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i = 0; i < s; i++){
                int curr = q.remove();
                // q.add(curr);
                if(curr == dest){
                    return path;
                }
                for(int e : adj.get(curr)){
                    if(!visited[e]){
                        visited[e] = true;
                        q.add(e);
                    }
                }
            }
            path++;
        }
        return -1;
    }
}



