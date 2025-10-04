// Last updated: 04/10/2025, 15:52:41
class Solution {
    int possibilities = 0;
    public int findTargetSumWays(int[] nums, int target) {
        calculate(0,0,nums,target);
        return possibilities;
    }
    public void calculate(int start,int sum,int[] nums,int target){
        if(start == nums.length){
            if(sum == target){
                possibilities++;
            }
            return;
        }
        calculate(start+1,sum+nums[start],nums,target);
        calculate(start+1,sum-nums[start],nums,target);
    }
}