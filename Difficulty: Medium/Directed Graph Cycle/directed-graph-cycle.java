class Solution {
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj){
        // code here
        int n = adj.size();
        boolean visited[] = new boolean[n];
        boolean stack[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                if(dfsUtil(i , visited , adj , stack)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfsUtil(int curr , boolean visited[] ,
    ArrayList<ArrayList<Integer>> adj ,  boolean stack[]){
        visited[curr] = true;
        stack[curr] = true;
        for(int e : adj.get(curr)){
            if(stack[e]){
                return true;
            }
            if(!visited[e]){
               if( dfsUtil(e , visited , adj , stack)){
                   return true;
               }
            }
        }
        stack[curr] =  false;
        return false;
    }
}