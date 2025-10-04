// Last updated: 04/10/2025, 15:50:30
class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int preSum[] = new int[stones.length];
        int sum = 0;
        for(int i=0;i<stones.length;i++){
            sum+=stones[i];
            preSum[i] = sum; 
        }
        int dp[] = new int[stones.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[n-2] = preSum[n-1];
        for(int i=n-3;i>=0;i--){
            dp[i] = Math.max(preSum[i+1]-dp[i+1],dp[i+1]);
        }
        return dp[0];
    }
}