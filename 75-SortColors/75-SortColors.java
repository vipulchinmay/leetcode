// Last updated: 04/10/2025, 15:54:20
class Solution {
    public void sortColors(int[] nums) {
        int n  =nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    nums[j] = nums[j]+nums[j+1];
                    nums[j+1] = nums[j] - nums[j+1];
                    nums[j] = nums[j] - nums[j+1];
                }
            }
        }
    }
}