// Last updated: 04/10/2025, 15:54:53
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}