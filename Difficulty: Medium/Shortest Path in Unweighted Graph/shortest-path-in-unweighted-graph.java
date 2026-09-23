class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int e[] : edges) {
            int u = e[0];
            int v = e[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean visited[] = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;

        int path = 0;

        while(!q.isEmpty()) {

            int size = q.size();

            for(int i = 0; i < size; i++) {

                int curr = q.remove();

                if(curr == dest) {
                    return path;
                }

                for(int e : adj.get(curr)) {

                    if(!visited[e]) {
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