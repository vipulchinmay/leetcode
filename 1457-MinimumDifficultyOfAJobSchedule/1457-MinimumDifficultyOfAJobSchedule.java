// Last updated: 04/10/2025, 15:51:02

import java.util.Arrays;

class Solution {
    int dp[][] = new int[301][11];
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        if (n < d) {
            return -1;
        }
        for(int row[] : dp){
            Arrays.fill(row,-1);
        }
        return solution(jobDifficulty,n,0,d);
    }
    public int solution(int[] jobDifficulty, int n, int i, int d) {
        if(d == 1) {
            int max = 0;
            for (int j = i; j < n; j++) {
                max = Math.max(max, jobDifficulty[j]);
            }
            return max;
        }
        if(dp[i][d] != -1){
            return dp[i][d];
        }
        int max = jobDifficulty[i];
        int ans = Integer.MAX_VALUE;
        for(int j=i;j<=n-d;j++){
            max  = Math.max(max, jobDifficulty[j]);
            int next = max + solution(jobDifficulty, n, j + 1, d - 1);
            ans = Math.min(ans, next);
        }
        return dp[i][d] = ans;
    }
}