// Last updated: 04/10/2025, 15:53:24
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        for(int i=n-1;i>=0;i--){
            if(count == k){
                return nums[i];
            }
            count++;
        }
        return -1;
    }
}