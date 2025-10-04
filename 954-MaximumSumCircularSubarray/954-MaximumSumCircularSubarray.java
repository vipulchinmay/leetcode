// Last updated: 04/10/2025, 15:51:44
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int total = 0;
        int max = 0;
        int min = 0;
        int globalM = nums[0];
        int globalMin = nums[0];
        for(int i=0;i<n;i++){
            total+=nums[i];
            max = Math.max(nums[i],max+nums[i]);
            min = Math.min(nums[i],min+nums[i]);
            globalM = Math.max(globalM,max);
            globalMin = Math.min(globalMin,min);
        }
        if(globalM<0){
            return globalM;
        }
        else{
            return Math.max(globalM,total-globalMin);
        }
    }
}