// Last updated: 04/10/2025, 15:53:00
class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer[] dp = new Integer[target+1];
        return backtrack(nums,target,dp);
    }
    public int backtrack(int[] nums,int target,Integer[] dp){
        if(target == 0){
            return 1;
        }
        if( target<0){
            return 0;
        }
        if(dp[target]!=null){
            return dp[target];
        }
        int result = 0;
        for(int i=0;i<nums.length;i++){
            int ti = backtrack(nums,target-nums[i],dp);
            result+=ti;
        }
        // int ti = backtrack(0,nums,target-nums[idx]);
        // int ri = backtrack(idx+1,nums,target);
        // return ti + ri;
        dp[target] = result;
        return result;
    }
}