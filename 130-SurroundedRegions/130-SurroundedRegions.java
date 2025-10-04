// Last updated: 04/10/2025, 15:54:07
class Solution {
    int n,m;
    boolean[][] vis;
    List<int[]> region;
    public void solve(char[][] board) {
        n = board.length;
        m = board[0].length;
        vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O' && !vis[i][j]){
                    if(bfs(i,j,board,vis)){
                        for(int cell[]:region){
                            board[cell[0]][cell[1]] = 'X';
                        }
                    }
                }
            }
        }
    }
    public boolean bfs(int i,int j,char[][] board,boolean[][] vis){
        int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
        region = new ArrayList<>();
        boolean isEnclosed = true;
        q.add(new int[]{i,j});
        region.add(new int[]{i,j});
        vis[i][j] = true;
        while(!q.isEmpty()){
            int node[] = q.poll();
            if (node[0] == 0 || node[0] == n - 1 || node[1] == 0 || node[1] == m - 1) {
                isEnclosed = false;
            }
            for(int d[]:directions){
                int nr = node[0]+d[0];
                int nc = node[1]+d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<m && !vis[nr][nc] && board[nr][nc] == 'O'){
                    vis[nr][nc] = true;
                    q.add(new int[]{nr,nc});
                    region.add(new int[]{nr,nc});
                }
            }
        }
        return isEnclosed;
    }
}