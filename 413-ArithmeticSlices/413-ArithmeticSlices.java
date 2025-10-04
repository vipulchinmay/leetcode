// Last updated: 04/10/2025, 15:52:58
class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        int count = 0;
        int curr = 0;
        for(int i=2;i<nums.length;i++){
            if(nums[i] - nums[i-1] == nums[i-1] - nums[i-2]){
                curr+=1;
                count+=curr;
            }
            else{
                curr = 0;
            }
        }
        return count;
    }
}