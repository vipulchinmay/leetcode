// Last updated: 04/10/2025, 15:52:17
class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int rsum = 0;
        int lsum = 0;
        for(int i:nums){
            rsum+=i;
        }
        for(int i=0;i<n;i++){
            rsum-=nums[i];
            if(rsum == lsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }
}
            