// Last updated: 04/10/2025, 15:54:27
class Solution {
    int dp[][];
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        return backtrack(0,0,grid);
    }
    public int backtrack(int i,int j, int a[][]){
        if(i >= a.length || j >= a[0].length) return Integer.MAX_VALUE;
        if(i == a.length - 1 && j == a[0].length - 1) return a[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int down = backtrack(i + 1, j, a);
        int right = backtrack(i, j + 1, a);
        dp[i][j] = Math.min(down, right) + a[i][j];
        return dp[i][j];
    }
}