class Solution {
    public int countSCC(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        int count = 0;
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            transpose.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs1(i , visited , adj , st);
            }
        }
        for(int i = 0; i < n; i++){
            for(int e : adj.get(i)){
                transpose.get(e).add(i);
            }
        }
        visited = new boolean[n];
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!visited[curr]){
                dfs2(curr , visited , transpose);
                count++;
            }
        }
        return count;
    }
    void dfs1(int curr , boolean visited[] , ArrayList<ArrayList<Integer>>
    adj , Stack<Integer> st){
        visited[curr] = true;
        for(int e : adj.get(curr)){
            if(!visited[e]){
                dfs1(e , visited , adj , st);
            }
        }
        st.push(curr);
    }
    void dfs2(int curr , boolean visited[] , ArrayList<ArrayList<Integer>>
    transpose){
        visited[curr] = true;
        for(int e : transpose.get(curr)){
            if(!visited[e]){
                dfs2(e , visited , transpose);
            }
        }
    }
}