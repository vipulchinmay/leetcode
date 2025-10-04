// Last updated: 04/10/2025, 15:53:29
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int length = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                length = Math.min(length,i-left+1);
                sum-=nums[left];
                left++;
            }
        }   
        return length == Integer.MAX_VALUE ?0:length;
    }
}