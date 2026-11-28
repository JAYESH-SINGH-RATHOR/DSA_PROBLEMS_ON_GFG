class Solution {
    public int cntOnes(int[][] grid) {
        // code here
        int count = 0;
        int dr[] = {0 , 0 , 1 , -1};
        int dc[] = {-1 , 1 , 0 , 0};
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if((i == 0 || i == n - 1 || j == 0 || j == m - 1 ) 
                && !visited[i][j] && grid[i][j] == 1){
                    q.add(new int[]{i , j});
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()){
            int curr[] = q.remove();
            int r = curr[0];
            int c = curr[1];
            for(int k = 0; k < 4; k++){
                int nr = r + dr[k];
                int nc = c + dc[k];
                if(nr >= 0 && nr < n && nc >= 0 && nc < m
                && !visited[nr][nc] && grid[nr][nc] == 1){
                    q.add(new int[]{nr , nc});
                    visited[nr][nc] = true;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    q.add(new int[]{i , j});
                visited[i][j] = true;
                count++;
                }
            }
        }
        return count;
    }
};