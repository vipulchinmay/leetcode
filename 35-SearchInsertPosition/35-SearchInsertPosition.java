// Last updated: 04/10/2025, 15:54:50
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target>nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
}