// Last updated: 04/10/2025, 15:51:33
class Solution {
    int result = 0;
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int nonobstacles = 0;
        int x = 0;
        int y = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=-1){
                    nonobstacles++;
                }
                if(grid[i][j] == 1){
                    x = i;
                    y = j;
                }
            }
        }
        backtrack(x,y,1,nonobstacles,grid);
        return result;
    }
    public void backtrack(int x,int y,int count,int nonobstacles,int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        if(x<0 || x>=n || y<0 || y>=m || grid[x][y] == -1){
            return;
        }
        if(grid[x][y] == 2){
            if(count == nonobstacles){
                result++;
            }
            return;
        }
        int temp = grid[x][y];
        grid[x][y] = -1;
        backtrack(x+1,y,count+1,nonobstacles,grid);
        backtrack(x,y+1,count+1,nonobstacles,grid);
        backtrack(x-1,y,count+1,nonobstacles,grid);
        backtrack(x,y-1,count+1,nonobstacles,grid);
        grid[x][y] = temp;
    }
}