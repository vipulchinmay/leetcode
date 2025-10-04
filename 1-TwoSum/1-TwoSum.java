// Last updated: 04/10/2025, 15:55:25
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int i1=0;
        int i2=0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                int c = target-nums[i];
                if(nums[j]==c){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
    }
}