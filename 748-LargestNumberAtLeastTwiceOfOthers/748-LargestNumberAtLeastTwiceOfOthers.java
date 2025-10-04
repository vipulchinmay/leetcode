// Last updated: 04/10/2025, 15:52:10
class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int k = 0;
        int l = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]>l){
                l = nums[i];
                k = i;
            }
        }
        for(int j=0;j<n;j++){
            if(j!=k && l<(2*nums[j])){
                return -1;
            }
        }
        return k;
    }
}