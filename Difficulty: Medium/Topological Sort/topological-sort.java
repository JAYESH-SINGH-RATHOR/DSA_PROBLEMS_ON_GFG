class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < adj.size(); i++){
            if(!visited[i]){
                 topoSortUtil(adj , i , visited , s);
            }
        }
        // return adj;
       while(!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }
    boolean topoSortUtil(ArrayList<ArrayList<Integer>> adj , int curr 
    , boolean visited[] , Stack<Integer> s){
        visited[curr] = true;
        for(int e : adj.get(curr)){
            if(!visited[e]){
                if(topoSortUtil(adj , e , visited , s)){
                    return true;
                }
            }
        }
        s.push(curr);
        return false;
    }
}