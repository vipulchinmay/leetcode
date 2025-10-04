// Last updated: 04/10/2025, 15:52:14
class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            max = Math.max(max, num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int points[] = new int[max + 1];
        for(int n : map.keySet()) {
            points[n] = n * map.get(n);
        }
        int dp[] = new int[max + 1];
        dp[0] = 0;
        dp[1] = points[1];
        for (int i = 2; i <= max; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + points[i]);
        }
        return dp[max];
    }
}