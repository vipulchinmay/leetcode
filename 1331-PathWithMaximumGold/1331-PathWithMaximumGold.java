// Last updated: 04/10/2025, 15:51:14
class Solution {
    int max = 0;

    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0) {
                    backtrack(i, j, vis, grid, 0);
                }
            }
        }
        return max;
    }

    public void backtrack(int i, int j, boolean[][] vis, int[][] grid, int sum) {
        int directions[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
        int n = grid.length;
        int m = grid[0].length;
        vis[i][j] = true;
        sum += grid[i][j];
        max = Math.max(max, sum);
        for (int d[] : directions) {
            int nr = i + d[0];
            int nc = j + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] != 0 && !vis[nr][nc]) {
                backtrack(nr, nc, vis, grid, sum);
            }
        }
        vis[i][j] = false;
    }
}