// Last updated: 04/10/2025, 15:53:18
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int left[] = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int right = 1;
        for(int i=n-1;i>=0;i--){
            result[i] = left[i]*right;
            right *= nums[i];
        }
        return result;
    }
}