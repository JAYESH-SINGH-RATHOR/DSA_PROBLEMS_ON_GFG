class Solution {
    public int shortestPath(int[][] mat, int[] src, int[] dest) {
        int n = mat.length;
        int m = mat[0].length;

        // Source ya destination blocked hai
        if (mat[src[0]][src[1]] == 0 ||
            mat[dest[0]][dest[1]] == 0) {
            return -1;
        }
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int dr[] = {-1, 1, 0, 0};
        int dc[] = {0, 0, -1, 1};
        
        // row, column, distance
        q.add(new int[]{src[0], src[1], 0});
        visited[src[0]][src[1]] = true;
        while (!q.isEmpty()) {
            int curr[] = q.remove();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];
            // Destination mil gaya
            if (r == dest[0] && c == dest[1]) {
                return dist;
            }
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    mat[nr][nc] == 1 &&
                    !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc, dist + 1});
                }
            }
        }
        return -1;
    }
}