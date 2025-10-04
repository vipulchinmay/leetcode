// Last updated: 04/10/2025, 15:51:29
class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] ==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    count++;
                }
            }
        }
        if(count == 0){
            return 0;
        }
        int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
        int minutes = -1;
        while(!q.isEmpty()){
            int size = q.size();
            minutes++;
            for(int i = 0;i<size;i++){
                int curr[] = q.poll();
                for(int d[] : directions){
                    int x = curr[0] + d[0];
                    int y = curr[1] + d[1];
                    if(x>=0 && y>=0 && x<n && y<m && grid[x][y] == 1){
                        grid[x][y] = 2;
                        q.offer(new int[]{x,y});
                        count -- ;
                    }
                }
            }
        }
        return count == 0?minutes:-1;
    }
}