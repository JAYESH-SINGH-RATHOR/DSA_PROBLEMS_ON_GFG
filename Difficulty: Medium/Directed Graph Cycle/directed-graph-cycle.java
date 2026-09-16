    // using dfs 

// class Solution {
//     public boolean isCyclic(int V, int[][] edges) {
//         // code here
//         ArrayList<ArrayList<Integer>> adj  = new ArrayList<>();
//         boolean visited[] = new boolean[V];
//         boolean pathvisited[] = new boolean[V];
//         for(int i = 0; i < V; i++){
//             adj.add(new ArrayList<>());
//         }
//         for(int e[] : edges){
//             int u = e[0];
//             int v = e[1];
//             adj.get(u).add(v);
//         }
//         for(int i = 0; i < V; i++){
//             if(!visited[i]){
//                 if(dfsUtil(adj , i , visited , pathvisited)){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     boolean dfsUtil( ArrayList<ArrayList<Integer>> adj  , int curr ,
//     boolean visited[] , boolean pathvisited[]){
//         visited[curr] = true;
//         pathvisited[curr] = true;
//         for(int e : adj.get(curr)){
//             if(pathvisited[e]){
//                 return true;
//             }
//             if(!visited[e]){
//                 if(dfsUtil(adj , e , visited , pathvisited)){
//                     return true;
//                 }
//             }
//         }
//         pathvisited[curr] = false;
//         return false;
//     }
// }

// using topological sort 

class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        // Stack<Integer> st = new Stack<>();
        boolean visited[] = new boolean[V];
        boolean pathvisited[] = new boolean[V];
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int e[] : edges){
            int u = e[0];
            int v = e[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(toposort(adj , i , pathvisited, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean toposort(ArrayList<ArrayList<Integer>> adj , int curr ,
     boolean pathvisited[] , boolean visited[] ){
        visited[curr] = true;
        pathvisited[curr] = true;
        for(int e : adj.get(curr)){
            if(pathvisited[e]){
                return true;
            }
            if(!visited[e]){
                if(toposort(adj , e ,pathvisited, visited )){
                    return true;
                }
            }
        }
        pathvisited[curr] = false;
        return false;
    }
}