// Last updated: 04/10/2025, 15:50:53
class Solution {
    int count = 0;
    int directions[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    int n,m;
    public int numSubmat(int[][] mat) {
        n = mat.length;
        m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 1){
                    count+=backtrack(i,j,mat);
                }
            }
        }
        return count;
    }
    public int backtrack(int i,int j,int mat[][]){
        int res = 0;
        int min = m;
        for(int r = i; r<n && mat[r][j] == 1;r++){
            int width = 0;
            for (int c = j; c < m && mat[r][c] == 1; c++) {
                width++;
            }
            min = Math.min(min, width);
            res += min;
        }
        return res;
    }
}