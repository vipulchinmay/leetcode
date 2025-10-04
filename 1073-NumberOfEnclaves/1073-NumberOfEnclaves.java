// Last updated: 04/10/2025, 15:51:24
class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        boolean vis[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0 || i == n-1 || j ==0||j == m-1) && grid[i][j] == 1 && !vis[i][j]){
                    bfs(i,j,vis,grid);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vis[i][j] && grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i,int j, boolean[][] vis,int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        vis[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] node = q.poll();
            for(int d[]:directions){
                int nr = node[0]+d[0];
                int nc = node[1]+d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && grid[nr][nc] == 1){
                    vis[nr][nc] = true;
                    q.add(new int[]{nr,nc});
                }
            }
        }
    }
}