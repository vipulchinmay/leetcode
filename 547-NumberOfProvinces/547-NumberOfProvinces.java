// Last updated: 04/10/2025, 15:52:33
class Solution {
     public void dfs(int v,boolean[] visited,int[][] grid){
        visited[v] = true;
        for(int i = 0;i<grid.length;i++){
            if(visited[i] == false && grid[v][i] == 1){
                dfs(i,visited,grid);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int v = isConnected.length;
        boolean[] visited = new boolean[v];
        int count = 0;
        for(int i=0;i<v;i++){
            if(visited[i] == false){
                dfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
}