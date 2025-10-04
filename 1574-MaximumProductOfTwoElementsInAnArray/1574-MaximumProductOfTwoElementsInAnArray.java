// Last updated: 04/10/2025, 15:50:54
class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            int prod =0;
            int m = 0;
            for(int j=i+1;j<nums.length;j++){
                m = (nums[i] - 1) * (nums[j]-1);
                prod = Math.max(prod,m);
            }
            max = Math.max(max,prod);
        }
        return max;
    }
}