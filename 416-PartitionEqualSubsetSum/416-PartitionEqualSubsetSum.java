// Last updated: 04/10/2025, 15:52:56
import java.util.*;

public class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;

        if (sum % 2 != 0)
            return false;

        int target = sum / 2;
        Boolean[][] memo = new Boolean[nums.length][target + 1];
        return backtrack(nums, 0, target, memo);
    }

    private boolean backtrack(int[] nums, int i, int target, Boolean[][] memo) {
        if (target == 0){
            return true;
        }
        if (i >= nums.length || target < 0){
            return false;
        }
        if (memo[i][target] != null){
            return memo[i][target];
        }
        boolean include = backtrack(nums, i + 1, target - nums[i], memo);
        boolean exclude = backtrack(nums, i + 1, target, memo);

        memo[i][target] = include || exclude;
        return memo[i][target];
    }
}
