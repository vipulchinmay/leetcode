// Last updated: 04/10/2025, 15:53:57
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];  
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int product = 1;
            dp[i] = nums[i];  
            for (int j = i; j < n; j++) {
                product *= nums[j];
                dp[i] = Math.max(dp[i], product);
            }
            max = Math.max(max, dp[i]);
        }

        return max;
    }
}
