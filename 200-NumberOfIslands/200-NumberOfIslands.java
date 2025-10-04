// Last updated: 04/10/2025, 15:53:39
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean visited[][] = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j] == false && grid[i][j] == '1'){
                    dfs(i,j,visited,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i,int j,boolean[][] visited,char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j] == '0'|| visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(i+1,j,visited,grid);
        dfs(i,j+1,visited,grid);
        dfs(i-1,j,visited,grid);
        dfs(i,j-1,visited,grid);
    }
}