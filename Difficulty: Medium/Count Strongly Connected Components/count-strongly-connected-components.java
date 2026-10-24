class Solution {
    public int countSCC(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
       boolean visited[] = new boolean[n];
       Stack<Integer> st = new Stack<>();
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for(int i = 0; i < n; i++){
            transpose.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs1(i , visited , st , adj);
            }
        }
        for(int i = 0; i < n; i++){
            for(int e : adj.get(i)){
                transpose.get(e).add(i);
            }
        }
        visited = new boolean[n];
        int count = 0;
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!visited[curr]){
                dfs2(curr , visited , transpose);
                count++;
            }
        }
        return count;
    }
    void dfs1(int curr , boolean visited[] , Stack<Integer> st , 
    ArrayList<ArrayList<Integer>> adj ){
        visited[curr] = true;
        for(int e : adj.get(curr)){
            if(!visited[e]){
                dfs1(e , visited , st , adj);
            }
        }
        st.push(curr);
    }
    void dfs2(int curr , boolean visited[] ,
    ArrayList<ArrayList<Integer>> transpose){
        visited[curr] = true;
        for(int e : transpose.get(curr)){
            if(!visited[e]){
                dfs2(e , visited , transpose);
            }
        }
    }
}