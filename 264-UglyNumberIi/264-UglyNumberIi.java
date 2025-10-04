// Last updated: 04/10/2025, 15:53:13
class Solution {
    public int nthUglyNumber(int n) {
        int dp[] = new int[n+1];
        int i2 = 1;
        int i3 = 1;
        int i5 = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = Math.min(dp[i2]*2, Math.min(dp[i3]*3, dp[i5]*5));
            if(dp[i]== dp[i2]*2){
                i2++;
            }
            if(dp[i]== dp[i3]*3){
                i3++;
            }
            if(dp[i]== dp[i5]*5){
                i5++;
            }
        }
        return dp[n];
    }
}