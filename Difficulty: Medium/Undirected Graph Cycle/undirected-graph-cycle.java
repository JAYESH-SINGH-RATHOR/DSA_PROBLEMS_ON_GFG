class Solution {
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n = adj.size();
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                if(dfsUtil(i , visited , adj , -1)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfsUtil(int curr ,  boolean visited[] , 
    ArrayList<ArrayList<Integer>> adj , int parent){
        visited[curr] = true;
        for(int e : adj.get(curr)){
            if(!visited[e]){
                if(dfsUtil(e , visited , adj , curr)){
                    return true;
                }
            }
            else if( e != parent){
                return true;
            }
        }
        return false;
    }
}