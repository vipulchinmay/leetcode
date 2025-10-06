// Last updated: 06/10/2025, 15:28:40
class Solution {
    int n,m;
    int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    int perimeter = 0;
    public int islandPerimeter(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    dfs(i,j,vis,grid);
                    return perimeter;
                }
            }
        }
        return 0;
    }
    public void dfs(int x,int y,boolean[][] vis,int a[][]){
        vis[x][y] = true;
        for(int d[] : directions){
            int nr = x + d[0];
            int nc = y + d[1];
            if(nr < 0 || nr >= n || nc<0 || nc >= m || a[nr][nc] == 0){
                perimeter++;
            }
            else if(!vis[nr][nc]){
                dfs(nr,nc,vis,a);
            }
        }
    }
}