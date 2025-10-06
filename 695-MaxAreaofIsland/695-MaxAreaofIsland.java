// Last updated: 06/10/2025, 13:34:52
class Solution {
    int n,m;
    int max = 0;
    int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    int area = dfs(i,j,vis,grid);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int dfs(int x,int y,boolean vis[][], int a[][]){
        vis[x][y] = true;
        int count = 1;
        for(int d[] : directions){
            int nr = x + d[0];
            int nc = y + d[1];
            if(nr >=0 && nr < n && nc >=0 && nc < m && !vis[nr][nc] && a[nr][nc] == 1){
                count+=dfs(nr,nc,vis,a);
            }
        }
        return count;
    }
}