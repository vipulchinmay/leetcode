// Last updated: 04/10/2025, 15:54:32
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<i){
                return false;
            }
            max = Math.max(max, i+nums[i]);
        }
        return true;
    }
}