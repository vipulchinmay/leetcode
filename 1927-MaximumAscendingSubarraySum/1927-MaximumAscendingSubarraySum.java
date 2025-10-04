// Last updated: 04/10/2025, 15:50:33
class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int max = 0;
        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
            }
            else{
                max = Math.max(max,sum);
                sum = nums[i];
            }
        }
        max = Math.max(max,sum);
        return max;
    }
}