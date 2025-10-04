// Last updated: 04/10/2025, 15:53:52
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left<right){
            int mid = (left + right)/2;
            if(nums[mid]>nums[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }
}