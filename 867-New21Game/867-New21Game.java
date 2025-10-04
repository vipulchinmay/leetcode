// Last updated: 04/10/2025, 15:51:54
class Solution {
    public double new21Game(int n, int k, int maxPts) {
        if(k == 0 || n>=k+maxPts-1){
            return 1.0;
        }
        double[] dp = new double[n + 1];
        dp[0] = 1.0;
        double windowSum = 1.0; 
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            dp[i] = windowSum / maxPts;
            if (i<k){
                windowSum += dp[i]; 
            } else {
                result += dp[i]; // game stops
            }
            if(i - maxPts >= 0) {
                windowSum -= dp[ i - maxPts];
            }
        }
        return result;
    }
}