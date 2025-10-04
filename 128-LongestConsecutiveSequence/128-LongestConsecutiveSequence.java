// Last updated: 04/10/2025, 15:54:08
class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        int count = 1;
        int max = 1;
        Arrays.sort(nums);
        for(int i = 1;i<n;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}