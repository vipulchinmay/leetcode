// Last updated: 04/10/2025, 15:49:54
class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int minor = -1;  
        int maxrow = -1;  
        int mincol = -1;
        int maxcol = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    minor = i;
                    break;
                }
            }
            if (minor != -1) break;
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    maxrow = i;
                    break;
                }
            }
            if (maxrow != -1) break;
        }
        int width = maxrow - minor + 1;

        for(int j =0;j<m;j++){
            for(int i=0;i<n;i++){
                if(grid[i][j] == 1){
                    mincol = j;
                    break;
                }
            }
            if(mincol!=-1){
                break;
            }
        }

        for(int j=m-1;j>=0;j--){
            for(int i=n-1;i>=0;i--){
                if(grid[i][j] == 1){
                    maxcol = j;
                    break;
                }
            }
            if(maxcol!=-1){
                break;
            }
        }
        int length = maxcol - mincol + 1;
        return length * width;        
    }
}