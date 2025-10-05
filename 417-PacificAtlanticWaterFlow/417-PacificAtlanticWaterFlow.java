// Last updated: 05/10/2025, 23:51:31
class Solution {
    int n, m;
    int directions[][] = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        n = heights.length;
        m = heights[0].length;
        boolean vis[][] = new boolean[n][m];
        boolean atvis[][] = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            dfs(i, 0, heights, vis);
            dfs(i, m-1, heights, atvis);
        }
        for (int i = 0; i < m; i++) {
            dfs(0, i, heights, vis);
            dfs(n-1, i, heights, atvis);
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j] && atvis[i][j]){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }

    public void dfs(int x, int y, int a[][], boolean[][] vis) {
        vis[x][y] = true;
        for (int d[] : directions) {
            int nr = x + d[0];
            int nc = y + d[1];
            if (nr >= 0 && nr < n && nc >= 0 && nc < m && !vis[nr][nc] && a[nr][nc] >= a[x][y]) {
                dfs(nr, nc, a, vis);
            }
        }
    }
}